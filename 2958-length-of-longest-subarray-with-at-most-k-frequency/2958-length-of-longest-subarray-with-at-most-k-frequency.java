class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int j=0;
        int max=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
            while(mp.get(nums[i])>k){
                mp.put(nums[j], mp.getOrDefault(nums[j], 0)-1);
                j++;
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}