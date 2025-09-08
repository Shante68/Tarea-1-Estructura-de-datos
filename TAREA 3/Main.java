package Juegodelavida;
public class Main {

    public static void main(String[] args) throws InterruptedException {
        int filas = 20;
        int columnas = 40;
        int numGeneraciones = 10;

        JuegoDeLaVida juego = new JuegoDeLaVida(filas, columnas);

      
        juego.establecerCeldaViva(1, 2);
        juego.establecerCeldaViva(2, 3);
        juego.establecerCeldaViva(3, 1);
        juego.establecerCeldaViva(3, 2);
        juego.establecerCeldaViva(3, 3);
        
        
        for (int i = 1; i <= numGeneraciones; i++) {
            System.out.println("--- Generación " + i + " ---");
            juego.imprimirRejilla();
            juego.calcularSiguienteGeneracion();
            
    
            Thread.sleep(500); 
            System.out.println("\n");
        }
    }
}