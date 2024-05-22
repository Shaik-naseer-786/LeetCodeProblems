class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        helper(s,0,new ArrayList<>(),result);
        return result;
    }
    public void helper(String s,int start,List<String> temp,List<List<String>> result){
        if(start==s.length()){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start+1;i<=s.length();i++){
            String substring = s.substring(start, i);
            if (isPalindrome(substring)) {
                temp.add(substring);
                helper(s, i, temp, result);
                temp.remove(temp.size() - 1);
            }
        }
    }
    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}