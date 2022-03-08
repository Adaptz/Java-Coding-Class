import java.util.Scanner;

public class DaysInMonth 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner( System.in );

        int year;
        int month;
        int leap = 0;

        System.out.println("Enter the year: ");
        year = input.nextInt();

        System.out.println("Enter the month number: ");
        month = input.nextInt();

        
        if ((year % 4 == 0) && (year % 100 != 0))
        leap = 1;
        else if( year % 400 == 0 )
        leap = 1;

        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            {
                System.out.println("This month has 31 days\n");
                break;
            }

            case 4:	
			case 6:
			case 9:
			case 11:
            {		    	
				System.out.println("This month has 30 days\n");  
				break;
            }
			
			case 2:
            {
                if(leap == 1)
				System.out.println("This month has 29 days\n");
                else
                System.out.println("This month has 28 days\n");
				break;
            }
            default:
                System.out.println("Please enter a valid number from 1 to 12\n");
        }
    }
}