public class MyCar 
{
    private int speed = 0;
    private int fuel = 0;
    private int direction = 0;
    private double odometer = 0;

    public void hitGas(int increment)
    {
        speed = speed + increment;
        System.out.printf("Speed increased by %d MPH\n", increment);
    }
    public void hitBreak(int decrement)
    {
        speed = speed - decrement;
        System.out.printf("Speed decreased by %d MPH\n", decrement);
    }
    public void checkMiles(int tripchange)
    {
        odometer = odometer + tripchange;
        System.out.printf("I added %d more miles to the trip.\n", tripchange);
    }
    public void checkFuel(int fuelchange)
    {
        fuel = fuel + fuelchange;
        System.out.printf("Just added %d gallons of fuel.\n", fuelchange);
    }
    public void turnLeft(int left)
    {
        direction = direction - left;
        System.out.printf("I just turned left %d degrees\n", left);
    }
    public void turnRight(int right)
    {
        direction = direction + right;
        System.out.printf("I just turned right %d degrees\n", right);
    }
    public void prntStats(int string)
    {
        if( string == 0 )
        System.out.printf("TestCar1 Status at Start\nSpeed = %d \nFuel = %d\nDirection = %d°\nOdometer = %.0f\n\n", speed, fuel, direction , odometer);
        else
        {
            System.out.printf("\nTestCar1 Status at Finish\nSpeed = %d \nFuel = %d\nDirection = %d°\nOdometer = %.0f\n", speed, fuel, direction , odometer);
            System.out.printf("I travelled %.0f miles and used %.1f gallons of fuel.", odometer, (odometer/20));
        }
    }
}
