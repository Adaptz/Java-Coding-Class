import java.util.Scanner;
import java.util.Arrays;

public class IsDivisibleBy {
    public static void main(String[] args)
    {
        int[] array;
        array = new int[100000];
        int number = 1;
        int loopnum = 1;

        Scanner input = new Scanner(System.in);

        while(number != 0)
        {
            int index = 0;

            if(loopnum == 1)
            System.out.print("\n************************** Enter a 0 to exit **************************");

            System.out.println("\n\nEnter the number to check what it's divisible by (checks from 2-100000): ");
            number = input.nextInt();
            if(number == 0)
            System.exit(0); 
            
            System.out.printf("%d is divisible by: ", number);

            for(int check = 1; check < array.length; check++)
            {
                if( number % check == 0)
                {
                    array[index] = check;
                    System.out.printf(" %d ", array[index]);
                    index++;
                }
            }

            if(array[2] == 0)
            {
                System.out.printf("\n%d is a prime number", number, number);
            }

            Arrays.fill(array, 0);
            loopnum++;
            
        }
    }
    
}
