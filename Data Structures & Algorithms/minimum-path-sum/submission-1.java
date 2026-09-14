class Solution {
    public int helper(int i, int j, int m, int n, int[][] dp, int[][] grid){
        if(i >= m || j >= n) return 100000;
        if(i == m-1 && j == n-1){
            dp[i][j] = grid[i][j];
        }
        if(dp[i][j] != -1) return dp[i][j];
        int right = helper(i+1, j, m, n, dp, grid);
        int down = helper(i, j+1, m, n, dp, grid);
        return dp[i][j] = grid[i][j]+Math.min(right, down);
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] i : dp){
            Arrays.fill(i, -1);
        }

        return helper(0, 0, m, n, dp, grid);
    }
}