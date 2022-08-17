package problems;

import java.util.Arrays;

public class SquareOfSortedArray {

    // brute force solution

    public static int[] squareOfSortedArrayBruteForce(int[] nums) {

    int[] numSquared = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
        numSquared[i] = nums[i] * nums[i];
    }

        Arrays.sort(numSquared);
        return numSquared;
    }

    // two pointer solution

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        // starting iteration on right side, compares right side to left side bc already sorted
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > nums[right]) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        return result;

    }



    public static void main(String[] args) {
        int[] input = new int[]{-4,1,0,3,10};
        System.out.println(Arrays.toString(squareOfSortedArrayBruteForce(input)));

        int[] numsInput = new int[]{-5,-1,0,1,4,6};
        System.out.println(Arrays.toString(sortedSquares(numsInput)));
    }

}
