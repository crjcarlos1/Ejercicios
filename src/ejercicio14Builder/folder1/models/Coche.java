package ejercicio14Builder.folder1.models;

public class Coche {

    private String motor = "";
    private String carroceria = "";
    private boolean elevalunasElec = false;
    private boolean aireAcond = false;

    public Coche() {
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public boolean isElevalunasElec() {
        return elevalunasElec;
    }

    public void setElevalunasElec(boolean elevalunasElec) {
        this.elevalunasElec = elevalunasElec;
    }

    public boolean isAireAcond() {
        return aireAcond;
    }

    public void setAireAcond(boolean aireAcond) {
        this.aireAcond = aireAcond;
    }
}
