public class Main{
    public static void main(String[] args){
        int[] arr1 = Utilities.PartSortedArray(100);
        int[] arr2 = Utilities.PartSortedArray(10000);

        Utilities.printIntArr(arr1);
        Utilities.printIntArr(arr2);

        if(Utilities.isSorted(arr2)){
            System.out.println("Sorted ");
        }
        else System.out.println("Not Sorted");

        merge merger = new merge(arr1, arr2);
        int[] merged = merger.sort();
        Utilities.printIntArr(merged);
    }
}
