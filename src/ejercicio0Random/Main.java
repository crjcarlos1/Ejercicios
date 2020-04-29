package ejercicio0Random;

import ejercicio1Fibonacci.Fibonacci;
import ejercicio2Burbuja.Burbuja;
import ejercicio3Primos.Primos;
import ejercicio4Threads.Hilo;
import ejercicio4Threads.Proceso;
import ejercicio5Tokenizer.Tokenizer_;
import ejercicio6Factorial.Factorial;
import ejercicio7Pila.Pila;
import ejercicio8Lista.ListaEnlazada;
import ejercicio9Regex.MyRegex;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String... args) {
        //fibonacci();
        //burbuja1();
        //numeroPrimo();
        //threads();
        //myThread();
        //tokenizer();
        //factorial();
        //miPila();
        //miLista();
        regex();
    }

    private static void fibonacci() {
        System.out.println("Fibonacci de 13 -> " + Fibonacci.calculaFibonacci(5));
    }

    private static void burbuja1() {
        List<Integer> lista = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0);
        System.out.println(Burbuja.ordenarBurbuja2(lista));
    }

    private static void numeroPrimo() {
        System.out.println("251 -> " + Primos.esPrimo(251));
    }

    private static void threads() {
        Proceso proceso1 = new Proceso("MyProcess");
        proceso1.setMessage("Mensaje del hilo 1");

        Proceso proceso2 = new Proceso("");
        proceso2.setMessage("Mensaje del hilo 2");

        proceso1.start();
        proceso2.start();
    }

    private static void myThread() {
        Hilo hilo = new Hilo("Hilo 1");
        Hilo hilo2 = new Hilo("Hilo 2");
    }

    private static void tokenizer() {
        Tokenizer_.breakString("La casa, esta, en la playa.");
    }

    private static void factorial() {
        System.out.println("5: " + Factorial.facIterativo(5));
        System.out.println("5: " + Factorial.facRecursivo(5));
    }

    private static void miPila() {
        Pila pila = new Pila(5);

        System.out.println("Está vacía? " + pila.empty());

        pila.push("string 1");
        pila.push("string 2");
        pila.push("string 3");

        System.out.println("Está vacía? " + pila.empty());
        System.out.println("peek: " + pila.peek());
        pila.push("string 4");
        System.out.println("peek: " + pila.peek());
        pila.pop();
        System.out.println("peek: " + pila.peek());
    }

    private static void miLista() {
        ListaEnlazada lista=new ListaEnlazada();
        lista.addPrimero("1");
        lista.addPrimero("2");
        lista.addPrimero("3");
        lista.addPrimero("4");
        lista.addPrimero("5");
        lista.addPrimero("6");
        /**cortamos la lista en el index 2*/
        lista.cortar(2);
        System.out.println(lista.obtener(1));
    }

    private static void regex() {
        MyRegex.eveluarRegex();
    }

}
