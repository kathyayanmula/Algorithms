/**
 * Created by kmula on 2/24/2016.
 */

/*Sorting by comparing one element with all the elements to its left one element at a time. 1,2,0-->1,0,2-->0,1,2*/
public class InsertionSort {

    private int[] unsortedArray;

    public InsertionSort(int[] unsortedArray){
        this.unsortedArray = unsortedArray;
    }

    public int[] sort(){
        int j;
        int tmp;
        for (int i = 1; i < unsortedArray.length ; i++){
            tmp = unsortedArray[i];
            for(j = i-1; j >= 0 && unsortedArray[j] > tmp ; j--){
                unsortedArray[j+1] = unsortedArray[j];
            }
            unsortedArray[j+1] = tmp;
//            swap(i,minIndex);
        }

        return unsortedArray;
    }
}
