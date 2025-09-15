package PROFEADT;

public class Prueba {
    public static void main(String[] args) {
        
        // Crear dos conjuntos
        ADT<Integer> conjunto1 = new ADT<>();
        ADT<Integer> conjunto2 = new ADT<>();

        // Agregar elementos al primer conjunto
        conjunto1.agregar(1);
        conjunto1.agregar(2);
        conjunto1.agregar(3);

        // Agregar elementos al segundo conjunto
        conjunto2.agregar(3);
        conjunto2.agregar(4);
        conjunto2.agregar(5);

        // Mostrar conjuntos
        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);

        // Unión
        ADT<Integer> union = conjunto1.union(conjunto2);
        System.out.println("Unión: " + union);

        // Intersección
        ADT<Integer> interseccion = conjunto1.interseccion(conjunto2);
        System.out.println("Intersección: " + interseccion);

        // Diferencia
        ADT<Integer> diferencia = conjunto1.diferencia(conjunto2);
        System.out.println("Diferencia (Conjunto1 - Conjunto2): " + diferencia);

        // Igualdad
        System.out.println("¿Conjunto1 es igual a Conjunto2?: " + conjunto1.esIgual(conjunto2));

        // Eliminar un elemento
        conjunto1.eliminar(2);
        System.out.println("Conjunto1 después de eliminar 2: " + conjunto1);

        // Vaciar conjunto
        conjunto2.vaciar();
        System.out.println("Conjunto2 después de vaciar: " + conjunto2);
        System.out.println("¿Conjunto2 está vacío?: " + conjunto2.estaVacio());
    }
}
