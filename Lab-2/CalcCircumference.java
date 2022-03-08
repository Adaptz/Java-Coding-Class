import java.util.Scanner;

public class CalcCircumference 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        int radius;

        System.out.println("Enter Radius: ");
        radius = input.nextInt();

        System.out.printf("Diameter is: %d\n", (2 * radius));

        System.out.printf("Area is: %f\n", (Math.PI * (radius * radius)));

        System.out.printf("Circumference is: %f\n", (2 * Math.PI * radius));
    }
}
