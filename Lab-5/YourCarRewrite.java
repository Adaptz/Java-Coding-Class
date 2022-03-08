import java.util.Scanner;

public class YourCarRewrite {
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );

        int tripnum = 1;
        int tripamount = 0;
        double miles = 0;
        double mph = 0;
        double gas = 0;
        double gasleft = 0;
        double gastotal = 0;
        double totalgasdistance = 0;
        double totaldistance = 0;
        double totaldistanceleft = 0;
        double totaltime = 0;

        System.out.println("How many trips are you going on? ( 1 to 10 trips )");
        tripamount = input.nextInt();

        for(int counter = 1; counter <= 10; ++counter ) 
        {
            if(tripnum == 1)
            {
                System.out.printf("How many gallons of gas in your tank?: ");
                gastotal = input.nextInt();
                totalgasdistance = gastotal * 20;
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
            totaltime = totaltime + ((miles/mph)*60);
            tripnum++;

            gasleft = gastotal - (totaldistance / 20);
            gas = gastotal - gasleft;

            System.out.printf("In %.0f minutes you've used %.1f gallons of fuel and have %.1f gallons remaining\n", totaltime, gas, gasleft);
            tripamount--;

            if( tripamount < 1)
            {
                System.out.println("Your car will need more gas to return");
                break;
            }

        }//end while
    }
}