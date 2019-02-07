public class merge {

   /* private static int[] arr1;
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
                for (; j < arr2.length-3; j++){
                    arrOut[j + i] = arr2[j];
                }
            }
            else if(j > arr2.length){
                for (; i < arr1.length-3; i++){
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
    }*/
   
   ///Mergesort from Folwell
   public static void mergeSort(int[] arr)
   {
       int n = arr.length;
       int[] temp = new int[n];
       mergeSortHelper(arr, 0, n-1, temp);
   }

    public static void mergeSortHelper(int[] arr, int left, int right, int[] temp)
    {
        if(left < right)
        {
            int mid = (left + right)/2;
            mergeSortHelper(arr, left, mid, temp);
            mergeSortHelper(arr, mid +1, right, temp);
            merge(arr, left, mid ,right, temp);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right, int[] temp)
    {
        int i = left;
        int j = mid+1;
        int k = left;

        while(i <= mid && j <= right)
        {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j<= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(k= left; k<= right; k++)
        {
            arr[k] = temp[k];
        }
    }
}
