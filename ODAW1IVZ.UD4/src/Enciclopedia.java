import java.time.LocalDate;
import java.util.Objects;

public class Enciclopedia extends Publicacion{

    private int numVol;

    public Enciclopedia(String titulo, LocalDate fechaPublicacion, int numVol, Editorial editorial){
        super(titulo, fechaPublicacion, editorial);
        this.numVol = numVol;
    }

    public int getNumVol() {
        return numVol;
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

    public void setNumVol(int numVol) {
        this.numVol = numVol;
    }

    @Override
    public void setEditorial(Editorial editorial) {
        super.setEditorial(editorial);
    }

    @Override
    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        super.setFechaPublicacion(fechaPublicacion);
    }

    @Override
    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Enciclopedia{vols= " + numVol + "}";
    }

    @Override
    public void leer() {
        StringBuilder vols = new StringBuilder("[");
        for (int i = 1; i <= this.numVol; i++) {
            vols.append(i);
            if (i < this.numVol) {
                vols.append(",");
            }
        }
        vols.append("]");

        System.out.println("Estamos leyendo la enciclopedia: " + getTitulo() +
                ", fecha de publicación " + getFechaPublicacion() +
                " y volumenes: " + vols.toString());
    }
    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Enciclopedia that = (Enciclopedia) o;
        return numVol == that.numVol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numVol);
    }
}

