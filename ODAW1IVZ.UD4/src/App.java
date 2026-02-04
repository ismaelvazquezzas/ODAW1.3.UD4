import java.time.LocalDate;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Editorial edAnaya = new Editorial("Anaya", "B-11111111");
        Editorial edSantillana = new Editorial("Santillana", "A-22222222");

        Libro libro1 = new Libro("El Quijote", LocalDate.of(1605, 1, 1), "978-123456", 800, edAnaya);
        Libro libro2 = new Libro("Inventando inventos",LocalDate.of(2026, 2, 3),"978-555555",9000, edAnaya);
        Enciclopedia enciclo1 = new Enciclopedia("Enciclopedia Britannica", LocalDate.of(2000, 5, 20), 12, edSantillana);

        Biblioteca miBiblio = new Biblioteca("Biblioteca Municipal");


        System.out.println("Añadiendo el Quijote: " + miBiblio.anadirPublicacion(libro1));
        System.out.println("Añadiendo Inventando inventos: " + miBiblio.anadirPublicacion(libro2));
        System.out.println("Añadiendo Britannica: " + miBiblio.anadirPublicacion(enciclo1));
        System.out.println("Intentando añadir Quijote otra vez (Debe dar false): " + miBiblio.anadirPublicacion(libro1));

        miBiblio.leerPublicaciones();

        System.out.println("\nBuscando 'Inventando inventos'. Posición esperada [1]: " + miBiblio.buscarPublicacion(libro2));

        System.out.println("\nEliminando 'Inventando inventos': " + miBiblio.eliminarPublicacion(libro2));

        System.out.println("\nAñadiendo Inventando inventos: " + miBiblio.anadirPublicacion(libro2));

        miBiblio.leerPublicaciones();

        Biblioteca copiaSeguridad = miBiblio.copyOf();
        System.out.println("\nImprimiendo copia a continuacion");
        copiaSeguridad.leerPublicaciones();

//cambio



    }
}
