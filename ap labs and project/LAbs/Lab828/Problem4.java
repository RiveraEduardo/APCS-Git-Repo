class Problem4{

        public static void main (String[] arg)
        {

            int sum = 0;
            for(int i = 1; i <= 200; i++)
            {
                if(i%2 == 0)
                {
                    System.out.println("Summan blir : " + i);
                    sum = sum + i;

                }
            }
            System.out.println("Sum : " + sum);     
        }   
    }
