public class Main{
    public static void main(String[] args){
        int[] arr1 = Utilities.PartSortedArray(100);

        Utilities.printIntArr(arr1);

        customsort felSort = new customsort(arr1);
        System.out.println("hello, bitch");
        Utilities.printIntArr(felSort.sort());
    }
}
