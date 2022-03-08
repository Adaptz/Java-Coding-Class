    // Exercise 6.6: Sphere.java
// Calculate the volume of a sphere.
import java.util.Scanner;

public class Sphere
{
   // obtain radius from user and display volume of sphere
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      MySphere object = new MySphere();

      System.out.print( "Enter radius of sphere: " );

      double radius = input.nextDouble();
      double SpVol = sphereVolume(radius);

      System.out.printf( "Volume 1: %f\n", SpVol); //Calling Method Directly
      System.out.printf( "Volume 2: %f\n", object.sphereVolume2( radius ) ); //Calling Method w/Object
      System.out.printf( "Volume 3: %f\n", MySphere.sphereVolume3( radius ) ); //Calling Method w/Class Name
   } // end method determineSphereVolume

   // calculate and return sphere volume
   public static double sphereVolume( double radius )
   {
      double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
      return volume;
   } // end method sphereVolume
} // end class Sphere
