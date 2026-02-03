public class Biblioteca {

    protected String nombre;
    protected Publicacion[] coleccion;
    protected int contPublicacion;

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
        System.out.println("--- Catálogo de la Biblioteca " + this.nombre + " ---");
        for (int i = 0; i < this.contPublicacion; i++) {
            this.coleccion[i].leer();
        }
    }
}
