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

    // twoSum using two Pointer Solution
    Arrays.sort(nums);
    int pointer_one = 0;
    int pointer_two = nums.length - 1;
    // int[] result = new int[2];

        while (pointer_one < pointer_two)

    {
        // int sum = nums[pointer_one] + nums[pointer_two];

        if (nums[pointer_one] + nums[pointer_two] == target) {
            // result[0] = pointer_one;
            // result[1] = pointer_two;
            return new int[]{pointer_one, pointer_two};
            // return result;
        } else if (nums[pointer_one] + nums[pointer_two] < target) {
            pointer_one++;
        } else {
            pointer_two--;
        }
    }

    }
        return new int[] {} ;


}

}


