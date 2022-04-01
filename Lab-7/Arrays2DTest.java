public class Arrays2DTest {
    public static void main(String[] args)
    {
        int[][] array1 = { {1,2,3}, {4,5,6} };
        int[][] array2 = { {1,2}, {3}, {4,5,6} };

        System.out.println("Values in array1 by row are:");
        double array1Avg = output2DArray(array1);
        System.out.printf("The average value of array1 is: %.1f \n\n", array1Avg);

        System.out.println("Values in array2 by row are:");
        double array2Avg = output2DArray(array2);
        System.out.printf("The average value of array2 is: %.1f \n", array2Avg);
    }
    public static double output2DArray(int[][] array)
    {
        int arrayTotal = 0;
        int numTotal = 0;

        for(int row = 0; row < array.length; row++)
        {
            int rowTotal = 0;

            for(int column = 0; column < array[row].length; column++)
            {
                System.out.printf("%d ", array[row][column] );
                rowTotal += array[row][column];

                numTotal++;
            }

            System.out.printf("= %d\n", rowTotal);

            arrayTotal += rowTotal;
        }

        double arrayAvg = (double) arrayTotal / numTotal;

        return arrayAvg;
    }
    
}
