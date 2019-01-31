public class Main{
    public static void main(String[] args){
        int[] arr1 = Utilities.sortedArr(100);
        int[] arr2 = Utilities.sortedArr(100);

        Utilities.printIntArr(arr1);
        Utilities.printIntArr(arr2);

        merge merger = new merge(arr1, arr2);
        int[] merged = merger.sort();
        Utilities.printIntArr(merged);
    }
}
