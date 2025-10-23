package TAREA8;

import java.util.HashMap;
import java.util.Map;


public class DemoHashMap {
    public static void main(String[] args) {

        
        HashMap<String, Libro> biblioteca = new HashMap<>();

       
      
        System.out.println("--- Agregando 10 libros a la biblioteca ---");
        biblioteca.put("978-0321356680", new Libro("978-0321356680", "Effective Java", "Joshua Bloch"));
        biblioteca.put("978-0132350884", new Libro("978-0132350884", "Clean Code", "Robert C. Martin"));
        biblioteca.put("978-0201633610", new Libro("978-0201633610", "Design Patterns", "Erich Gamma et al."));
        biblioteca.put("978-0134685991", new Libro("978-0134685991", "Introduction to Algorithms", "Thomas H. Cormen"));
        biblioteca.put("978-0137081073", new Libro("978-0137081073", "The Pragmatic Programmer", "Andrew Hunt"));
        biblioteca.put("978-0596009205", new Libro("978-0596009205", "Head First Design Patterns", "Eric Freeman"));
        biblioteca.put("978-1934356591", new Libro("978-1934356591", "Spring in Action", "Craig Walls"));
        biblioteca.put("978-0321765723", new Libro("978-0321765723", "Refactoring", "Martin Fowler"));
        biblioteca.put("978-0134757599", new Libro("978-0134757599", "Modern Operating Systems", "Andrew S. Tanenbaum"));
        biblioteca.put("978-0132120696", new Libro("978-0132120696", "Code Complete", "Steve McConnell"));

        System.out.println("¡Se agregaron " + biblioteca.size() + " libros!");
        System.out.println();

        System.out.println("--- Contenido actual del HashMap ---");
       
        for (Map.Entry<String, Libro> entry : biblioteca.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " | Valor: " + entry.getValue());
        }
        System.out.println();

        
        System.out.println("--- Obteniendo dos libros específicos ---");
        String clave1 = "978-0132350884"; 
        String clave2 = "978-0201633610"; 

        Libro libroObtenido1 = biblioteca.get(clave1);
        Libro libroObtenido2 = biblioteca.get(clave2);

        System.out.println("Libro 1 Obtenido (" + clave1 + "): " + libroObtenido1.getTitulo());
        System.out.println("Libro 2 Obtenido (" + clave2 + "): " + libroObtenido2.getTitulo());
        System.out.println();

      
        System.out.println("--- Eliminando dos libros ---");
        String claveEliminar1 = "978-0137081073"; // The Pragmatic Programmer
        String claveEliminar2 = "978-0321765723"; // Refactoring

        Libro libroEliminado1 = biblioteca.remove(claveEliminar1);
        Libro libroEliminado2 = biblioteca.remove(claveEliminar2);

        System.out.println("Se eliminó el libro: " + (libroEliminado1 != null ? libroEliminado1.getTitulo() : "No encontrado"));
        System.out.println("Se eliminó el libro: " + (libroEliminado2 != null ? libroEliminado2.getTitulo() : "No encontrado"));
        System.out.println();

        
        System.out.println("--- Contenido final del HashMap (después de eliminar) ---");
        System.out.println("Total de libros ahora: " + biblioteca.size());
        
        for (Map.Entry<String, Libro> entry : biblioteca.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " | Valor: " + entry.getValue());
        }
    }
}
