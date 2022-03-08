public class Problem1
{
       /* // (a)
    while ( c <= 5 )
    {
        product *= c;
        System.out.println(product);
        ++c;


    // (b) 
    if ( gender == 1 )
        System.out.println( "Woman" );
    else;
        System.out.println( "Man" );


    // (c) 
    while ( z >= 0 )
        sum += z;
        System.out.println(sum); */


    public static void main(String[] args) //String Args were not set (compile error)
    {
        // (a)

        int c = 1; // c was not defined (compile error)
        int product = 1; // product was not defined (compile error)
        int gender = 0; // gender was not defined (compile error)
        int z = 10; // z was not defined (compile error)
        int sum = 0; // sum was not defined (compile error)

        while ( c <= 5 )
        {
            ++c;
            product *= c;
            System.out.println(product);
        } //Missing bottom bracket (compile error)
        
        // (b) 
        if ( gender == 1 )
           System.out.println( "Woman" );
        else // semicolon on else (logic error)
            System.out.println( "Man" );

                // (c) 
        while ( z >= 0 )
        { //Missing both brackets (compile error)
            z--; // missing way to stop loop (logic error)
            sum += z;
            System.out.println(sum);
        }


    }
    
}