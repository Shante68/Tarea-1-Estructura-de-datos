package PROFEADT;

public class Prueba {
    public static void main(String[] args) {
        
        
        ADT<Integer> conjunto1 = new ADT<>();
        ADT<Integer> conjunto2 = new ADT<>();

   
        conjunto1.agregar(1);
        conjunto1.agregar(2);
        conjunto1.agregar(3);

     
        conjunto2.agregar(3);
        conjunto2.agregar(4);
        conjunto2.agregar(5);

      
        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);

     
        ADT<Integer> union = conjunto1.union(conjunto2);
        System.out.println("Unión: " + union);

     
        ADT<Integer> interseccion = conjunto1.interseccion(conjunto2);
        System.out.println("Intersección: " + interseccion);

        ADT<Integer> diferencia = conjunto1.diferencia(conjunto2);
        System.out.println("Diferencia (Conjunto1 - Conjunto2): " + diferencia);

      
        System.out.println("¿Conjunto1 es igual a Conjunto2?: " + conjunto1.esIgual(conjunto2));

        
        conjunto1.eliminar(2);
        System.out.println("Conjunto1 después de eliminar 2: " + conjunto1);

        conjunto2.vaciar();
        System.out.println("Conjunto2 después de vaciar: " + conjunto2);
        System.out.println("¿Conjunto2 está vacío?: " + conjunto2.estaVacio());
    }
}

