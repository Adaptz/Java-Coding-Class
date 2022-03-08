import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );

        int grade;
        int counter = 1;
        int average = 0;
        int totalgrades = 0;

        while ( counter != 0)
        {
            System.out.print("Enter Grade (integer 1-100):");

            grade = input.nextInt();
            counter = grade;
            average = average + grade;
            totalgrades++;


            if(grade >= 90)
            System.out.println("Your Letter Grade is: A");
            else if(grade >= 80)
            System.out.println("Your Letter Grade is: B");
            else if(grade >= 70)
            System.out.println("Your Letter Grade is: C");
            else if(grade >= 60)
            System.out.println("Your Letter Grade is: D");
            else if(grade < 60)
            System.out.println("Your Letter Grade is: F");
        }

        if(average != 0)
        System.out.printf("The average for these %d grades is: %d", totalgrades - 1, average / (totalgrades - 1));

    }
}