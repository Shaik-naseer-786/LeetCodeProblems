class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length==0 || hand.length%groupSize!=0){
            return false;
        }
        Arrays.sort(hand);
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:hand){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int num:hand){
            if(mp.get(num)>0){
                for(int i=0;i<groupSize;i++){
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