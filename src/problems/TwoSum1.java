package problems;

import java.util.HashMap;
import java.util.HashSet;

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
}


