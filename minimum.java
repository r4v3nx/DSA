
public class minimum {
    public static void main(String[] args){
        int[] arr = {3,-1,9,10,0,91,-2};
        System.out.println(minimumNo(arr));
    }
    static int minimumNo(int[] arr){
        int temp;
        int min = Integer.MAX_VALUE;
        if(arr.length==0){
            return -1;
        }
        for (int j : arr) {
            temp = j;
            if (temp < min) {
                min = temp;
            }
        }
        return min;

    }
}
