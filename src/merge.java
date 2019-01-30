public class merge {

    private int[] arr1;
    private int[] arr2;

    public merge(int[] arr1, int[] arr2){
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public static int[] sort(int[] arr1, int[] arr2){
        int[] arrOut = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++){
            while (arr1[i] > arr2[i]){
                arrOut[i*2] = arr2[i];
            }
            arrOut[i*2 + 1] = arr1[i];
        }
        return arrOut;
    }
}
