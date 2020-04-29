package ejercicio13Generics.latincoder;

public class Element<T> {

    private T dato;

    public Element() {
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
}
