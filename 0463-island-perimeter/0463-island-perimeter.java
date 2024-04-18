class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        // Iterate through each cell in the grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {  // Check if the cell represents land
                    perimeter += 4;  // Each land cell contributes 4 to the perimeter

                    // Check neighboring cells and subtract 1 for each adjacent land cell
                    if (i > 0 && grid[i - 1][j] == 1) {
                        perimeter -= 1;
                    }
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                        perimeter -= 1;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        perimeter -= 1;
                    }
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) {
                        perimeter -= 1;
                    }
                }
            }
        }

        return perimeter;
    }
}
