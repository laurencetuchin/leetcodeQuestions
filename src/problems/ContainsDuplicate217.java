package problems;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {

    // brute force solution
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i +1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    // better solution using HashSet

    Set<Integer> foundDuplicate = new HashSet<Integer>();
    for (int i : nums) {
        if (foundDuplicate.contains(i)) return true;
        foundDuplicate.add(i);
    }
    return false;




}
