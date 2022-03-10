public class PrintArrays {
    public static void main( String[] args )
    {
        int[] MyArray = {2, 4, 6, 8, 10};
        System.out.println("Print MyArray");

        for(int index = 0; index < MyArray.length; index++)
        {
            System.out.printf(" %d ", MyArray[index]);
        }
        System.out.println("\n");

        PrintOneDArray(MyArray);
    
        System.out.println("Print My2DArray");
        int[][] My2DArray = {{1,2,3}, {4,5}};

        for(int row = 0; row < My2DArray.length; row++)
        {
            for(int col = 0; col < My2DArray[row].length; col++)
            {
                System.out.printf(" %d ", My2DArray[row][col]);
            }
            System.out.println("\n");
        }

    }

    public static void PrintOneDArray(int[] array)
    {
        System.out.println("Printing with the method.");
        for(int index = 0; index < array.length; index++)
        {
            System.out.printf(" %d ", array[index]);
        }
        System.out.println('\n');
    }

}
