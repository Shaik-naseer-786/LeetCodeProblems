class Solution {
    public int lengthOfLastWord(String s) {
        int len=s.length();
        int right=len-1;
        int count=0;
        while(right>=0 && s.charAt(right) == ' '){
            right--;
        }
        while(right>=0 && s.charAt(right--) != ' '){
            count++;
        }
        return count;
    }
}