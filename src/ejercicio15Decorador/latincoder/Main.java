package ejercicio15Decorador.latincoder;

import ejercicio15Decorador.latincoder.features.AutoElectricoFeature;
import ejercicio15Decorador.latincoder.interfaces.Automovil;
import ejercicio15Decorador.latincoder.models.CarroEstandar;

public class Main {

    public static void main(String...args){
        Automovil carroEstandar=new CarroEstandar("");
        carroEstandar=new AutoElectricoFeature(carroEstandar);
        carroEstandar.start();
        carroEstandar.accel();
        carroEstandar.stop();
    }
}
