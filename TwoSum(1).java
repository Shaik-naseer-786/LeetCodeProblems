import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int n = nums.length;
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[] {i, j};
        //         }
        //     }
        // }
        // return new int[]{}; // No solution found

         Map<Integer, Integer> numToIndex = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (numToIndex.containsKey(complement)) {
            return new int[] {numToIndex.get(complement), i};
        }
        numToIndex.put(nums[i], i);
    }
    return new int[]{}; // No solution found!
    }
}