class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }

        List<Character>[]bucket=new List[s.length()+1];
        for(char key:mp.keySet()){
            int freq=mp.get(key);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        StringBuilder result=new StringBuilder();
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(char c:bucket[i]){
                    for(int j=0;j<i;j++){
                        result.append(c);
                    }
                }
            }
        }
        return result.toString();
    }
}