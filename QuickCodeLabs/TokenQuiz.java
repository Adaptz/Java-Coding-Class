import java.util.Scanner;
//import java.util.StringTokenizer;
public class TokenQuiz
{
// execute application
public static void main( String[] args )
{
    Scanner input = new Scanner(System.in);

    System.out.println("Type a sentence and press Enter/Return:");
    String sentence = input.nextLine();

    String tokens[] = sentence.split(" ");
    System.out.println("There is " + tokens.length + " words\nHere is a list of words.");

    for(String token : tokens)
    System.out.println(token);


} // end class TokenTest
}