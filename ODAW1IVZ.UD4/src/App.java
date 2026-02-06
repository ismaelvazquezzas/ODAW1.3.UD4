import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Editorial edAnaya = new Editorial("Anaya", "B-11111111");
        Editorial edSantillana = new Editorial("Santillana", "A-22222222");

        Libro libro1 = new Libro("El Quijote", LocalDate.of(1605, 1, 1), "978-123456", 800, edAnaya);
        Libro libro2 = new Libro("Inventando inventos",LocalDate.of(2026, 2, 3),"978-555555",9000, edAnaya);
        Libro libro3 = new Libro("Pincipito",LocalDate.of(2001, 12, 13),"978-758955",150, edAnaya);
        Enciclopedia enciclo1 = new Enciclopedia("Enciclopedia Britannica", LocalDate.of(2000, 5, 20), 12, edSantillana);
        Enciclopedia enciclo2 = new Enciclopedia("Enciclopedia Botánica", LocalDate.of(2005, 6, 10), 9, edSantillana);

        Biblioteca miBiblio = new Biblioteca("Biblioteca Municipal");
        Biblioteca miTeca = new Biblioteca("Biblioteca estatal");


        System.out.println("Añadiendo el Quijote: " + miBiblio.anadirPublicacion(libro1));
        System.out.println("Añadiendo el Quijote (a una bliblioteca distinta): " + miTeca.anadirPublicacion(libro1));
        System.out.println("Añadiendo Principito: " + miTeca.anadirPublicacion(libro3));
        System.out.println("Añadiendo Inventando inventos: " + miBiblio.anadirPublicacion(libro2));
        System.out.println("Añadiendo Britannica: " + miBiblio.anadirPublicacion(enciclo1));
        System.out.println("Añadiendo Botánica: " + miTeca.anadirPublicacion(enciclo2));
        System.out.println("Intentando añadir Quijote otra vez (Debe dar false): " + miBiblio.anadirPublicacion(libro1));


        miBiblio.leerPublicaciones();
        miTeca.leerPublicaciones();


        System.out.println("\nBuscando 'Inventando inventos'. Posición esperada [1]: " + miBiblio.buscarPublicacion(libro2));

        System.out.println("\nEliminando 'Inventando inventos': " + miBiblio.eliminarPublicacion(libro2));

        System.out.println("\nAñadiendo 'Inventando inventos': " + miBiblio.anadirPublicacion(libro2));

        miBiblio.leerPublicaciones();

        Biblioteca copiaSeguridad = miBiblio.copyOf();
        System.out.println("\nImprimiendo copia a continuacion");
        copiaSeguridad.leerPublicaciones();

        System.out.println("\nUtilizando el método equals con la copia de seguridad y la biblioteca de la que ha sido clonada (Debe dar true): " + copiaSeguridad.equals(miBiblio));
        System.out.println("\nUtilizando el método equals con la copia de seguridad y la biblioteca de la que no ha sido clonada (Debe dar false): " + copiaSeguridad.equals(miTeca));

        System.out.println("\nMostrando el hash de 'Principito'" + libro3.hashCode());

        System.out.println("\nUtilizando el método toString de enciclopedia que utiliza a su vez el toString del padre: " + enciclo2);
    }
}
