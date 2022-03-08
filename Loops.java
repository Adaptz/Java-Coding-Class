public class Loops {
    public static void main(String[] args)
    {
        int counter = 0;
        int loopnum = 1;
        int total = 0;

        while(counter <= 10) //putting a semicolon loops the inside of the while forever
        {   
            counter+=1;
            counter++; // ++ after variable increments after semicolon ++ before increments immediatly

            if(loopnum != 1)
            System.out.printf("(%d)", loopnum++);
            else
            System.out.printf("Loop Number count:\n(%d)", loopnum++);
        }
        //System.out.printf("\nTotal is %d.", total)
}
}