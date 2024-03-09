class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int n:nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            int a=e.getValue();
            if(a==1){
                    return -1;
                }
            count+=a/3;
            if(a%3!=0){
                count++;
            }
        }
        return count;
        
    }
}