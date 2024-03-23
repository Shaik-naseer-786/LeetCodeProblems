class Solution {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp=new int[obstacleGrid.length+1][obstacleGrid[0].length+1];
        for(int[] a:dp){
            Arrays.fill(a, -1);
        }
        return helper(obstacleGrid,obstacleGrid.length-1,obstacleGrid[0].length-1,dp);
    }
    private static int helper(int[][] obstacleGrid, int r, int c, int[][] dp) {
        if (r < 0 || c < 0 || obstacleGrid[r][c] == 1) {
            return 0;
        }
        if (r == 0 && c == 0) {
            return 1;
        }
        if (dp[r][c] != -1) {
            return dp[r][c];
        }

        int down = helper(obstacleGrid, r - 1, c, dp);
        int right = helper(obstacleGrid, r, c - 1, dp);
        return dp[r][c] = down + right;
    }
    
    
}
