import java.util.Scanner;

public class Sphere
{
   // obtain radius from user and display volume of sphere
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter radius of sphere: " );
      double radius = input.nextDouble();
      double SpVol = SphereMethod.sphereVolume2(radius);
      SphereMethod sphereobject = new SphereMethod();

      //System.out.printf( "Volume is %f\n", sphereVolume( radius ) );
      System.out.printf( "Volume is %f\n", SphereMethod.sphereVolume2(radius) );
   } // end method determineSphereVolume

   // calculate and return sphere volume
   public static double sphereVolume( double radius )
   {
      double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
      return volume;
   } // end method sphereVolume
} // end class Sphere