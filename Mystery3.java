//////   What does the following code do?  ////////////// Mystery 3 /////////

// Mystery3.java
public class Mystery3 
{
   public static void main( String[] args )
   {
      for(int row = 10; row >= 1; --row ) 
      {
         

         for(int column = 1; column <= 10; ++column ) 
         {
            System.out.print( row % 2 == 1 ? "<" : ">" );
         } // end while

         System.out.println();
      } // end while
   } // end main
} // end class Mystery3
