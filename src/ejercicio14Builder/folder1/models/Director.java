package ejercicio14Builder.folder1.models;

import ejercicio14Builder.folder1.builders.BuilderCoche;

public class Director {

    public Director() {
    }

    public void construir(BuilderCoche builderCoche){
        builderCoche.crearNuevoCoche();
        builderCoche.construirMotor();
        builderCoche.construirCarroceria();
        builderCoche.construirAireAcondicionado();
        builderCoche.construirElevaLunas();
    }

}
