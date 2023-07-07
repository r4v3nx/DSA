import java.util.Arrays;
public class SelectionSort {
    //[1,2,4,5,3]
    public static void main(String[] args) {
        int[] arr = {13,-3,0,1};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int end = arr.length - 1 - i;

            int maxElement = maxelement(arr,end);
            swap(arr, maxElement, end);
        }
    }
        static int maxelement(int[] arr,int end){
            int max = 0;
            for (int i = 0; i <= end; i++) {
                if (arr[max] < arr[i]) {
                    max = i;
                }
            }
            return max;
        }

        static void swap ( int[] arr, int max, int end){
            int temp = arr[end];
            arr[end] = arr[max];
            arr[max] = temp;


        }
    }
