package ejercicio15Decorador.latincoder.features;

import ejercicio15Decorador.latincoder.decorador.AutomovilDecorador;
import ejercicio15Decorador.latincoder.interfaces.Automovil;

public class AutoElectricoFeature extends AutomovilDecorador {

    public AutoElectricoFeature(Automovil automovil) {
        super(automovil);
    }

    @Override
    public void accel() {
        System.out.println("Acelerando de forma electrica");
        getAutomovil().accel();
    }

    @Override
    public void stop() {
        System.out.println("Frenando de forma electrica");
        getAutomovil().stop();
    }

    @Override
    public void start() {
        System.out.println("empezando de forma electrica");
        getAutomovil().start();
    }

}
