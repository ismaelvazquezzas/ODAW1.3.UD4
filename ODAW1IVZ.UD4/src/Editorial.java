public class Editorial {

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
}
