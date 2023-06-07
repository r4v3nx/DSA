public class InfiniteArray {
    public static void main(String[] args) {
int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
int target = 12;
        System.out.println(infinitearraysearch(arr,target));
    }

    static int infinitearraysearch(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (end < target) {
            start = end;
            end = end * 2;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
