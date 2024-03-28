class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        return helper(grid,0,0,dp);
    }
    public int helper(int[][] grid,int r,int c,int[][]dp){
        if(r==grid.length-1&&c==grid[0].length-1){
            return grid[r][c];
        }
        if(r>=grid.length||c>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[r][c]!=0){
            return dp[r][c];
        }
        int right=helper(grid,r,c+1,dp);
        int down=helper(grid,r+1,c,dp);
        int res=Math.min(right,down)+grid[r][c];
        dp[r][c]=res;
        return res;
    }
}