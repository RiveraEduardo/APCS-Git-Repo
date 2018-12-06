
/**
 * Write a description of class Problem1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    class Problem1
    {
        public static void main(String[] args)
        {
            int i,j;
            for(i=1; i<=6; i++)
            {
                for(j=1; j<i; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }