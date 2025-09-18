package ListaLigada;

public class PruebasListasLigadas {
    public static void main(String[] args) {
        ListaLigada<Integer> lista = new ListaLigada<>();

        System.out.println("¿Está vacía?: " + lista.estaVacia());

        System.out.println("\nAgregar al final: 10, 20, 30");
        lista.agregar_al_final(10);
        lista.agregar_al_final(20);
        lista.agregar_al_final(30);
        lista.transversal();

        System.out.println("\nAgregar al inicio: 5");
        lista.agregar_al_inicio(5);
        lista.transversal();

        System.out.println("\nAgregar después de 20 el valor 25");
        boolean agregado = lista.agregar_despues_de(20, 25);
        System.out.println("¿Agregado?: " + agregado);
        lista.transversal();

        System.out.println("\nEliminar en posición 2");
        boolean eliminado = lista.eliminar(2);
        System.out.println("¿Eliminado?: " + eliminado);
        lista.transversal();

        System.out.println("\nEliminar el primero");
        boolean elimPrimero = lista.eliminar_el_primero();
        System.out.println("¿Eliminado?: " + elimPrimero);
        lista.transversal();

        System.out.println("\nEliminar el final");
        boolean elimFinal = lista.eliminar_el_final();
        System.out.println("¿Eliminado?: " + elimFinal);
        lista.transversal();

        System.out.println("\n¿Está vacía?: " + lista.estaVacia());
    }
}
