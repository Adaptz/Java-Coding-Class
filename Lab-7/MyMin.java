public class MyMin {
    public static void outputMin(int[] array)
    {
        int minimumValue = array[0]; // find minimum value

        for(int countermin = 0; countermin < array.length - 2; countermin++)
        {   
            if ( array[countermin + 1] < minimumValue )
                minimumValue = array[countermin + 1]; 

            if ( array[countermin + 2] < minimumValue )
                minimumValue = array[countermin + 2];
        }
        System.out.printf("\nThe minimum number is %d\n", minimumValue);
    }
}
