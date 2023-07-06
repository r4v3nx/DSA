import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            boolean swapped = false;
            for(int j = 0; j < (arr.length)-1-i; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
