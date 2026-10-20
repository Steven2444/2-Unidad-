public class Main {
    public static void main(String[] args) {
        Libro[] libros = {
            new Libro("Cien años de soledad", "Garcia Marquez", true),
            new Libro("El Principito", "Saint-Exupery", true),
            new Libro("Don Quijote", "Cervantes", true),
            new Libro("Rayuela", "Cortazar", true)
        };
        Socio s1 = new Socio("Juan", 0);
        Socio s2 = new Socio("Laura", 0);

  
        libros[0].disponible = false;
        s1.librosPrestados++;
        libros[1].disponible = false;
        s1.librosPrestados++;
       
        libros[2].disponible = false;
        s2.librosPrestados++;

        int disponibles = 0;
        for (Libro l : libros) {
            System.out.println(l.titulo + " : " + (l.disponible ? "Disponible" : "Prestado"));
            if (l.disponible) disponibles++;
        }
        System.out.println(s1.nombre + " : " + s1.librosPrestados);
        System.out.println(s2.nombre + " : " + s2.librosPrestados);
        System.out.println("Libros disponibles: " + disponibles);
    }
}
