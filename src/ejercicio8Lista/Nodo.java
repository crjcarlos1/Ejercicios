package ejercicio8Lista;

public class Nodo {

    private Object valor;
    private Nodo siguiente;

    public Nodo(Object valor) {
        this.valor = valor;
        this.siguiente=null;
    }

    public void enlazarSiguiente(Nodo nodo){
        siguiente=nodo;
    }

    public Object obtenerValor(){
        return valor;
    }

    public Nodo obtenerSiguiente(){
        return siguiente;
    }
}
