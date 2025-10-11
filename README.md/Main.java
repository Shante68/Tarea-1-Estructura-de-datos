package TAREA6;

// Archivo: Main.java
public class Main {
    public static void main(String[] args) {
        
        // Creamos el objeto que manejará la clínica
        Colapaciente clinica = new Colapaciente();

        System.out.println("--- Simulación de Clínica Abierta ---");

        // Llegan pacientes
        clinica.registrarLlegada(new Paciente("Ana López", 30, 1.65));
        clinica.registrarLlegada(new Paciente("Luis Castro", 45, 1.80));
        
        // Vemos cómo está la cola
        clinica.mostrarEstado();

        // Atendemos al primero que llegó (Ana)
        clinica.atenderSiguiente();

        // Vemos cómo quedó la cola
        clinica.mostrarEstado();
        
        // Llega un nuevo paciente
        clinica.registrarLlegada(new Paciente("Sofía Gil", 22, 1.70));
        
        clinica.mostrarEstado();

        // Atendemos a los que quedan
        clinica.atenderSiguiente(); // Atiende a Luis
        clinica.atenderSiguiente(); // Atiende a Sofía
        
        // Verificamos el estado final
        clinica.mostrarEstado();
    }
}