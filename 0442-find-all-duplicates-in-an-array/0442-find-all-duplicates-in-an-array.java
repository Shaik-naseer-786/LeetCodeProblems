class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result=new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            if(e.getValue()>1){
                result.add(e.getKey());
            }
        }
        return result;
    }
}