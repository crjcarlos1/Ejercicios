package ejercicio11ClasesAbstractas;

public abstract class Animal {

    private String name;

    public Animal() {
    }

    public void comer(){
        System.out.println("El "+name+" est{a comiendo");
    }

    public abstract void moverse();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
