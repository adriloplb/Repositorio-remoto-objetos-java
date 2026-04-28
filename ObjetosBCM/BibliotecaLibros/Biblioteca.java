package IJ;

import java.util.ArrayList;
import java.util.Objects;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();

    public Biblioteca() {
        Libro libro = new Libro("libro", "adrian", 50, "Resumen", true);
        Libro libro2 = new Libro("otro libro", "adrian2", 70, "Resumen2", true);
        this.libros.add(libro);
        this.libros.add(libro2);
    }

    public String prestar(String titulo) {
        for (Libro libro : this.libros) {
            if (libro.getTitulo() == titulo) {
                libro.setDisponible(false);
                return "Libro prestado";
            }
        }
        return "No se encontro libro";
    }

    public String devolver(String titulo) {
        for (Libro libro : this.libros) {
            if (libro.getTitulo() == titulo) {
                libro.setDisponible(true);
                return "Libro devuelto";
            }
        }
        return "No se encontro libro";
    }

    public void fichaLibro(String titulo) {
        for (Libro libro : this.libros) {
            if (libro.getTitulo() == titulo) {
                System.out.println(libro);
                return;
            }
        }
        System.out.println("No se ha encontrado libro");
    }

}
