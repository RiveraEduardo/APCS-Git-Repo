
import java.util.*;
class calculations{
    // Loading the Array
    public static void main(String[] args) {
        //print nums in array
        int[] nums = new int[10];
        for(int i = 0; i < nums.length; i++){
            nums[i] =(int) (Math.random()*10 + 1);	

        }
        int sum =0;
        for(int i=0; i < nums.length;i++){
            sum = sum + nums[i];
            System.out.println(Arrays.toString(nums));
        }

        //sum
        nums = new int[10];
        int nums10 = 10;
        for( int i =0; i < nums.length; i++){
            nums [i]=(int)(Math.random()*10 + 1);
        }
        for (int i =0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        System.out.println("The sum value is: "+sum);
        // Mean
        double tot= 0;
        double mean =0;
        for(int i=0; i<nums10; i++){
            tot = tot + nums[i];
        }
        mean = tot/nums10;
        System.out.println("The Mean value is: "+mean);
        //Median
        double median = 0;
        double middle= 0;
        if(nums10 %2 ==0)
        {
            int val=(nums10/2)-1;
            for(int i=0; i<nums10;i++)
            {
                if(val==i||(val+1)==i)
                {
                    middle= middle+nums[i];
                }
            }
            middle = middle/2;
            System.out.println("The Median value is: "+middle);
        }
        else
        {
            int val= (nums10/2);
            for(int i=0; i<nums10; i++)
            {
                if( val==i)
                {
                    middle=nums[i];
                    System.out.println("The Median value is: "+middle);
                }
            }
        }
        // Mode-not working I commented out the errors
        int i,j,z, val, max,mode;
        int[] tally= new int[nums10];
        for( i=0; i<nums10;i++)
        {
            for(j=0; j < nums10-i;j++)
            {
                if( j+1 != nums10)
                {if( nums [j] > nums[j+1])
                    {
                        val=nums [j];
                        nums[j]=nums[j+1];
                        nums[j+1]=val;
                    }
                }
            }
        }
        for( i = 0; i < nums; i++)
        {
               for (z=i+1;z<nums;z++)
            {
                if(nums[i] == nums[z])
                {
                    tally[i]++;
                }
            }
        }
    }
}