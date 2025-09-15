package PROFEADT;
import java.util.ArrayList;

public class ADT<T> {
    public ArrayList<T> data;

    public ADT() {
        data = new ArrayList<>();
    }

    public int longitud() {
        return data.size();
    }

    public void agregar(T elemento) {
        if (!this.contiene(elemento)) {
            data.add(elemento);
        }
    }

    public boolean contiene(T elemento) {
        return data.contains(elemento);
    }

    public void eliminar(T elemento) {
        data.remove(elemento);
    }

    public String toString() {
        String resultado = "";
        for (T t : data) {
            resultado += "," + t.toString();
        }
        return resultado;
    }

    
    public boolean estaVacio() {
        return data.isEmpty();
    }

   
    public void vaciar() {
        data.clear();
    }


    public ADT<T> union(ADT<T> otro) {
        ADT<T> resultado = new ADT<>();
        
        for (T elemento : this.data) {
            resultado.agregar(elemento);
        }
        
        for (T elemento : otro.data) {
            resultado.agregar(elemento);
        }
        return resultado;
    }

    
    public ADT<T> interseccion(ADT<T> otro) {
        ADT<T> resultado = new ADT<>();
        for (T elemento : this.data) {
            if (otro.contiene(elemento)) {
                resultado.agregar(elemento);
            }
        }
        return resultado;
    }

    
    public ADT<T> diferencia(ADT<T> otro) {
        ADT<T> resultado = new ADT<>();
        for (T elemento : this.data) {
            if (!otro.contiene(elemento)) {
                resultado.agregar(elemento);
            }
        }
        return resultado;
    }

    
    public boolean esIgual(ADT<T> otro) {
        if (this.longitud() != otro.longitud()) {
            return false;
        }
        for (T elemento : this.data) {
            if (!otro.contiene(elemento)) {
                return false;
            }
        }
        return true;
    }
}