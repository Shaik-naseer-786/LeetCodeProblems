class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        // Frequency array to count available letters
        int[] letterCount = new int[26];
        for (char c : letters) {
            letterCount[c - 'a']++;
        }
        System.out.println(Arrays.toString(letterCount));
        return backtrack(words, letterCount, score, 0);
    }

    private int backtrack(String[] words, int[] letterCount, int[] score, int index) {
        if (index == words.length) {
            return 0;
        }
        
        // Option 1: Skip the current word
        int maxScore = backtrack(words, letterCount, score, index + 1);
        
        // Option 2: Include the current word (if possible)
        int[] currentWordCount = new int[26];
        int currentWordScore = 0;
        boolean canIncludeWord = true;
        
        for (char c : words[index].toCharArray()) {
            currentWordCount[c - 'a']++;
            currentWordScore += score[c - 'a'];
            if (currentWordCount[c - 'a'] > letterCount[c - 'a']) {
                canIncludeWord = false;
            }
        }
        
        if (canIncludeWord) {
            // Use up the letters in letterCount
            for (char c : words[index].toCharArray()) {
                letterCount[c - 'a']--;
            }
            
            // Recurse for next words
            maxScore = Math.max(maxScore, currentWordScore + backtrack(words, letterCount, score, index + 1));
            
            // Restore letterCount after backtracking
            for (char c : words[index].toCharArray()) {
                letterCount[c - 'a']++;
            }
        }
        
        return maxScore;
    }
}
