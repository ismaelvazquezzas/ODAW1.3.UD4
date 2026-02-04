import java.time.LocalDate;
import java.util.Objects;

public class Libro extends Publicacion {

    protected String isbn;
    protected int numPags;

    public Libro(String titulo, LocalDate fechaPublicacion, String isbn, int numPags, Editorial editorial){
        super(titulo, fechaPublicacion, editorial);
        this.isbn = isbn;
        this.numPags = numPags;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNumPags() {
        return numPags;
    }

    @Override
    public Editorial getEditorial() {
        return super.getEditorial();
    }

    @Override
    public LocalDate getFechaPublicacion() {
        return super.getFechaPublicacion();
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    @Override
    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        super.setFechaPublicacion(fechaPublicacion);
    }

    @Override
    public void setEditorial(Editorial editorial) {
        super.setEditorial(editorial);
    }

    @Override
    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }

    @Override
    public void leer() {
        System.out.println("Estamos leyendo el libro: " + getTitulo() +
                ", publicado en " + getFechaPublicacion() +
                ", con ISBN " + this.isbn +
                " y número de páginas " + this.numPags);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Libro{isbn= '" + isbn + "', paginas =" + numPags + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Libro libro = (Libro) o;
        return Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isbn);
    }

    //cambio

}
