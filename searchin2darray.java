import java.util.Arrays;

public class searchin2darray {
public static void main(String[] args){
    int[][] arr = {
            {1,2,3},
            {9,18,5},
            {6,7,14}
    };
    System.out.println(search2dmax(arr));
}
static int search2dmax(int[][] arr){
    int max = Integer.MIN_VALUE;
    for(int i=0; i<arr.length;i++){
        for(int j=0; j<arr[i].length;j++){
            int temp = arr[i][j];
            if(temp>max){
                max = temp;
            }
        }
    }
    return max;
}
}
