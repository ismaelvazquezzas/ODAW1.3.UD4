import java.util.Objects;

public class Editorial implements Cloneable {

    protected String nombre;
    protected String cif;

    public Editorial(String nombre, String cif){
        this.nombre = nombre;
        this.cif = cif;
    }

    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{nombre='" + nombre + "', cif='" + cif + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Editorial editorial = (Editorial) o;
        return Objects.equals(cif, editorial.cif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cif);
    }


    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    //cambio


}
