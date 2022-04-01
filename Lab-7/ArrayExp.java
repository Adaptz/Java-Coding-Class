public class ArrayExp 
{
    public static void main(String[] args)
    {


        int [] arr = {2, 3, 4, 5, 6, 9, 8, 7, 1, 8};
        System.out.println("After (a) new array of ten integers");
        System.out.print("arr ==>  ");
        printArray(arr);
        System.out.println();


        int [] original = arr;
        System.out.println("After (b) step 1 of expansion");
        System.out.print("arr ==>  ");
        printArray(arr);
        System.out.print("original ==>  ");
        printArray(original);
        System.out.println();


        System.out.println("After (c) step 2 of expansion");
        arr = new int[12];
        System.out.print("arr ==>  ");
        printArray(arr);
        System.out.print("original ==>  ");
        printArray(original);
        System.out.println();
 

        System.out.println("After (c) step 3 of expansion (copy original integers)");
        for(int index = 0; index < original.length; index++)
        arr[index] = original[index];
        System.out.print("arr ==>  ");
        printArray(arr);
        System.out.print("original ==>  ");
        printArray(original);
        System.out.println();


        System.out.println("After (d)");
        original = null;
        System.out.print("arr ==>  ");
        printArray(arr);
        System.out.print("original ==>  null");
    }

    public static void printArray(int[] array)
    {
        for (int index = 0; index < array.length; index++)
        
            if(index != array.length - 1)
            System.out.printf("%d, ", array[index]);
            else
            System.out.printf("%d", array[index]);
        
        System.out.println();
    }
}
