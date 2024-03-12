class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hp=new HashSet<>();
        for(int num:nums){
            if(hp.contains(num)){
                return num;
            }
            else{
                hp.add(num);
            }
        }
        return -1;
    }
}