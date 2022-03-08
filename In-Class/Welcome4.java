
//***********  Welcome4 ***********

// Fig. 2.6: Welcome4.java
// Displaying multiple lines with method System.out.printf.

public class Welcome4 
{
   // main method begins execution of Java application
   public static void main( String[] args )
   {
      System.out.printf( "%s\n%s\n", "Welcome to", "Java Programming!" ); //%s formats for a string
      int wt = 240;
      double wt2 = 240.5;
      System.out.printf( "%s %d %s\n", "My Weight is:", wt, "Pounds" ); //%d formats for ints
      System.out.printf( "%s %5.2f %s\n", "My Weight is:", wt2, "Pounds" ); //%f formats for non-ints
   } // end method main
} // end class Welcome4
