class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,12,34,56,98};
        System.out.println(binarySearch(arr,12));
    }
static int binarySearch(int[] arr,int target){
    int start = 0;
    int end = arr.length-1;
    while(start<end){
    int mid = start+(end-start/2);
    if(target<arr[mid]){
    end = mid-1;
    }
    else if(target>arr[mid]){
        start = mid+1;
    }
    else{
        return mid;
    }
    
}
return -1;
}
}
