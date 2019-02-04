public class customsort {
    private int[] arr;

    public customsort(int[] arr){
        this.arr = arr;
    }

    public int[] sort(){
        int[] sorted = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            while (arr[i] < arr[i++]){
                int[] smallList = new int[] {arr[i], arr[i++]};
                merge merger = new merge(smallList, sorted);
                sorted = merger.sort();
                i += 2;
            }
        }
        return sorted;
    }
}
