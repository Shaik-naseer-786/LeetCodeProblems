class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        int left = 0, right = 0;
        long count = 0;
        int maxVal, minVal;

        while (right < n) {
            maxVal = nums[left];
            minVal = nums[left];
            for (int i = left; i <= right; i++) {
                maxVal = Math.max(maxVal, nums[i]);
                minVal = Math.min(minVal, nums[i]);
            }

            if (maxVal - minVal >= minK && maxVal - minVal <= maxK) {
                count += right - left + 1;
                right++;
            } else {
                left++;
                right = Math.max(left, right);
            }
        }

        return count;
    }
}
