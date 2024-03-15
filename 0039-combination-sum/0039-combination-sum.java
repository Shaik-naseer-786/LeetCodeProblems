class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        helper(candidates,target,0,new ArrayList<>(),result);
        return result;
    }
    public void helper(int[] candidates,int target,int start,List<Integer> temp,List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList(temp));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(target-candidates[i]>=0){
                temp.add(candidates[i]);
                helper(candidates,target-candidates[i],i,temp,result);
                temp.remove(temp.size()-1);
            }
        }
    }
}