package ejercicio15Decorador.latincoder.decorador;

import ejercicio15Decorador.latincoder.interfaces.Automovil;

public abstract class AutomovilDecorador implements Automovil {

    private Automovil automovil;

    public AutomovilDecorador(Automovil automovil) {
        this.automovil = automovil;
    }

    protected Automovil getAutomovil(){
        return automovil;
    }

}
