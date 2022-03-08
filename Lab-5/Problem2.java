public class Problem2 
{
    /* //a) 
    if ( age >= 65 );
        System.out.println( "Age is greater than or equal to 65" );
    else
        System.out.println( "Age is less than 65 )";

    //b) 
    int x = 1, total;

    while ( x <= 10 )
    {
        Total += x;
        ++x;
    }

    //c) 
    while ( x <= 100 )
        total += x;
        ++x;

    //d) 
    while ( y > 0 )
    {
        System.out.println( y );
        ++y; 
    */


    public static void main(String[] args) //String Args were not set (compile error)
    {

        //a) 
        int age = 1; // age was not defined (compile error)
        int y = 10; // y was not defined (compile error)

        if ( age >= 65 ) // semicolon on if (compile error)
            System.out.println( "Age is greater than or equal to 65" );
        else
            System.out.println( "Age is less than 65 "); // parenthesis inside quotes (compile error)

        //b) 
        int x = 1;
        int total = 1; // total not initialized (compile error)
        
        while ( x <= 10 )
        {
            total += x; // total was capitalized (compile error)
            ++x;
        }
        //c) 
        while ( x <= 100 )
        { //Missing both brackets (compile error)
            total += x;
            ++x;
        }

        System.out.printf("The final total was %d and looped %d times\n", total, x); //total not used before

        //d) 
        while ( y > 0 )
        {
            System.out.println( y );
            --y; //loop did not finish (logic error)
        } //Missing bottom bracket (compile error) */
    }
}
