package ejercicio17programacionfuncional.e4;

import ejercicio17programacionfuncional.e3.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String... args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
    }

    private static void ejercicio1() {
        /**Referencia a metodos estaticos*/
        /**Imprimir en consola el cubo de los elementos en la lista*/
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        numeros.stream().map(numero -> Main.calculaCubo(numero)).forEach(numero -> System.out.print(numero + " "));
        System.out.println();
        numeros.stream().map(Main::calculaCubo).forEach(numero -> System.out.print(numero + " "));
    }

    private static void ejercicio2() {
        System.out.println();
        /**Referencia a metodos de instancia*/
        /**Imprimir en consola el cubo de los elementos de la lista*/
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        Calculadora calculadora = new Calculadora();
        numeros.stream().map(calculadora::calculaCubo).forEach(numero -> System.out.print(numero + " "));
        System.out.println();
    }

    private static void ejercicio3() {
        System.out.println();
        /**Referencia a metodos de instancia de forma arbitraria*/
        /**imprimir en consola el nombre de todos los usuarios*/
        List<User> users = new ArrayList<>();
        users.add(new User("user 1", 1));
        users.add(new User("user 2", 2));
        users.add(new User("user 3", 3));
        users.add(new User("user 4", 4));
        users.add(new User("user 5", 5));

        users.stream().map(user -> user.getUsername()).forEach(userName -> System.out.print(userName + " "));
        System.out.println();
        users.stream().map(User::getUsername).forEach(username -> System.out.print(username + " "));
    }

    private static void ejercicio4(){
        System.out.println();
        /**referencia a un constructor*/
        /**generar nuevos usuarios e imprimir en consola el nombre de cada uno de ellos*/
        List<User> users=new ArrayList<>();

        /**creamos usuarios utilizando la interface*/
        IUser user=User::new;
        User user1=user.createUser("user 1",1);
        User user2=user.createUser("user 2",2);
        User user3=user.createUser("user 3",3);

        /**agregamos usuarios a la lista*/
        users.add(user1);
        users.add(user2);
        users.add(user3);

        users.stream().map(User::getUsername).forEach(nombre-> System.out.print(nombre+" "));

    }

    private static int calculaCubo(int n) {
        return n * n * n;
    }

}
