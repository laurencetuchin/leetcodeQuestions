package problems;

public class SquareOfSortedArray {

    // brute force solution

    int[] numSquared = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
        numSquared[i] = nums[i] * nums[i];
    }

        Arrays.sort(numSquared);
        return numSquared;



}
