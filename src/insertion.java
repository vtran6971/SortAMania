public class insertion {
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

}
