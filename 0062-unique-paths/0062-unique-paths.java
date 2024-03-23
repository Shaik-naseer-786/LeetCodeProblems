class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m+1][n+1];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return helper(m,n,dp);
    }
    public int helper(int r,int c,int[][] dp){
        if(r==1 || c==1){
            return 1;
        }
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        int down=helper(r-1,c,dp);
        int right=helper(r,c-1,dp);
        return dp[r][c]=down+right;
    }
}