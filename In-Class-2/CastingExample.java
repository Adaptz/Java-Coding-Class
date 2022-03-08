public class CastingExample {
    public static void main(String[] args) 
    {
        int dog = 6;
        int cat = 5;
        System.out.println(dog/cat);
        double result = dog/cat;
        System.out.println(result);
        double result2 = (double)dog/(double)cat;
        System.out.println(result2);

    }
    
}
