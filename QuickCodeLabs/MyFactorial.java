public class MyFactorial 
{
    public static int CalcFact(int n)
    {
        int result;

        if(n==1)
        {
            result = 1; 
            System.out.printf("returns %d from CalcFact( %d ) \n", result, n);
            return result;
        }
        result = CalcFact(n-1) * n; 
        System.out.printf("returns %d from CalcFact( %d ) \n", result, n);
        return result;
    }
    public static void main(String[] args)
    {
        int MyInt = 6;
        int a = CalcFact(MyInt);
        System.out.printf(" The Factorial of %d is : %d\n", MyInt, a);
    }
}
