package IJ;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private String resumen;
    private boolean disponible;

    public Libro(String titulo, String autor, int paginas, String resumen, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.resumen = resumen;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return this.titulo;
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

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + paginas + ", Resumen: " + resumen;
    }
}
