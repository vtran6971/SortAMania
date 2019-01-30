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

    //Checks through the int array to see if elements are sorted from least to greatest
    public static String isSorted(int[] arr)
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
}
