package ejercicio8Lista;

public class ListaEnlazada {

    private Nodo cabeza;
    private int size;

    public ListaEnlazada() {
        this.cabeza = null;
        this.size = 0;
    }

    public Object obtener(int index) {
        if (cabeza == null) {
            return null;
        } else {
            int count = 0;
            Nodo temporal = cabeza;
            while (count < index) {
                temporal = temporal.obtenerSiguiente();
                count++;
            }
            return temporal.obtenerValor();
        }
    }

    public void eliminar(int index) {
        if (index == 0) {
            cabeza = cabeza.obtenerSiguiente();
        } else {
            int count = 0;
            Nodo temp = cabeza;
            while (count < index - 1) {
                temp = temp.obtenerSiguiente();
                count++;
            }
            temp.enlazarSiguiente(temp.obtenerSiguiente().obtenerSiguiente());
        }
        size--;
    }

    public void cortar(int index){
        int count=0;
        Nodo temporal=cabeza;
        while ( count < index-1 ){
            temporal=temporal.obtenerSiguiente();
            count++;
        }
        temporal.enlazarSiguiente(null);
        size=index;
    }

    public void eliminarPrimero() {
        if (cabeza != null && size > 0) {
            cabeza = cabeza.obtenerSiguiente();
            size--;
        }
    }

    public void addPrimero(Object obj) {
        if (cabeza == null) {
            cabeza = new Nodo(obj);
        } else {
            Nodo temporal = cabeza;
            Nodo nuevoNodo = new Nodo(obj);
            nuevoNodo.enlazarSiguiente(temporal);
            cabeza = nuevoNodo;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

}
