public class ArrayTest {

    public static void main(String[] args)
    {
        int[] array = {3, 5, 10, 14, 16, 19, 20, 25, 28, 35, 37, 40, 51, 52, 
            53, 54, 56, 59, 72, 73, 74, 77, 78, 81, 83, 86, 90, 93, 95, 100};

            MyBarChart.outputBarChart(array);

            MyMax.outputMax(array);

            MyMin.outputMin(array);

            MyAvg.outputAvg(array);

    }
}
