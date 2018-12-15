
/**
 * Write a description of class GridTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class GridTester{
    public static void load(String[] args){
        int[][] grid = new int [10][10];
        for ( int r=0; r< grid.length;r++)
        {
            for (int c=0; c < grid[r].length;c++)
            {
                grid[r][c] = r*c;

            }
          
        }
    }
    //Print each row and column of nums to the console
    public static void sumAll(int [][] value){
        int[][] grid = new int [10][10];
        int total = 0;
        for (int i=0; i< grid.length; i++){
            for(int j =0; j < grid.length;j++){
                total += grid[i][j];

            }
            System.out.println("Sum of array in the row is "+ grid);
            System.out.println();
        }
    }

    public static void fidgreatest(String[]args){
        int grid[][]= new int[10][10];
        int total =0;
        for(int i=0; i<grid.length; i++){
            int max= grid[i][0];
            for(int j=0; j<grid[i].length; j++){          
                if(max<grid[i][j]){
                    max= grid[i][j];
                }
            }
            System.out.println("the greatest number in the row is "+ grid);
            System.out.println();
        }              
    }

    public static void numberofGreatest(String[]args){
        int[][] grid = new int [10][10];
        int total = 0;
        for (int outer = 0; outer < grid.length;outer++){
            for(int inner = 0; inner < grid[outer].length; inner++){
                if (grid[outer][inner] ==0){
                    total++;
                }
            }
            System.out.println("Maximum number that apperes in the row is "+ grid);
            System.out.println();
        }
    }

    public static void avg(String[]args){
        int[][] grid = new int [10][10];
        int total = 0;
        for (int i=0; i< grid.length; i++){
            for(int j =0; j < grid.length;j++){
                total = grid[i][j];

            }
            System.out.println("AVG number in the row is "+ grid);
            System.out.println();
        }
    }
}
