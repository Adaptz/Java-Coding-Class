public class ExpandArray {
    public static void main( String[] args )
    {
        int[] MyOriginal = {2,4,6,8};
        int[] copy = MyOriginal;

        MyOriginal = new int[10]; //all zeros
        
        //MyOriginal = copy; //Makes array back to length of 4

        for(int index = 0; index < copy.length; index++)
        {
            MyOriginal[index] = copy[index];
        }
    }
    
}
