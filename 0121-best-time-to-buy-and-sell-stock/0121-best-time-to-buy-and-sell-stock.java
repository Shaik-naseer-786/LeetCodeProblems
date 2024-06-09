class Solution {
    public int maxProfit(int[] prices) {
        // int maxi=0;
        // int min=prices[0];
        // for(int i:prices){
        //     min=Math.min(min,i);
        //     maxi=Math.max(maxi,i-min);
        // }
        // return maxi;
        int[] dp=new int[arr.length];
        int minPrice=arr[0];
        for(int i=1;i<arr.length;i++){
            minPrice=Math.min(minPrice,arr[i]);
            dp[i]=Math.max(dp[i-1],arr[i]-minPrice);
        }
        return dp[arr.length-1];
    }
}