public class BarChartQ {

    public static void main(String[] args)
    {
        int[] array = {3, 5, 10, 14, 16, 19, 20, 25, 28, 35, 37, 40, 51, 52, 
            53, 54, 56, 59, 72, 73, 74, 77, 78, 81, 83, 86, 90, 93, 95, 100};

            /*System.out.printf("Grade distribution is \n %d \n", MyBarChart.outputBarChart(array));*/ 
            MyBarChart.outputBarChart(array);

            /*for(int counter = 0; counter <= 10; counter++) //print barchart
            { 
                if ( counter == 10 )
                System.out.printf( "%5d: ", 100 ); 
                else if(counter > 0)
                System.out.printf( "%02d-%02d: ", counter * 10, counter * 10 + 9  );
                else
                System.out.printf( "%02d-%02d: ", counter * 10 + 1, counter * 10 + 9  );


                for ( int stars = 0; stars < array.length; stars++ )
                {
                    if( (array[stars] >= (counter * 10) ) && ( array[stars] <= ((counter * 10) + 9 )) )
                    System.out.print( "*" );
                }

                System.out.println();
            } */

            int maximumValue = array[0]; // find maximum value
            for(int countermax = 0; countermax < array.length - 2; countermax++)
            {   
                if ( array[countermax + 1] > maximumValue )
                    maximumValue = array[countermax + 1]; 

                if ( array[countermax + 2] > maximumValue )
                    maximumValue = array[countermax + 2];
            }
            System.out.printf("\nThe maximum number is %d\n", maximumValue);


            int minimumValue = array[0]; // find minimum value
            for(int countermin = 0; countermin < array.length - 2; countermin++)
            {   
                if ( array[countermin + 1] < minimumValue )
                minimumValue = array[countermin + 1]; 

                if ( array[countermin + 2] < minimumValue )
                minimumValue = array[countermin + 2];
            }
            System.out.printf("\nThe minimum number is %d\n", minimumValue);
            

            int average = 0;
            for(int counteravg = 0; counteravg < array.length - 2; counteravg++)
            {
                average += array[counteravg];
            }
            System.out.printf("\nThe average of all numbers is %d\n\n", (average / array.length) );

    }
}
