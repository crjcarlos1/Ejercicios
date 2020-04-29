package ejercicio14Builder.folder1.builders;

public class ConstructorCocheFull extends BuilderCoche {

    public ConstructorCocheFull() {
    }

    @Override
    public void construirMotor() {
        this.coche.setMotor("Motor de potencia alta");
    }

    @Override
    public void construirCarroceria() {
        this.coche.setCarroceria("Carrocería de alta protección");
    }

    @Override
    public void construirAireAcondicionado() {
        this.coche.setAireAcond(true);
    }

    @Override
    public void construirElevaLunas() {
        this.coche.setElevalunasElec(true);
    }

}
