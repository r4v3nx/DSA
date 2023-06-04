public class linearsearch {
    //function parameters: int[] arr, an element
    //return -1 if length of the array is zero
    //check every element in the array using a for loop, if element found return the index
    //if element not found return -1
    public static void main(String[] args){
        int[] arr = {23,56,7,-2,6,24,10,100,540,1,-10};
        int result = linearSearch(arr,7);
        System.out.println(result);
    }
    static int linearSearch(int[] arr,int element){
        if(arr.length==0){
            return -1;
        }
        for(int i = 0; i<arr.length; i++){
            int temp = arr[i];
            if(temp == element){
                return i;
            }
        }
        return -1;
    }
}
