import java.util.Objects;

public class Biblioteca implements Cloneable {

    private String nombre;
    private Publicacion[] coleccion;
    private int contPublicacion;

    public Biblioteca(String nombre){
        this.nombre = nombre;
        this.coleccion = new Publicacion[20];
        this.contPublicacion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getContPublicacion() {
        return contPublicacion;
    }

    public Publicacion[] getColeccion() {
        return coleccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColeccion(Publicacion[] coleccion) {
        this.coleccion = coleccion;
    }

    public void setContPublicacion(int contPublicacion) {
        this.contPublicacion = contPublicacion;
    }

    public int buscarPublicacion(Publicacion p) {
        for (int i = 0; i < this.contPublicacion; i++) {
            if (this.coleccion[i].getTitulo().equals(p.getTitulo())) {
                return i;
            }
        }
        return -1;
    }

    public boolean anadirPublicacion(Publicacion p) {
        if (this.contPublicacion >= this.coleccion.length) {
            return false;
        }
        if (buscarPublicacion(p) != -1) {
            return false;
        }
        this.coleccion[this.contPublicacion] = p;
        this.contPublicacion++;
        return true;
    }

    public boolean eliminarPublicacion(Publicacion p) {
        int posicion = buscarPublicacion(p);
        if (posicion == -1) {
            return false;
        }
        for (int i = posicion; i < this.contPublicacion - 1; i++) {
            this.coleccion[i] = this.coleccion[i + 1];
        }
        this.coleccion[this.contPublicacion - 1] = null;
        this.contPublicacion--;
        return true;
    }

    public void leerPublicaciones() {
        System.out.println("\n--- Catálogo de la Biblioteca " + this.nombre + " ---");
        for (int i = 0; i < this.contPublicacion; i++) {
            this.coleccion[i].leer();
        }
    }

    public Biblioteca copyOf() {
        try {
            Biblioteca copia = (Biblioteca) super.clone();

            copia.coleccion = new Publicacion[20];

            for (int i = 0; i < this.contPublicacion; i++) {
                copia.coleccion[i] = (Publicacion) this.coleccion[i].clone();
            }

            copia.contPublicacion = this.contPublicacion;

            return copia;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Biblioteca{nombre= '" + nombre + "', cantidad= " + contPublicacion + "}";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
