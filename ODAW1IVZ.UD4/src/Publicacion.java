import java.time.LocalDate;

public class Publicacion {

    protected String titulo;
    protected LocalDate fechaPublicacion;
    protected Editorial editorial;

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
        System.out.println("Estamos leyendo la publicación: " + this.titulo +
                ", publicada en " + this.fechaPublicacion);
    }
}
