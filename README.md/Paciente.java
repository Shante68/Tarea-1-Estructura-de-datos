package TAREA6 ;
// Archivo: Paciente.java
public class Paciente {
    String nombre;
    int edad;
    double estatura;

    public Paciente(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNombre() {
        return this.nombre;
    }
}