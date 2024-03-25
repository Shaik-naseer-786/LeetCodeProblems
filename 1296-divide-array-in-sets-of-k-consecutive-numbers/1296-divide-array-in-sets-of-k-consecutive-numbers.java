class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length==0 || nums.length%k!=0){
            return false;
        }
        Arrays.sort(nums);
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int num:nums){
            if(mp.get(num)>0){
                for(int i=0;i<k;i++){
                    int nextNum=num+i;
                    if(!mp.containsKey(nextNum) || mp.get(nextNum)<=0){
                        return false;
                    }
                    mp.put(nextNum,mp.getOrDefault(nextNum,0)-1);
                }

            }
        }
        return true;
    }
}