class Solution {
    public int firstMissingPositive(int[] nums) {
        
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);

        }
        int n=set.size();
        for(int i=1;i<n+2;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
        
        
    }
}