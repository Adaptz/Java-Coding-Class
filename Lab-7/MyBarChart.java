public class MyBarChart 
{
    public static void outputBarChart(int [] array)
    {
        System.out.println("Overall grade distribution:");

        for(int counter = 0; counter <= 10; counter++) //print barchart
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
        }
    }
    
}
