import java.io.FileReader;
//import java.io.FileWriter;
import java.io.BufferedReader;
//import java.io.PrintWriter;
import java.io.IOException;
public class GradeLevel
{
public static void main(String[] args) throws IOException
{
    BufferedReader inputStream = null;
    //PrintWriter outputStream = null;

    int totalwords = 0;
    int totalsyllables = 0;
    int totalsentences = 0;
    double grade = 0;

    try
    {
        inputStream = new BufferedReader(new FileReader("C:\\Users\\brody\\Documents\\GitHub\\Java-Coding-Class\\declaration.txt"));
        //(outputStream = new PrintWriter(new FileWriter("C:\\Users\\brody\\Documents\\GitHub\\Java-Coding-Class\\GettysburgOutput.txt"));
        String newLine;
        while ((newLine = inputStream.readLine()) != null)
        {
            String[] syllables = newLine.split( "");
            String[] words = newLine.split( "[ -]");

            totalsyllables += (syllables.length - words.length)/3;
            totalwords += words.length;
            totalsentences++;

            //System.out.printf( "Number of words: %d\n", words.length);
            //System.out.printf( "Number of syllables: %d\n", syllables.length);
        }

        grade = .39 * ((double)totalwords/(double)totalsentences) + 11.8 * ((double)totalsyllables/(double)totalwords) - 15.59;

        System.out.println("Stats for this file");
        System.out.printf( "Total number of syllables: %d\n", totalsyllables);
        System.out.printf( "Total number of words: %d\n", totalwords);
        System.out.printf( "Total number of sentences: %d\n", totalsentences);
        System.out.printf( "Grade level: %.2f\n", grade);
    }
    finally
    {
    if (inputStream != null)
    {
    inputStream.close();
    }
    /*if (outputStream != null)
    {
    outputStream.close();
    }*/
    }
}
}