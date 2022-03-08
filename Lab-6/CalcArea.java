public class CalcArea 
{

       public static double sphereArea(double radius)
       {
            double area = Math.PI * Math.pow( radius, 2 );
            return area;
       }

       public static double triangleArea(double base, double height)
       {
            double area = (base * height)/2;
            return area;
       }

       public static double rectangleArea(double length, double width)
       {
            double area = length * width;
            return area;
       }

}
