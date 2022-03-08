//////   What does the following code do?  ///////////   Mystery Two //////
// Mystery2.java
public class Mystery2 
{
   public static void main( String[] args )
   {
      int count = 1;

      while ( count <= 10 ) 
      {
         System.out.println( count % 2 == 1 ? "****" : "++++++++" ); //cond ? true : false ////2==1 even 2==0 odd
         ++count;
      } // end while
   } // end main
} // end class Mystery2
////////end Mystery2 ///////
