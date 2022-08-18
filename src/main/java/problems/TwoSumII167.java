package problems;

public class TwoSumII167 {

    public static int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;
        // int[] result = new int[2];

        while (start < end){
            int sum = numbers[start] + numbers[end];

            if (sum == target){
                return new int[] {start+1, end+1};
            } else if (sum < target){
                start++;
            } else {
                end--;
            }
        }

        return new int[] {start+1, end+1};
    }


    public static void main(String[] args) {
        int[] input = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(input, target));

    }
}
