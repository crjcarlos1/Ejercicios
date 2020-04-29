package ejercicio14Builder.folder1.builders;

public class ConstructorCocheMedio extends BuilderCoche{

    public ConstructorCocheMedio() {
    }

    @Override
    public void construirMotor() {
        this.coche.setMotor("Motor potencia media");
    }

    @Override
    public void construirCarroceria() {
        this.coche.setCarroceria("Carrocería protección media");
    }

    @Override
    public void construirAireAcondicionado() {
        this.coche.setAireAcond(false);
    }

    @Override
    public void construirElevaLunas() {
        this.coche.setElevalunasElec(true);
    }

}
