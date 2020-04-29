package ejercicio4Threads;

public class Proceso extends Thread {

    private String message;

    public Proceso(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        super.run();
        for (int i=0;i<15;i++)
            System.out.println("Mensaje: "+message);
        System.out.println("Fin del hilo");
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
