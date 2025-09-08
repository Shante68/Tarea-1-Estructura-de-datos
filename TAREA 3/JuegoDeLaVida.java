package Juegodelavida;
public class JuegoDeLaVida {

    private int filas;
    private int columnas;
    private int[][] rejilla;

    
    public JuegoDeLaVida(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.rejilla = new int[filas][columnas]; 
    }

    
    public void imprimirRejilla() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(rejilla[i][j] == 1 ? "█ " : ". ");
            }
            System.out.println();
        }
    }

    
   
    public void establecerCeldaViva(int fila, int columna) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            this.rejilla[fila][columna] = 1;
        }
    }

   
    private int contarVecinosVivos(int fila, int columna) {
        int vecinosVivos = 0;
       
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                
                if (i == 0 && j == 0) {
                    continue;
                }

                int vecinoFila = fila + i;
                int vecinoColumna = columna + j;

                
                if (vecinoFila >= 0 && vecinoFila < filas && vecinoColumna >= 0 && vecinoColumna < columnas) {
                    vecinosVivos += rejilla[vecinoFila][vecinoColumna];
                }
            }
        }
        return vecinosVivos;
    }

   
    public void calcularSiguienteGeneracion() {
        int[][] proximaRejilla = new int[filas][columnas];

        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int estadoActual = rejilla[i][j];
                int vecinosVivos = contarVecinosVivos(i, j);

                
                
                
                if (estadoActual == 1) {
                    if (vecinosVivos == 2 || vecinosVivos == 3) {
                        proximaRejilla[i][j] = 1; 
                    } else {
                        proximaRejilla[i][j] = 0; 
                    }
                } 
               
                else {
                    if (vecinosVivos == 3) {
                        proximaRejilla[i][j] = 1; 
                    } else {
                        proximaRejilla[i][j] = 0; 
                    }
                }
            }
        }
        
        
        this.rejilla = proximaRejilla;
    }
}