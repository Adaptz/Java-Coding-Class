import java.util.Scanner;
//import java.util.StringTokenizer;
public class TokenQuiz
{
// execute application
public static void main( String[] args )
{
// get sentence
Scanner scanner = new Scanner( System.in );
System.out.println( "Type a sentence and press Enter/Return: " );
String sentence = scanner.nextLine();
// process user sentence
String[] tokens = sentence.split( " " );
System.out.printf( "\nNumber of words in this sentence is: %d\n\nHere is the list of words:\n",
tokens.length );
for ( String token : tokens )
System.out.println( token );
} // end main
} // end class TokenTest