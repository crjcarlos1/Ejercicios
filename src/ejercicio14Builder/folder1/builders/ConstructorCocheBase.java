package ejercicio14Builder.folder1.builders;

public class ConstructorCocheBase extends BuilderCoche {

    public ConstructorCocheBase() {
    }

    @Override
    public void construirMotor() {
        this.coche.setMotor("Motor potencia mínima");
    }

    @Override
    public void construirCarroceria() {
        this.coche.setCarroceria("Carrocería baja");
    }

    @Override
    public void construirAireAcondicionado() {
        this.coche.setAireAcond(false);
    }

    @Override
    public void construirElevaLunas() {
        this.coche.setElevalunasElec(false);
    }
}
