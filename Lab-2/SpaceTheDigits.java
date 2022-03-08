import java.util.Scanner;

public class SpaceTheDigits 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        int number;
        int digit1;
        int digit2;
        int digit3;
        int digit4;
        int digit5;


        System.out.println("Enter a 5 digit number: ");
        number = input.nextInt();

        digit1 = number / 10000;
        digit2 = (number - (digit1 * 10000)) / 1000;
        digit3 = (number - ((digit1 * 10000) + (digit2 * 1000))) / 100;
        digit4 = (number - ((digit1 * 10000) + (digit2 * 1000) + (digit3 * 100))) / 10;
        digit5 = (number - ((digit1 * 10000) + (digit2 * 1000) + (digit3 * 100) + (digit4 * 10)));

        System.out.printf("The digits in %d are: %d   %d   %d   %d   %d", number, digit1, digit2, digit3, digit4, digit5);
    }   
}
