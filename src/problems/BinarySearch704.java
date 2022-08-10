package problems;

public class BinarySearch704 {
    // brute force solution
//    public int search(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                return i;
//            }
//        } return -1;
//    }

    // better solution using binary search
    public int search(int[] nums, int target) {
        // need low, mid, high ranges
        int low = 0;
        int high = nums.length -1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        if (nums[low] == target) {
            return low;
        }
        return -1;
    }


}
