package ejercicio4Threads;

public class Hilo implements Runnable {

    private String nombre;
    private Thread thread;

    public Hilo(String nombre) {
        this.nombre = nombre;
        thread=new Thread(this,this.nombre);
        thread.start();
    }

    @Override
    public void run() {
        for (int i=0;i<200;i++){
            System.out.println(nombre+" - valor: "+i);
        }
    }

}
