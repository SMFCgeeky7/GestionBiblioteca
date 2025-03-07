package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaController {
    public Scanner scanner;
    public static ArrayList<Libro> libros = new ArrayList<>();

    public BibliotecaController(Scanner scanner) {
        this.scanner = scanner;
    }

    public void agregarLibros() {
        libros.add(new Libro("Viaje al centro de la tierra", "Julio Verne", "888999000", true));
        libros.add(new Libro("El Gran Gatsby", "F. Scott Fitzgerald", "888999111", true));
        libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "888999222", true));
        libros.add(new Libro("1984", "George Orwell", "888999333", false));
        libros.add(new Libro("Orgullo y prejuicio", "Jane Austen", "888999444", false));
    }

    public void realizarPrestamo(int indice) {
        Libro libro = libros.get(indice);

        if (!libro.getDisponible()) {
            System.out.println("Este libro no está disponible para préstamo.");
        } else {
            System.out.println("\nPor favor, ingrese su nombre completo:");
            String nombre = scanner.nextLine();
            libro.setDisponible(false);
            System.out.println(libro.getTitulo() + " ha sido prestado a " + nombre);
        }
    }
}

