//Addition Program that uses JOptionPane for input and output.
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Addition
{
    public static void main(String[] args)
{

// User input
String firstNumber =
JOptionPane.showInputDialog("Enter your weight in pounds: ");
String secondNumber =
JOptionPane.showInputDialog("Enter your height in inches: ");

// convert String inputs to in values for calcs
int pounds = Integer.parseInt(firstNumber);
int inches = Integer.parseInt(secondNumber);
double BMI = (double)pounds * 703 / ((double)inches * (double)inches);
//display results in JOptionPane message dialog

DecimalFormat df=new DecimalFormat(".00");

JOptionPane.showMessageDialog(null, "Your weight is: " + (int)pounds + " pounds and your height is: " + (int)inches + " inches.\n"
+ "Your BMI is: "+ df.format(BMI) +"\nBMI Standards:\nUnderweight: less than 18.5\n" 
+ "Normal: between 18.5 and 24.9\n"
+ "Overweight: between 25 and 29.9");
}//end main
}//end class