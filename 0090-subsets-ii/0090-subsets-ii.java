class Solution {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Sort the array to handle duplicates
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    private static void generateSubsets(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(currentSubset));

        for (int i = index; i < nums.length; i++) {
            // Skip duplicates
            if (i > index && nums[i] == nums[i - 1]) continue;

            currentSubset.add(nums[i]);
            generateSubsets(nums, i + 1, currentSubset, subsets);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
}