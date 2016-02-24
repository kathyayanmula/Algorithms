/**
 * Created by kmula on 2/24/2016.
 */

/*Find the minimum value in every iteration and swap it with the element at index i. Later do the same for rest of the unsorted array.*/
public class SelectionSort {

    private int[] unsortedArray;

    public SelectionSort(int[] unsortedArray){
        this.unsortedArray = unsortedArray;
    }

    public int[] sort(){
        for(int i = 0; i < unsortedArray.length; i++) {
            int minIndex=i;
            for(int j=i+1; j < unsortedArray.length; j++){
                if (unsortedArray[j] < unsortedArray[minIndex]) {
                    minIndex = j;
                }
            }
            swap(i, minIndex);
        }

        return unsortedArray;
    }

    public int[] swap(int i, int minIndex){
        int tmp = this.unsortedArray[i];
        this.unsortedArray[i] = this.unsortedArray[minIndex];
        this.unsortedArray[minIndex] = tmp;
        return this.unsortedArray;
    }

}
