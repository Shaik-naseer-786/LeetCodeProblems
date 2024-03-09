class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int count=0;
        for(int num:tasks){
            mp.put(num,mp.getOrDefault(num,0)+1);
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