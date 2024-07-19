class Solution {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        // List to store the minimum elements of each row
        List<Integer> rowMins = new ArrayList<>();
        
        // List to store the maximum elements of each column
        List<Integer> colMaxs = new ArrayList<>();
        
        // Step 1: Find the minimum element in each row
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            rowMins.add(min);
        }

        // Step 2: Find the maximum element in each column
        for (int j = 0; j < matrix[0].length; j++) {
            int max = matrix[0][j];
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            colMaxs.add(max);
        }

        // List to store the lucky numbers
        List<Integer> luckyNumbers = new ArrayList<>();

        // Step 3: Find common elements in rowMins and colMaxs
        for (int min : rowMins) {
            if (colMaxs.contains(min)) {
                luckyNumbers.add(min);
            }
        }

        return luckyNumbers;
    }
}