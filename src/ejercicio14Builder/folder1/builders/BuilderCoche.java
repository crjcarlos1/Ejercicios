package ejercicio14Builder.folder1.builders;

import ejercicio14Builder.folder1.models.Coche;

public abstract class BuilderCoche {

    protected Coche coche;

    public Coche getCoche() {
        return coche;
    }

    public void crearNuevoCoche(){
        this.coche=new Coche();
    }

    /**Métodos que deberan ser construidos  por las clases que hereden de esta*/
    public abstract void construirMotor();
    public abstract void construirCarroceria();
    public abstract void construirAireAcondicionado();
    public abstract void construirElevaLunas();

}
