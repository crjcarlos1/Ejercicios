package ejercicio17programacionfuncional.e1;

public class Main {

    public static void main(String... args) {
        /**Expresión lambda sin parámetros*/
        ISaludar saludar = () -> System.out.println("Hola mundo.");
        saludar.Saludar();

        /**Expresión lambda con pará,metros*/
        String nombre = "Juan Carlos";
        ISaludarParametro saludarParametro = (miNombre) -> System.out.println("Hola " + miNombre);
        saludarParametro.saludar(nombre);

        /**Expresión lambda multiples líneas*/
        ISaludarParametro saludar2 = (string) -> {
            if (string.equals("Carlos")) System.out.println("Hola, te llamas carlos");
            else System.out.println("Hola mundo");
        };
        saludar2.saludar("Carlos");

        /**Expresión lambda que retorna valor*/
        ISuma suma = (numero1, numero2) -> {
            return numero1 + numero2;
        };
        System.out.println("1+2="+suma.suma(1,2));

    }

}
