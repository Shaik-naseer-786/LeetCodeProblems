class Solution {
    public int minIncrementForUnique(int[] nums) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        int[] freq=new int[max+nums.length];
        for(int num:nums){
            freq[num]++;
        }
        int ans=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]<=1) continue;
            int dup=freq[i]-1;
            freq[i+1]+=dup;
            ans+=dup;
        }
        return ans;
    }
    
}