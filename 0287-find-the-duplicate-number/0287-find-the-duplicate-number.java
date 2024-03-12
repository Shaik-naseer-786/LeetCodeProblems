class Solution {
    public int findDuplicate(int[] nums) {
        // HashSet<Integer> hp=new HashSet<>();
        // for(int num:nums){
        //     if(hp.contains(num)){
        //         return num;
        //     }
        //     else{
        //         hp.add(num);
        //     }
        // }
        // return -1;

        int[] arr=new int[nums.length+1];
        for(int num:nums){
            arr[num]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1){
                return i;
            }
        }
        return -1;
    }
}