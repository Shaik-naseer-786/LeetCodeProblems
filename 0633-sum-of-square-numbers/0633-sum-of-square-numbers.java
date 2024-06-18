class Solution {
    public boolean judgeSquareSum(int c) {
        int high=(int) Math.sqrt(c);
        HashSet<Integer> hs=new HahSet<>();
        for(int i=0;i<=high;i++){
            hs.add(i*i);
        }
        for(int i=0;i<=high;i++){
            int ans=c-(i*i);
            if(hs.contains(ans)){
                return true;
            }
        }
        return false;
    }
}