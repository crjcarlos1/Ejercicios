package ejercicio11ClasesAbstractas;

public class Perro extends Animal {

    public Perro() {
        super();
        setName("Pluto");
    }

    @Override
    public void moverse() {
        System.out.println("El perro se mueve en 4 patas");
    }

}
