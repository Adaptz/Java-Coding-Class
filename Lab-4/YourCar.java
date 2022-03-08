import java.util.Scanner;

public class YourCar {
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );

        int tripnum = 1;
        int counter = 1;
        double miles = 0;
        double mph = 0;
        int gas = 0;
        int totalgasdistance = 0;
        double totaldistance = 0;
        double totaldistanceleft = 0;
        double time = 0;

        System.out.print("Are you going on a trip (1 = Yes or 0 = No): ");
        counter = input.nextInt();

        while ( counter != 0 ) 
        {
            //System.out.print("Are you going on a trip (1 = Yes or 0 = No): ");
            //counter = input.nextInt();


            if(tripnum == 1)
            {
                System.out.printf("How many gallons of gas in your tank?: ");
                gas = input.nextInt();
                totalgasdistance = gas * 20;
                totaldistanceleft = totalgasdistance;
            }

            System.out.printf("Enter Leg %d Distance (miles): ", tripnum);
            miles = input.nextDouble();

            if(miles > totaldistanceleft)
            {
                System.out.println("You do not have enough gas for that, you will have to get more gas.");
                break;
            }
            totaldistanceleft = totaldistanceleft - miles;

            System.out.printf("Enter Leg %d Speed (MPH): ", tripnum);
            mph = input.nextDouble();

            totaldistance = totaldistance + miles;
            time = time + ((miles/mph)*60);
            tripnum++;

            System.out.print("Are you going on a trip (1 = Yes or 0 = No): ");
            counter = input.nextInt();


        }//end while
        System.out.printf("You traveled about %.0f miles in about %.0f minutes\n", totaldistance, time);
        if(totaldistance > totaldistanceleft)
        {
            if(counter == 0)
            {
                System.out.println("Your car will need more gas to return");
            }
        }
    }
}