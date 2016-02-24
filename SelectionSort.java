/**
 * Created by kmula on 2/24/2016.
 */
public class SelectionSort {
    public static void main(String args[]){
        int[] numbers = {1,2,0,3,4,5,0,6,3,1,0,9,5,4,0};
        int minIndex = 0;
        for(int i = 0; i < numbers.length; i++) {
            /*
            int k =0;
            int j = numbers.length - 1;
            while (j>k){
                if (numbers[j-1] > numbers[j]) {
                    int tmp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tmp;

                }
                j--;
            }
            k++;*/
            minIndex=i;
            for(int j=i+1; j < numbers.length; j++){
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = tmp;
        }
        //System.out.print(numbers.length);
        for (int i : numbers){
            System.out.print(i);
        }
    }

}
