class Solution {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:nums){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> inter=new ArrayList<>(outer.get(i));
                inter.add(num);
                outer.add(inter);
            }
            
        }

        return outer;
    }
    
}