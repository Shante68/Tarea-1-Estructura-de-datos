public class Array2D {

    private int rows;
    private int cols;
    private Object[][] data;

   
    public Array2D(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new Object[rows][cols];
    }

    
    public void clear(Object dato) {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                this.data[i][j] = dato;
            }
        }
    }

   
    public int getRowSize() {
        return this.rows;
    }

   
    public int getColSize() {
        return this.cols;
    }

   
    public void setElement(int row, int col, Object dato) {
        if (row >= 0 && row < this.rows && col >= 0 && col < this.cols) {
            this.data[row][col] = dato;
        } else {
            System.out.println("Error: Índices fuera de rango.");
        }
    }

   
    public Object getElement(int row, int col) {
        if (row >= 0 && row < this.rows && col >= 0 && col < this.cols) {
            return this.data[row][col];
        } else {
            System.out.println("Error: Índices fuera de rango.");
            return null;
        }
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                sb.append(this.data[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}