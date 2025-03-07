package Biblioteca;

public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private Boolean disponible;

    public Libro(String titulo, String autor, String isbn, Boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public void mostrarInfo() {
        System.out.println(this.titulo + " - " + this.autor + " - " + this.isbn + " - " + (this.disponible ? "Disponible" : "No Disponible"));
    }
}
