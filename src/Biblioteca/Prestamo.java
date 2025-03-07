package Biblioteca;

public class Prestamo {
    private Libro libro;
    private String nombreUsuario;
    private String fechaPrestamo;

    public Prestamo(Libro libro, String nombreUsuario, String fechaPrestamo) {
        this.libro = libro;
        this.nombreUsuario = nombreUsuario;
        this.fechaPrestamo = fechaPrestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void mostrarPrestamo() {
        System.out.println("Libro: " + libro.getTitulo() + ", Prestado a: " + nombreUsuario + ", Fecha de Préstamo: " + fechaPrestamo);
    }
}
