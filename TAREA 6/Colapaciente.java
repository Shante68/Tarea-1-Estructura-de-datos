package TAREA6 ;
// Archivo: ColaPacientes.java
import java.util.LinkedList;
import java.util.Queue;

public class Colapaciente {
    
    private Queue<Paciente> fila = new LinkedList<>();

    // 1. Añade un paciente al final
    public void registrarLlegada(Paciente p) {
        fila.add(p);
        System.out.println("LLEGADA: " + p.getNombre() + " se ha formado.");
    }

    // 2. Saca al primero y muestra sus datos
    public void atenderSiguiente() {
        if (estaVacia()) {
            System.out.println("AVISO: No hay pacientes en la cola.");
            return;
        }
        Paciente atendido = fila.poll();
        System.out.println("\nATENDIENDO A:");
        System.out.printf("  - Nombre: %s, Edad: %d, Estatura: %.2f m\n", 
            atendido.nombre, atendido.edad, atendido.estatura);
    }

    // 3. Muestra quiénes están esperando
    public void mostrarEstado() {
        System.out.println("\n--- PACIENTES EN ESPERA ---");
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            int i = 1;
            for (Paciente p : fila) {
                System.out.println(i + ". " + p.getNombre());
                i++;
            }
        }
        System.out.println("---------------------------");
    }

    // 4. Verifica si hay alguien
    public boolean estaVacia() {
        return fila.isEmpty();
    }
}