class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> outer=new ArrayList<>();
        if(digits.isEmpty()){
            return outer;
        }
        String[] alpas={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        helper("",digits,alpas,outer);
        return outer;
    }
    public void helper(String p, String up,String[] alpas,List<String> outer){
        if(up.isEmpty()){
            outer.add(p);
            return;
        }
        else{
            String letters=alpas[up.charAt(0)-'2'];
            for(char ch:letters.toCharArray()){
                helper(p+ch,up.substring(1),alpas,outer);
            }
        }
    }
}