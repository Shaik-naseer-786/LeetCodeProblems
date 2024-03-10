class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans=0;
        Arrays.sort(happiness);
        int n=happiness.length-1;
        for(int i=0;i<k;i++){
            if(happiness[n]-i>0){
                ans+=happiness[n]-i;
                n--;
            }
        }
        return ans;
    }
}