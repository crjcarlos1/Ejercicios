package ejercicio17programacionfuncional.e3;

public class Libro {
    private String titulo;
    private int copias;

    public Libro(String titulo, int copias) {
        this.titulo = titulo;
        this.copias = copias;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    @Override
    public String toString() {
        return this.titulo+" ";
    }
}
