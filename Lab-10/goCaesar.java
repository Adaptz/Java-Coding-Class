import java.util.Scanner;
import java.util.InputMismatchException;

public class goCaesar 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String letters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String encdodedMessage = "";
        String message = "";
        int key = 0;

        try
        {
        System.out.println("Please input a message to decode or encode");
        message = input.next();
        message = message.toUpperCase();

        System.out.println("Please input the key value");
        key = input.nextInt();
        }
        catch ( InputMismatchException inputMismatchException )
        {
            System.err.printf( "\nException: %s\n", inputMismatchException );
            System.out.println("You must enter integers. Please try again.\n" );
        }

        for( int index = 0; index < message.length(); index++)
        {
            int decimalValue = letters.indexOf(message.charAt(index));
            int keyVal = (decimalValue - key) % 26;

            if(keyVal < 0)

            {
                 keyVal = letters.length() + keyVal;
            }

            encdodedMessage += letters.charAt(keyVal);
        }

        System.out.println(encdodedMessage);
    }
    
}
