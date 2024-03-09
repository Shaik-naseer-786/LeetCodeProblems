class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int n:nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        int size=nums.length/3;
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            int i=e.getValue();
            if(i>size){
                ans.add(e.getKey());
            }
        }
        return ans;
    }
}