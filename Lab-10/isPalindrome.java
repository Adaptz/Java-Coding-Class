import java.util.Scanner;

public class isPalindrome 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );

        int sentinel = 0;

        System.out.println("Please enter a string to test whether it's a palindrome:");
        String str = input.nextLine();

        String wordstr = str.replaceAll("\\W", "").toLowerCase();

        int start = 0;
        int end = wordstr.length() - 1;

        while(sentinel != 1)
        {
            if( wordstr.charAt(start) == wordstr.charAt(end))
            {
                start++;
                end--;
            }
            else
            {
                System.out.printf("\"%s\" is not a palindrome.", str);
                sentinel = 1;
            }

            if( (start-end) == 0 || (start-end) == 1)
            {
                System.out.printf("\"%s\" is a palindrome.", str);
                sentinel = 1;
            }
        }



    }
    
}
