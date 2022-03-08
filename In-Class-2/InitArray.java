import java.util.Random;

//////// CHAPTER 7 CODE /////////////////////////////////
////////////////////////////////////////////////////////

public class InitArray 
{
   public static void main( String[] args )
   {
// Fig. 7.2: InitArray.java
// Initializing the elements of an array to default values of zero.

      int[] array; // declare array named array

      array = new int[ 10 ]; // create the array object
      
      System.out.printf( "%s%8s\n", "Index", "Value" ); // column headings
   
      // output each array element's value 
      for ( int counter = 0; counter < array.length; counter++ )
         System.out.printf( "%5d%8d\n", counter, array[ counter ] );
         System.out.println("");

         


// Fig. 7.3: InitArray.java
// Initializing the elements of an array with an array initializer.

      // initializer list specifies the value for each element
      int[] array2 = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };

      System.out.printf( "%s%8s\n", "Index", "Value" ); // column headings
   
      // output each array element's value 
      for ( int counter = 0; counter < array2.length; counter++ )
         System.out.printf( "%5d%8d\n", counter, array2[ counter ] );
         System.out.println("");





// Fig. 7.4: InitArray.java
// Calculating values to be placed into elements of an array.

      final int ARRAY_LENGTH = 10; // constant
      int[] array3 = new int[ ARRAY_LENGTH ]; // create array

      // calculate value for each array element
      for ( int counter = 0; counter < array3.length; counter++ )
         array3[ counter ] = 2 + 2 * counter;

      System.out.printf( "%s%8s\n", "Index", "Value" ); // column headings
   
      // output each array element's value 
      for ( int counter = 0; counter < array3.length; counter++ )
         System.out.printf( "%5d%8d\n", counter, array3[ counter ] );
         System.out.println("");




// Filling a array with random numbers from 1-100

         final int ARRAY_LENGTH2 = 10; // constant
         int[] array4 = new int[ ARRAY_LENGTH2 ]; // create array
         Random Rnum = new Random(); // creates a random number method for Rnum
   
         // calculate value for each array element
         for ( int counter = 0; counter < array4.length; counter++ )
            array4[ counter ] = 1 + Rnum.nextInt(100); // fills array with random numbers from 1-100
   
         System.out.printf( "%s%8s\n", "Index", "Value" ); // column headings
      
         // output each array element's value 
         for ( int counter = 0; counter < array4.length; counter++ )
            System.out.printf( "%5d%8d\n", counter, array4[ counter ] );
            System.out.println("");





// Fig. 7.5: SumArray.java
// Computing the sum of the elements of an array.

      int[] array5 = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
      int total = 0;

      // add each element's value to total
      for ( int counter = 0; counter < array5.length; counter++ )
         total += array5[ counter ];

      System.out.printf( "Total of array5 elements: %d\n", total );
   } // end main
} // end class InitArray