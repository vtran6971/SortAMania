public class merge {

    private static int[] arr1;
    private static int[] arr2;
    private int[] arrOut;

    public merge(int[] arr1, int[] arr2){
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.arrOut = new int[arr1.length + arr2.length];
    }

    public static int[] sort(){
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
}
