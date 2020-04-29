package ejercicio12Observador.motor;

public class Main {

    public static void main(String...args){

        Motor motor=new Motor();
        Acelerador acelerador=new Acelerador();

        acelerador.enlazarObservador(motor);
        acelerador.acelerar();
    }

}
