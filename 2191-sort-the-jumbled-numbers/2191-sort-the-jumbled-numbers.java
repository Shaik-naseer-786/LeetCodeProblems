class Solution {
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int num:nums){
            hp.put(num, helper(num, mapping));
        }
        System.out.println(hp);
        List<Integer> numList=new ArrayList<>();
        for(int i:nums){
            numList.add(i);
        }
        // System.out.println(numList);
        numList.sort((a, b) -> {
            int mappedA = hp.get(a);
            int mappedB = hp.get(b);
            // if(mappedA==mappedB){
            //     return a-b;
            // }
            // return mappedA-mappedB;
            return Integer.compare(mappedA, mappedB);
        });
        // System.out.println(numList);
        int[] sortedNums=new int[nums.length];
        for (int i = 0; i < sortedNums.length; i++) {
            sortedNums[i]=numList.get(i);
        }
        return sortedNums;
    }
    public static int helper(int num,int[] mapping){
        StringBuilder sb=new StringBuilder();
        for (char digit: String.valueOf(num).toCharArray()) {
            sb.append(mapping[digit-'0']);
        }
        return Integer.parseInt(sb.toString());
    }
}