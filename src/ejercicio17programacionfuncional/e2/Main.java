package ejercicio17programacionfuncional.e2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String... args) {
        lambdaPromedioArreglo();
        lambdaFactorial();
        lambdaEsPar();
        lambdaNumeroMayor();
        lambdaNumeroMenor();
        lambdaNumeroMasRepetido();
        numeroMasGrande();
        lambdaCadena();
    }

    private static void lambdaCadena(){
        IMultiplicaCadena multiplicaCadena= (a,string) -> {
            String result="";
            for (int i=1;i<=a;i++){
                result=result+string;
            }
            return result;
        };
        System.out.println(multiplicaCadena.multiplicaCadena(3,"a"));
    }

    private static void numeroMasGrande(){
        IMasGrande masGrande= (a,b,c) -> {
            int mayor=c;

            if (a>b && a >c)
                mayor=a;
            else if (b>a && b>c)
                mayor=b;
            return mayor;
        };
        System.out.println("mas grande(4,2,1): "+masGrande.masGrande(4,2,1));
    }

    private static void lambdaNumeroMasRepetido() {
        INumeroMasRepetido numeroMasRepetido = () -> {
            List<Integer> numeros = Arrays.asList(0, 5, 6, 7, -100, 9, 2, 3, 4, 5, 4, 4, 8, 1, 4);

            int count = 1, tempCount;
            int popular = numeros.get(0);
            int temp = 0;
            for (int i = 0; i < (numeros.size() - 1); i++) {
                temp = numeros.get(i);
                tempCount = 0;
                for (int j = 1; j < numeros.size(); j++) {
                    if (temp == numeros.get(j))
                        tempCount++;
                }
                if (tempCount > count) {
                    popular = temp;
                    count = tempCount;
                }
            }
            return popular;
        };
        System.out.println("El mas popular de la lista es: "+numeroMasRepetido.numeroMasRepetido());
    }

    private static void lambdaNumeroMenor() {
        INumeroMenor numeroMenor = () -> {
            List<Integer> numeros = Arrays.asList(0, 5, 6, 7, -100, 9, 2, 3, 4, 8, 1);
            int minimo = numeros.get(0);
            for (Integer numero : numeros) {
                if (minimo > numero)
                    minimo = numero;
            }
            return minimo;
        };
        System.out.println("El número menor de la lista (0, 5, 6, 7, 1, 9, 2, 3, 4, 8, 1) es " + numeroMenor.obtenerNumeroMenor());
    }

    private static void lambdaNumeroMayor() {
        INumeroMayor numeroMayor = () -> {
            List<Integer> numeros = Arrays.asList(0, 5, 6, 7, 100, 9, 2, 3, 4, 8, 1);
            int maximo = numeros.get(0);
            for (Integer numero : numeros) {
                if (maximo < numero)
                    maximo = numero;
            }
            return maximo;
        };
        System.out.println("El número mayor de la lista (0, 5, 6, 7, 1, 9, 2, 3, 4, 8, 1) es " + numeroMayor.obtenerNumeroMayor());
    }

    private static void lambdaEsPar() {
        IEsPar esPar = (n) -> n % 2 == 0;
        System.out.println("270 es par? " + esPar.esPar(270));
    }

    private static void lambdaFactorial() {
        IFactorial factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result *= i;
            return result;
        };
        System.out.println("Factorial 5 es " + factorial.factorial(5));
    }

    private static void lambdaPromedioArreglo() {
        IPromedioArreglo promedioArreglo = () -> {
            List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
            int suma = 0;
            for (Integer n : lista) {
                suma += n;
            }
            return suma / lista.size();
        };
        System.out.println("Promedio -> 1,2,3,4,5 es " + promedioArreglo.promedio());
    }

}
