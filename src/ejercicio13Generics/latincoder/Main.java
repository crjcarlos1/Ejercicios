package ejercicio13Generics.latincoder;

import java.util.LinkedList;

public class Main {

    public static void main(String... args) {
        example1();
        example2();
    }

    private static void example1() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hola que tal");
        String text = list.getFirst();
        System.out.println(text);
    }

    private static void example2(){
        Element<Integer> element=new Element<>();
        element.setDato(9);
        System.out.println("Elemento: "+element.getDato());
    }

}
