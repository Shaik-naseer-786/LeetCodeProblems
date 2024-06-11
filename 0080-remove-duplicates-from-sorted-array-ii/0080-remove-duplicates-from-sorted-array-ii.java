class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length; // Arrays with length 2 or less do not need any modification
        
        int i = 2; // Start from the third position
        
        for (int j = 2; j < nums.length; j++) {
            // Compare the current element with the element at the position i-2
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j]; // Place the current element at the current position
                i++; // Move to the next position
            }
        }
        
        return i; // The length of the array with at most two duplicates of each element
    }
}
