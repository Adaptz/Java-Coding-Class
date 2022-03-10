public class CompInt
{
    public static void main(String[] args) 
    {

        double amountMonth = 500.0; // amount deposit each month
        double principal = 2000.0; // initial amount before interest
        double rate = 0.06; // interest rate
        System.out.println("Hello World");
        for(int years = 1; years <= 40; years++)
        {

            principal = ((principal + (12 * amountMonth))* (1+rate));

            if(years == 1)
            System.out.printf("Compunded Interest:\n\n%5s %20s\n", "Year", "Principal Interest");

            System.out.printf("%5d %,20.2f\n", years, principal);

        }
    }
}