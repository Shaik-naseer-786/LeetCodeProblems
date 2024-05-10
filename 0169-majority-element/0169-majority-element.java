class Solution {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }
        System.out.println(mp.toString());
        int maj=nums[0];
        int n=nums.length/2;
        for(int i=0;i<nums.length-1;i++){
            // System.out.println(mp.get(nums[i]));
            if(mp.get(nums[i])>n){
                System.out.println(nums[i]);
                maj=nums[i];
            }
        }
        return maj;
    }
}