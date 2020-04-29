package ejercicio10Singleton;

public class Main {

    public static void main(String...args){
        MySingleton singleton1=MySingleton.getInstance();
        MySingleton singleton2=MySingleton.getInstance();

        singleton1.setMessage("Mensaje 1");
        singleton2.setMessage("Mensaje 2");

        System.out.println("Mensaje: "+singleton1.getMessage());

    }

}
