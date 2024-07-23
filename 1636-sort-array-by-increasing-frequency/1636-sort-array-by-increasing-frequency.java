class Solution {
    public int[] frequencySort(int[] nums) {
        // Step 1: Count the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a list from the array
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }

        // Step 3: Sort the list based on the custom comparator
        numList.sort((a, b) -> {
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);
            if (freqA == freqB) {
                return b - a; // If frequencies are the same, sort by value in descending order
            }
            return freqA - freqB; // Sort by frequency in ascending order
        });

        // Step 4: Convert the list back to an array
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = numList.get(i);
        }
        return result;
    }
}