package Biblioteca;

import java.util.Scanner;

public class Main {
    public static BibliotecaController bibliotecaController;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        bibliotecaController = new BibliotecaController(scanner);
        bibliotecaController.agregarLibros();

        System.out.println("Bienvenido a la Biblioteca Municipal");
        mostrarLibros();

        System.out.println("Seleccione el número del libro que desea prestar:");
        int opcion = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (opcion > 0 && opcion <= BibliotecaController.libros.size()) {
            bibliotecaController.realizarPrestamo(opcion - 1);
        } else {
            System.out.println("Este libro no está disponible en inventario. Escríbenos para más información.");
        }
    }

    public static void mostrarLibros() {
        for (int i = 0; i < BibliotecaController.libros.size(); i++) {
            Libro libro = BibliotecaController.libros.get(i);
            System.out.println((i + 1) + ".- " + libro.getTitulo() + " - " + (libro.getDisponible() ? "Disponible" : "No Disponible"));
        }
    }
}
