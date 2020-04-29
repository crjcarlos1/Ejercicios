package ejercicio12Observador.motor;

import java.util.ArrayList;

public class Acelerador implements SujetoObservable {

    private ArrayList<Observador> observadores;

    public Acelerador() {
        this.observadores = new ArrayList<>();
    }

    public void enlazarObservador(Observador oi) {
        observadores.add(oi);
    }

    public void acelerar(){
        notificar();
    }

    @Override
    public void notificar() {
        for (Observador o:observadores) {
            o.update();
        }
    }
}
