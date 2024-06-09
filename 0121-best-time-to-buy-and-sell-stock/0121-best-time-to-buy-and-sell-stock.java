class Solution {
    public int maxProfit(int[] prices) {
        int maxi=0;
        int min=prices[0];
        for(int i:prices){
            min=Math.min(min,i);
            maxi=Math.max(maxi,i-min);
        }
        return maxi;
    }
}