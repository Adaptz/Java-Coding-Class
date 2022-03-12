import java.util.Scanner;

public class FindMaxMinAvg
{
   // obtain three floating-point values and determine maximum value
   public static void main( String[] args )
   {
      // create Scanner for input from command window
      Scanner input = new Scanner( System.in );

      // prompt for and input three floating-point values
      System.out.print( 
         "Enter three floating-point values separated by spaces: " );
      double number1 = input.nextDouble(); // read first double
      double number2 = input.nextDouble(); // read second double
      double number3 = input.nextDouble(); // read third double

      // determine the maximum value
      double resultMax = maximum( number1, number2, number3 ); 

      // display maximum value 
      System.out.println( "Maximum is: " + resultMax );
      
      
      // determine the minimum value
      double resultMin = minimum( number1, number2, number3 ); 

      // display maximum value 
      System.out.println( "Minimum is: " + resultMin ); 
   } // end main

   // returns the maximum of its three double parameters
   public static double maximum( double x, double y, double z )
   {
      double maximumValue = x; // assume x is the largest to start

      // determine whether y is greater than maximumValue
      if ( y > maximumValue )
         maximumValue = y; 

      // determine whether z is greater than maximumValue
      if ( z > maximumValue )
         maximumValue = z;

      return maximumValue;
   } // end method maximum

   // returns the minimum of its three double parameters
   public static double minimum( double x, double y, double z )
   {
      double minimumValue = x; // assume x is the largest to start

      // determine whether y is less than minimumValue
      if ( y < minimumValue )
        minimumValue = y; 

      // determine whether z is less than minimumValue
      if ( z < minimumValue )
        minimumValue = z;

      return minimumValue;
   } // end method minimum
} // end class FindMaxMinAvg