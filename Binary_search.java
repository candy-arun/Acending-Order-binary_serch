public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 0;
        System.out.println(binary_search(arr,target));

    }
    static int binary_search(int[] arr , int target) {
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid-1;
            }
            else if (arr[mid] == target) {
                return mid;
            }

        }
        return -1;

    }

}
