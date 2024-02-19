class Solution {
    public int singleNonDuplicate(int[] nums) {
       int left=0,right=nums.length-1;

       while(left<right){
           int mid=left+(right-left)/2;

           if(mid%2==1){
               mid--;
           }

           if(nums[mid]==nums[mid+1]){
               left=mid+2;
           }

           else{
               right=mid;
           }
       }
    // return nums[left];
    // int ans=0;
    // for(int i=0;i<nums.length;i++){
    //  ans=ans^nums[i];
    // }
    //     return ans;
    return right;
    }

    
}
