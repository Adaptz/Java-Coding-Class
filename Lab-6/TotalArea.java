import java.util.Scanner;

public class TotalArea {

    public static void main( String[] args )
   {

        int counter = 1;
        int loopnum = 1;
        double totalArea = 0;

        Scanner input = new Scanner( System.in );

        while(counter != 0)
        {
            System.out.println("Calculate the area of the specified shape (1 = Sphere, 2 = Triangle, 3 = Rectangle)\nEnter 0 to stop");
            counter = input.nextInt();

            if(counter == 1)
            {
                System.out.println( "Enter radius of sphere: " );
                double radius = input.nextDouble();


                System.out.printf( "Area %d (sphere): %.2f units^2\n\n", loopnum, CalcArea.sphereArea(radius));

                totalArea +=  CalcArea.sphereArea(radius);
            }

            else if(counter == 2)
            {
                System.out.println( "Enter base of triangle: " );
                double base = input.nextDouble();

                System.out.println( "Enter height of triangle: " );
                double height = input.nextDouble();

                System.out.printf( "Area %d (triangle): %.2f units^2\n\n", loopnum, CalcArea.triangleArea(base, height));
            
                totalArea += CalcArea.triangleArea(base, height);
            }

            else if(counter == 3)
            {
                System.out.print("Enter length of rectangle: ");
                double length = input.nextDouble();

                System.out.print("Enter width of rectangle: ");
                double width = input.nextDouble();

                System.out.printf( "Area %d (rectangle): %.2f units^2\n\n", loopnum, CalcArea.rectangleArea(length, width));

                totalArea += CalcArea.rectangleArea(length, width);
            }
            else if( counter > 3 || counter < 0)
            System.out.println("That is not a valid input please try again.");

            loopnum++;
        }
        if( loopnum != 2 )
        System.out.printf("The total area is equal to %.2f units^2", totalArea);
   }

    
}
