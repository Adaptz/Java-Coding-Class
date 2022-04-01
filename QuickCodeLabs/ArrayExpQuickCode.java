public class ArrayExpQuickCode 
{    
    public static void main(String[] args) {
 
     int[] MyGradesArray = {87, 90, 78, 92, 96, 82};
     System.out.println("MyGradesArray");
     printArray(MyGradesArray);

     int[] CopyMyGrades = MyGradesArray;
     System.out.println("CopyMyGrades");
     printArray(CopyMyGrades);
     
     MyGradesArray = new int[10];
     System.out.println("New MyGradesArray");
     printArray(MyGradesArray);
   
     for(int indx = 0; indx < CopyMyGrades.length; indx++)
         MyGradesArray[indx] = CopyMyGrades[indx];
     
     System.out.println("Completed Expansion of MyGradesArray");
     printArray(MyGradesArray);
  
     CopyMyGrades = null;
     //printArray(CopyMyGrades);
   
    
    }
    public static void printArray(int[] array)
    {
        for (int index = 0; index < array.length; index++)
        
            System.out.printf(" %d ",array[index]);
        
        System.out.println();
    }
}
