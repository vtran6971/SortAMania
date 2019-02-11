public class Team4SortCompetition extends SortCompetition{
    @Override
    public int challengeOne(int[] arr) {
        return 0;
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        return 0;
    }

    @Override
    public int challengeThree(int[] arr) {
        return 0;
    }

    @Override
    public int challengeFour(int[][] arr) {
        return 0;
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

////////////////////////////////////////////////////Main////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////SimpleMerge////////////////////////////////////////////////////////////

    public static int[] simpleMerge(int[] arr1, int[] arr2) {
    int[] arr3 = new int[arr1.length+arr2.length];
    //int i =0,j=0,k=0;
    for (int i = 0; i < arr2.length;i++){
        for(int j = 0;j < arr1.length;j++){
            if (arr1[j]>arr2[i]){

            }
        }
    }
    return arr3;
}

////////////////////////////////////////////////////Merge///////////////////////////////////////////////////////////////
private static int[] arr1;
    private static int[] arr2;
    private int[] arrOut;

    public Team4SortCompetition(int[] arr1, int[] arr2){
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.arrOut = new int[arr1.length + arr2.length];
    }

    public static int[] MergeSort(){
        int[] arrOut = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        while (i + j < arrOut.length) {
            if (i > arr1.length){
                for (; j < arr2.length; j++){
                    arrOut[j + i] = arr2[j];
                }
            }
            else if(j > arr2.length){
                for (; i < arr1.length; i++){
                    arrOut[j + i] = arr1[i];
                }
            }
            else if (arr1[i] >= arr2[j]) {
                arrOut[i + j] = arr1[i];
                i++;
            } else {
                arrOut[i + j] = arr2[j];
                j++;
            }
        }
        return arrOut;
    }

//////////////////////////////////////////////////CustomSort////////////////////////////////////////////////////////////
private int[] arr;

    public Team4SortCompetition(int[] arr){
        this.arr = arr;
    }

    public int[] sort(){
        int[] sorted = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            while (arr[i] < arr[i + 1]){
                int[] smallList = new int[] {arr[i], arr[i + 1]};
                merge merger = new merge(smallList, sorted);
                sorted = sort();
                i += 2;
            }
        }
        return sorted;
    }

//////////////////////////////////////////////////Insertion/////////////////////////////////////////////////////////////
public static void insertionSort(int[] arr)
{
    int count = 0;
    int indexToInsert = 0;
    int insertMin = 0;

    //First for loop checks through the array to find the insertion candidates
    for (int i = 1; i < arr.length; i++)
    {
        //Insertion candidates are checked against all previous indexes
        for (int j = i-1; j >= 0; j--)
        {
            //if the candidate is less than the previous index, increment counter
            if(arr[i] < arr[j]) {
                count++;
            }
            else
            {
                j = -1;
            }
            insertMin = arr[i];
            indexToInsert = i-count;
        }
        //Runs while there are still shifts needed to be made to make room for insertion candidate
        while(count > 0) {
            arr[i] = arr[i-1];
            if(count == 1)
            {
                arr[indexToInsert] = insertMin;
            }
            i--;
            count--;
        }
    }
}

//////////////////////////////////////////////////Utilities/////////////////////////////////////////////////////////////

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
        else return (arr[mediani]);
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

    public static void bubbleSortStrings (String[] array)
    {
        int test;
        for (int j = 1; j < array.length; j++) {
            for (int i = 0; i != array.length - 1; i++) {
                test = array[i].compareTo(array[i + 1]);
                if (test > 0) {
                    swapString(array, i);
                }
            }
        }
    }
}

