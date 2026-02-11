import java.time.LocalDate;
import java.util.Objects;

public class Publicacion implements Cloneable {

    private String titulo;
    private LocalDate fechaPublicacion;
    private Editorial editorial;

    public Publicacion(String titulo, LocalDate fechaPublicacion, Editorial editorial){
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void leer() {
        System.out.println("Estamos leyendo la publicación: " + this.titulo + ", publicada en " + this.fechaPublicacion);
    }
    @Override
    public String toString() {
        return "Publicación {titulo= '" + titulo + "', fecha= " + fechaPublicacion + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publicacion that = (Publicacion) o;
        return Objects.equals(titulo, that.titulo) &&
                Objects.equals(editorial, that.editorial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, editorial);
    }

    @Override
    public Object clone() {
        try {
            Publicacion clon = (Publicacion) super.clone();
            if (this.editorial != null) {
                clon.editorial = (Editorial) this.editorial.clone();
            }
            return clon;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }









}
