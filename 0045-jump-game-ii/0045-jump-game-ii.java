class Solution {
    public int jump(int[] nums) {
        int maxi=0;
        int curr=0;
        int jumps=0;
        for(int i=0;i<nums.length-1;i++){
            maxi=Math.max(maxi,i+nums[i]);
            if(maxi>=nums.length-1){
                jumps++;
                break;
            }
            if(i==curr){
                curr=maxi;
                jumps++;
            }
        }
        return jumps;

    }
}