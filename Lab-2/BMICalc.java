import java.util.Scanner;

public class BMICalc
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        int pounds;
        int inches;
        int BMI;

        System.out.println("Enter your weight in pounds: ");
        pounds = input.nextInt();

        System.out.println("Enter your height in inches: ");
        inches = input.nextInt();

        BMI = pounds * 703 / (inches * inches);
        System.out.printf("\nYour weight is %d pounds and your height is %d inches\nYour BMI is: %d.\n\nBMI Standards:\nUnderweight: less than 18.5\nNormal: between 18.5 and 24.9\nOverweight: between 25 and 29.9\nObese: 30 or greater\n", pounds, inches, BMI);
    }
}

