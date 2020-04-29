package ejercicio15Decorador.latincoder.models;

import ejercicio15Decorador.latincoder.interfaces.Automovil;

public class CarroEstandar implements Automovil {

    private String nombreCocheEstandar;

    public CarroEstandar(String nombreCocheEstandar) {
        this.nombreCocheEstandar = nombreCocheEstandar;
    }

    @Override
    public void accel() {
        System.out.println("acelerar del automovil estandar");
    }

    @Override
    public void stop() {
        System.out.println("stop del automovil estandar");
    }

    @Override
    public void start() {
        System.out.println(" start del automocilq estandar");
    }
}
