public class Chessboard {

    public static void main(String[] args) {
        
        Array2D tablero = new Array2D(8, 8);

        tablero.clear('·');

        //  PIEZAS BLANCAS
        // Rey      U+2654
        // Reina    U+2655
        // Torre    U+2656
        // Alfil   U+2657
        // Caballo U+2658
        // Peón    U+2659
        tablero.setElement(7, 0, '\u2656'); 
        tablero.setElement(7, 1, '\u2658'); 
        tablero.setElement(7, 2, '\u2657'); 
        tablero.setElement(7, 3, '\u2655'); 
        tablero.setElement(7, 4, '\u2654'); 
        tablero.setElement(7, 5, '\u2657'); 
        tablero.setElement(7, 6, '\u2658'); 
        tablero.setElement(7, 7, '\u2656'); 
        for (int i = 0; i < 8; i++) {
            tablero.setElement(6, i, '\u2659'); 
        }

        //  PIEZAS NEGRAS 
        // Rey       U+265A
        // Reina    U+265B
        // Torre   U+265C
        // Alfil   U+265D
        // Caballo U+265E
        // Peón    U+265F
        tablero.setElement(0, 0, '\u265C'); 
        tablero.setElement(0, 1, '\u265E'); 
        tablero.setElement(0, 2, '\u265D'); 
        tablero.setElement(0, 3, '\u265B'); 
        tablero.setElement(0, 4, '\u265A'); 
        tablero.setElement(0, 5, '\u265D'); 
        tablero.setElement(0, 6, '\u265E'); 
        tablero.setElement(0, 7, '\u265C'); 
        for (int i = 0; i < 8; i++) {
            tablero.setElement(1, i, '\u265F'); 
        }

        
        System.out.println(" Tablero de Ajedrez");
        System.out.println(tablero.toString());
    }
}