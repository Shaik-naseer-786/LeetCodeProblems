class Solution {
    public void rotate(int[][] nums) {
        // int r=nums.length;
        // for(int i=0;i<r;i++){
        // for(int j=0;j<i;j++){
        // int temp=nums[i][j];
        // nums[i][j]=nums[j][i];
        // nums[j][i]=temp;
        // }
        // }
        // for(int i=0;i<r;i++){
        // reverse(nums[i]);
        // }
        Stack<Integer> st = new Stack<>();
        for (int[] ar : nums) {
            for (int i : ar) {
                st.push(i);
            }
        }
        System.out.println(st);
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                nums[j][i] = st.pop();
            }
        }
    }
    // public void reverse(int[] arr){
    // int left=0;
    // int right=arr.length-1;
    // while(left<right){
    // int temp=arr[left];
    // arr[left]=arr[right];
    // arr[right]=temp;
    // left++;
    // right--;
    // }
    // }
}