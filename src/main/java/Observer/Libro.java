package Observer;

public class Libro {
    private String titulo;
    private String author;
    private String estado;

    public Libro(String titulo, String author, String estado) {
        this.titulo = titulo;
        this.author = author;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAuthor() {
        return author;
    }

    public String getEstado() {
        return estado;
    }
}
