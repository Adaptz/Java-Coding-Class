public class CoP 
{
    public static void main(String[] args)
    {
        double mA = 500; 
        double tI = 2000; 
        double iR = .06;

        System.out.printf("%,.2f - %,.2f = %,.2f (CoP)", 
        CalcMyMoney(40, mA , tI, iR), CalcMyMoney(30, mA , tI, iR),
         (CalcMyMoney(40, mA , tI, iR) - CalcMyMoney(30, mA , tI, iR)));
        //System.out.printf("%,.2f", CalcMyMoney(1, mA , tI, iR));
    }

public static double CalcMyMoney(double totalyear, double monthlyAmount, double totalInvestment, double intrestRate)
    {
        for(double year = 1;  year <= totalyear; year++)
        {
            totalInvestment = (totalInvestment + (monthlyAmount * 12)) * (intrestRate + 1);
        }
        return totalInvestment;
    }
}
