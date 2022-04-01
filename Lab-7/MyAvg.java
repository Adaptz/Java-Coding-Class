public class MyAvg 
{
    public static void outputAvg(int[] array)
    {
        int average = 0;

        for(int counteravg = 0; counteravg < array.length - 2; counteravg++)
        {
            average += array[counteravg];
        }
        
        System.out.printf("\nThe average of all numbers is %d\n\n", (average / array.length) );
    }
}
