public class RunMyCar {
    public static void main( String[] args )
    {
        MyCar TestCar1 = new MyCar();

        TestCar1.prntStats(0);

        TestCar1.hitGas(100);
        TestCar1.hitBreak(35);
        TestCar1.hitGas(15);
        TestCar1.checkMiles(200);
        TestCar1.checkFuel(10);
        TestCar1.checkMiles(50);
        TestCar1.turnLeft(90);

        TestCar1.prntStats(1);
    }
}
