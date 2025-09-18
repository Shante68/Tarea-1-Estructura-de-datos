package ListaLigada;

public class ListaLigada<T> {
    private Nodo<T> head;

    public ListaLigada() {
        head = null;
    }

    public boolean estaVacia() {
        return head == null;
    }

    // agregar_al_final
    public void agregar_al_final(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (head == null) {
            head = nuevo;
        } else {
            Nodo<T> temp = head;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);
        }
    }

    // agregar_al_inicio
    public void agregar_al_inicio(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        nuevo.setSiguiente(head);
        head = nuevo;
    }

    // agregar_después_de
    public boolean agregar_despues_de(T referencia, T valor) {
        Nodo<T> temp = head;
        while (temp != null && !temp.getDato().equals(referencia)) {
            temp = temp.getSiguiente();
        }
        if (temp != null) {
            Nodo<T> nuevo = new Nodo<>(valor);
            nuevo.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(nuevo);
            return true;
        }
        return false;
    }

    // eliminar
    public boolean eliminar(int posicion) {
        if (head == null || posicion < 0) return false;
        if (posicion == 0) {
            head = head.getSiguiente();
            return true;
        }
        Nodo<T> temp = head;
        for (int i = 0; i < posicion - 1 && temp.getSiguiente() != null; i++) {
            temp = temp.getSiguiente();
        }
        if (temp.getSiguiente() != null) {
            temp.setSiguiente(temp.getSiguiente().getSiguiente());
            return true;
        }
        return false;
    }

    // eliminar_el_primero
    public boolean eliminar_el_primero() {
        if (head == null) return false;
        head = head.getSiguiente();
        return true;
    }

    // eliminar_el_final
    public boolean eliminar_el_final() {
        if (head == null) return false;
        if (head.getSiguiente() == null) {
            head = null;
            return true;
        }
        Nodo<T> temp = head;
        while (temp.getSiguiente().getSiguiente() != null) {
            temp = temp.getSiguiente();
        }
        temp.setSiguiente(null);
        return true;
    }

    public void transversal() {
        Nodo<T> temp = head;
        while (temp != null) {
            System.out.print(temp.getDato() + " -> ");
            temp = temp.getSiguiente();
        }
        System.out.println("null");
    }
}

class Nodo<T> {
    private T dato;
    private Nodo<T> siguiente;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}
