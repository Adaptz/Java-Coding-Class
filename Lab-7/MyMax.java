public class MyMax {
    public static void outputMax(int[] array)
    {
        int maximumValue = array[0]; // find maximum value

        for(int countermax = 0; countermax < array.length - 2; countermax++)
        {   
            if ( array[countermax + 1] > maximumValue )
                maximumValue = array[countermax + 1]; 

            if ( array[countermax + 2] > maximumValue )
                maximumValue = array[countermax + 2];
        }

        System.out.printf("\nThe maximum number is %d\n", maximumValue);
    }
    
}
