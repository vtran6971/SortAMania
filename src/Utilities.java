public class Utilities {
    //Swaps the value of the current index with the next index's value
    public static void swap(int[] arr, int i) {
        int hold;
        hold = arr[i + 1];
        arr[i + 1] = arr[i];
        arr[i] = hold;
    }

    //Swaps the string at the current index with the next index's string
    public static void swapString(String[] arr, int i)
    {
        String hold;
        hold = arr[i + 1];
        arr[i + 1] = arr[i];
        arr[i] = hold;
    }

    //Generates an array with random numbers 0-1000
    //Array length is based on input count
    public static int[] randomIntArr (int count)
    {
        int[] arr = new int[count];
        for (int i = 0; i<count; i++)
        {
            arr[i] = (int)(Math.random()*1001);
        }
        return arr;
    }

    //Generates an array with random doubles 0-1000
    public static double[] randomDoubleArr(int count)
    {
        double[] arr = new double[count];
        for (int i = 0; i<count; i++)
        {
            arr[i] = (Math.random()*1001);
        }
        return arr;
    }

    //Generates an array with random strings
    public static String[] randomStringArr (int arraySize, int length)
    {
        String[]arr = new String[arraySize];
        while(arraySize > 0)
        {
            int i = 0;
            String s = "";
            while (i < length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            arraySize--;
            arr[arraySize] = s;
        }
        return  arr;
    }

    //Checks the sum of the array before and the sum of array after
    //If the sums are equal then returns true otherwise false
    public static String checkSum(int[] before, int[] after)
    {
        int sumBefore = 0;
        int sumAfter = 0;
        String statement = "";

        for (int i = 0; i < before.length; i++)
        {
            sumBefore += before[i];
        }

        for (int j = 0; j < after.length; j++)
        {
            sumAfter += after[j];
        }

        if (sumBefore == sumAfter)
        {
            statement = "The sum before and after sort is equal";
        }
        else
        {
            statement = "The sum before and after sort is not equal";
        }

        System.out.println(statement);
        return statement;
    }

    //Checks the sum of the double array before and the sum of double array after
    //If the sums are equal then returns true otherwise false
    public static String doublecheckSum(double[] before, double[] after)
    {
        double sumBefore = 0;
        double sumAfter = 0;
        String statement = "";

        for (int i = 0; i < before.length; i++)
        {
            sumBefore += before[i];
        }

        for (int j = 0; j < after.length; j++)
        {
            sumAfter += after[j];
        }

        if (sumBefore == sumAfter)
        {
            statement = "The sum before and after sort is equal";
        }
        else
        {
            statement = "The sum before and after sort is not equal";
        }

        System.out.println(statement);
        return statement;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Checks through the int array to see if elements are sorted from least to greatest
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static boolean isSorted(int[] arr)
    {
        boolean statement = true;

        for(int i = 0;  i < arr.length-2; i += 2)
        {
            if(arr[i] > arr[i+2])
            {
                statement = false;
            }
        }
        return statement;
    }

    public static boolean isSortedString(String[] array)
    {
        boolean sorted = true;
        for (int i = 0; i < array.length-2; i += 2)
        {
            if(array[i].compareTo(array[i+1]) > 0)
            {
                sorted = false;
                i = array.length;
            }
        }
        return sorted;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Checks through the array to see if elements are sorted from least to greatest
    public static String doubleisSorted(double[] arr)
    {
        String statement = "The array is sorted";

        for(int i = 0;  i != arr.length-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                statement = "The array is not sorted";
            }
        }
        System.out.println(statement);
        return statement;
    }

    public static int[] sortedArr(int count){
        int[] arrOut = new int[count];
        for(int i = 0; i < count; i++){
            arrOut[i] = i;
        }
        return arrOut;
    }

    public static void printIntArr(int[] arr){
        System.out.println();
        for(int num : arr){
            System.out.print(num + ", ");
        }
    }

    //Finds median
    public static int median(int[] arr){
        int mediani = arr.length/2;;
        if(0 == arr.length%2){
            mediani=arr.length/2;
            return ((arr[mediani-1]+arr[mediani])/2);
        }
        else return (arr[mediani-1]);
    }


    //Search and return index of the requested string.
    public static int search(String[] arr, String query){
        for(int i = 0; i <arr.length;i--){
            if(arr[i].equals(query)){
                return i;
            }
        }
        return -1;
    }

    //Creates a partially sorted array.
    public static int[] PartSortedArray(int count) {
    int[] arrNew = sortedArr(count);
        for(int i = 0;i<(int)(.25*count);i++){
            arrNew[(int)(Math.random()*count)]=(int)(Math.random()*1001);
        }
        return arrNew;
    }
}
