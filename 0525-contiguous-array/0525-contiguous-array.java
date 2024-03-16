class Solution {
    public int findMaxLength(int[] nums) {
        int maxLength=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int count=0;
        mp.put(0,-1);
        for(int i=0;i<nums.length;i++){
            count+=nums[i]==0?-1:1;
            if(mp.containsKey(count)){
                maxLength=Math.max(maxLength,i-mp.get(count));
            }
            else{
                mp.put(count,i);
            }
        }
        return maxLength;
    }
    
}