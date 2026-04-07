import java.util.Scanner;
import java.util.ArrayList;

void main() {

        Scanner scanner = new Scanner(System.in);


        // ===== BIBLIOTECA =====
        ArrayList<biblioteca> bibliotecaLista = new ArrayList<>();

        biblioteca libro1 = new biblioteca("Anatomía del mal", "Jordi Wild", 320);
        libro1.setResumen("Un análisis psicológico y profundo sobre la naturaleza de la maldad humana a través de los casos criminales más perturbadores y reales de la historia.");

        biblioteca libro2 = new biblioteca("Así es la puta vida", "Jordi Wild", 256);
        libro2.setResumen("Es un bofetón de realidad que cambia el positivismo vacío por una filosofía de resiliencia cruda para aprender a gestionar el fracaso y la incertidumbre.");

        bibliotecaLista.add(libro1);
        bibliotecaLista.add(libro2);

        // Mostrar fichas
        System.out.println("\n--- FICHAS DE LIBROS ---");
        for (biblioteca libro : bibliotecaLista) {
            libro.fichaLibro();
            System.out.println();
        }

        // Préstamos
        libro1.prestar();
        libro1.prestar();
        libro1.devolver();




        // ===== MAQUINA DE CAFÉ =====
        maquinacafe maquinacafe1 = new maquinacafe();
        maquinacafe1.marca = "Krups";
        maquinacafe1.deposito = 1000;
        maquinacafe1.capsulas = 10;

        //Utilizar la cafetera
        maquinacafe1.hacercafe();
        maquinacafe1.hacercafe();
        maquinacafe1.hacercafe();
        maquinacafe1.hacercafe();
        maquinacafe1.hacercafe();
        maquinacafe1.hacercafe();
        maquinacafe1.hacercafe();
        maquinacafe1.hacercafe();
        maquinacafe1.hacercafe();
        maquinacafe1.hacercafe();
        maquinacafe1.hacercafe();

        //Recargar la cafetera
        System.out.print("Escribe la cantidad de agua a recargar: ");
        int cantidadagua = scanner.nextInt();
        maquinacafe1.recargadeposito(cantidadagua);

        System.out.print("Escribe la cantidad de capsulas a añadir: ");
        int numerocapsulas = scanner.nextInt();
        maquinacafe1.recargacapsulas(numerocapsulas);


        // ===== BATALLA MAGOS =====
        batallamagos mago1 = new batallamagos("Horizon", 30);
        batallamagos mago2 = new batallamagos("Alter", 40);

        // Ataques de hechizos
        mago1.lanzarHechizo(mago2);
        mago2.lanzarHechizo(mago1);

        // Meditar
        mago1.meditar();

        // Vivo o muerto
        System.out.println("¿Horizon sigue viva? " + mago1.estaVivo());
        System.out.println("Alter sigue viva? " + mago2.estaVivo());


        scanner.close();
    }



    // ===== CLASE BIBLIOTECA =====
    private static class biblioteca {
        String titulo;
        String autor;
        int paginas;
        String resumen;
        boolean disponible;

        biblioteca(String titulo, String autor, int paginas) {
            this.titulo = titulo;
            this.autor = autor;
            this.paginas = paginas;
            this.resumen = "";
            this.disponible = true;
        }

        String getTitulo() {
            return titulo;
        }

        String getAutor() {
            return autor;
        }

        int getPaginas() {
            return paginas;
        }

        String getResumen() {
            return resumen;
        }

        boolean isDisponible() {
            return disponible;
        }

        void setResumen(String resumen) {
            this.resumen = resumen;
        }

        void setPaginas(int paginas) {
            this.paginas = paginas;
        }

        void prestar() {
            if (disponible) {
                disponible = false;
                System.out.println("El libro \"" + titulo + "\" ha sido prestado.");
            } else {
                System.out.println("El libro \"" + titulo + "\" no está disponible.");
            }
        }

        void devolver() {
            disponible = true;
            System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
        }

        void fichaLibro() {
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Páginas: " + paginas);
            System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
            System.out.println("Resumen: " + resumen);
        }
    }

    // ===== CLASE MAQUINA DE CAFÉ =====
    private static class maquinacafe {
        String marca;
        int deposito;
        int capsulas;

        void hacercafe() {
            if (deposito == 0 && capsulas == 0) {
                System.out.println(marca + ": Faltan agua y cápsulas");
            } else if (deposito == 0) {
                System.out.println(marca + ": El depósito está vacío");
            } else if (capsulas == 0) {
                System.out.println(marca + ": Faltan cápsulas");
            } else {
                System.out.println(marca + ": Se ha preparado un café");
                deposito = deposito - 100;
                capsulas = capsulas - 1;
                System.out.println(marca + ": Deposito actual: " + deposito + "ml | Capsulas: " + capsulas);
            }
        }

        void recargadeposito(int cantidadliquido) {
            System.out.println(marca + ": Recargando " + cantidadliquido + "ml de agua...");
            deposito += cantidadliquido;
            System.out.println("Nivel actual: " + deposito + "ml");
        }

        void recargacapsulas(int cantidadcapsulas) {
            System.out.println(marca + ": Añadiendo " + cantidadcapsulas + " cápsulas...");
            capsulas += cantidadcapsulas;
            System.out.println("Número de cápsulas: " + capsulas);
        }
    }

    // ===== CLASE BATALLA DE MAGOS =====
    private static class batallamagos {
        String nombre;
        int vida;
        int energia;
        int poder;

        private batallamagos(String nom, int poder) {
        this.nombre = nom;
        this.poder = poder;
        this.vida = 100;
        this.energia = 50;
        }

        private void lanzarHechizo(batallamagos atacado) {
            if (energia > 10) {
                energia = energia - 10;
                atacado.vida -= poder;
                System.out.println(nombre + " lanza un hechizo a " + atacado.nombre + " y le hace " + poder + " daño");
            } else {
                System.out.println(nombre + " está agotado y no puede realizar un ataque");
            }
        }

        private void meditar() {
            energia = energia + 20;
            if (energia > 50) {
                energia = 50;
            }
        }

        private boolean estaVivo() {
            return vida > 0;
        }


    }

