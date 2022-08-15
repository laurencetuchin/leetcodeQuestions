package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class TwoSum1 {

    // brute force solution
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target){
                return new int[] {i,j};
            }
        }
    }
        return new int[] {};


    // Using HashMap

    public int[] twoSum(int[] nums, int target) {

        int[] answer = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(target - nums[i],i);
            } else {
                answer[0] = i;
                answer[1] = map.get(nums[i]);
                break;
            }
        }
        return answer;


        // twoSum using two Pointer Solution
        // requires array to be sorted before using two pointers
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int[] result = new int[2];

        while (start < end){
         int sum = nums[start] + nums[end];
        // checks sum is equal to target, if yes, puts values in results array, if no and less, start gets incremented, if no and higher, end gets decremented.
        if (sum == target) {
             result[0] = start;
             result[1] = end;
        } else if (sum < target) {
            start++;
        } else {
            end--;
        }
    }

        return result;


}


}


