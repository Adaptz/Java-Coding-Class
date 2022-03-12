import java.util.Scanner;

public class IsDivisibleBy {
    public static void main(String[] args)
    {
        int[] array;
        array = new int[10000];
        int index = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to check what it's divisible by (checks from 2-10000): ");
        int number = input.nextInt();

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
        if(array[3] == 0)
        {
            System.out.printf("\n%d is a prime number", number, number);
        }
    }
    
}
