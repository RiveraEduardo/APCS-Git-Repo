
/**
 * 
 * CellMatrix +++++++++++++++++++++++++++++++++++++++++++
 * @author (eettlin) 
 * @version (11-26-18)
 */
public class CellMatrix{
    /**
     * +++++++++++++++++++++Instance variables
     */

    private Cell[][] cells;

    /**
     * +++++++++++++++++++++Constructor for objects of class NumberMatrix
     */
    public CellMatrix(int a, int b){
        cells = new Cell[a][b];

    }

    /**
     * +++++++++++++++++++++++++++++++++++++++++++++++++++++++methods
     */
    //Print each row and column of nums to the console
    public void printMatrix(){
        for( int r =0; r < cells.length; r ++){
            for( int c = 0; c < cells[r].length;c++){
                System.out.print("\t" + cells[r][c].getInt());
            }
            System.out.print("\n");
        }
    }
    //  load nums with random with numbers between 1 and 10 inclusive
    public void loadMatrix(){
        for( int r =0; r < cells.length; r ++){
            for( int c = 0; c < cells[r].length;c++){
                cells[r][c] = new Cell((int)(Math.random()*10)+1);
            }
        }

        for( int r =0; r < cells.length; r ++){
            for( int c = 0; c < cells[r].length;c++){
                cells[r][c].getNeighbors();
                if (r > 0) {
                    cells[r][c].getNeighbors()[0] = cells[r-1][c];
                }
                if (c > 0) {
                    cells[r][c].getNeighbors()[1] = cells[r][c-1];
                }
                if (c < cells[0].length-1) {
                    cells[r][c].getNeighbors()[2] = cells[r][c+1];
                }if (r < cells.length-1) {
                    cells[r][c].getNeighbors()[3] = cells[r+1][c];
                }
            }
        }
    }
    //  Findis the sum of each of the neighbors and returns the greatest 
    // neighbor value
    public int getGreatestNeighbors(){
        int largest = 0;
        for (int  r =0; r < cells.length; r ++){
            for( int c =0; c < cells[r].length; c++)
            {
                int temp = cells[r][c].getNeighborsum();
                if(largest < temp){
                    largest = temp;
                }
            }
            return largest;
        }
        return largest;
    }

    /**
     * ++++++++++++++  methods
     */

    //  Load neighbor cells into the neighbors array
    public void loadNeighbors(){
        for( int r =0; r < cells.length; r ++){
            for( int c = 0; c < cells[r].length;c++){
                cells[r][c].getNeighbors();
                if (r > 0) {
                    cells[r][c].getNeighbors()[0] = cells[r-1][c];
                }
                if (r > 0) {
                    cells[r][c].getNeighbors()[1] = cells[r][c-1];
                }
                if (r < cells[0].length) {
                    cells[r][c].getNeighbors()[2] = cells[r][c+1];
                }if (r < cells.length-1) {
                    cells[r][c].getNeighbors()[3] = cells[r+1][c];
                }
            }
        }
    }
}