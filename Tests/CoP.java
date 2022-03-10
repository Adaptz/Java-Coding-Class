public class CoP 
{
    public static void main(String[] args)
    {
        System.out.printf("%,.2f - %,.2f = %,.2f", CalcMyMoney(40), CalcMyMoney(30), (CalcMyMoney(40) - CalcMyMoney(30)));
    }

public static double CalcMyMoney(double totalyear)
    {
        double monthlyAmount = 500;
        double totalInvestment = 2000;


        for(double year = 1;  year <= totalyear; year++)
        {
            totalInvestment = (totalInvestment + (monthlyAmount * 12) * (.6 + 1) );
        }
        return totalInvestment;
    }
}
