class Solution {
    public int[] runningSum(int[] nums) {
        if(nums.length<=1){
            return nums;
        }  
        int n=nums.length;
        for(int i=1;i<n;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}