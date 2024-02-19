class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        result[0]=findfirst(nums,target);
        result[1]=findlast(nums,target);

        return result;
    }

    static int findfirst(int[] nums,int target){
        int i=-1;
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }

            if(nums[mid]==target){
                i=mid;
            }
        }
        return i;
    }

    static int findlast(int[] nums,int target){
        int i=-1;
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<=target){
                left=mid+1;
            }
            else{
               
                right=mid-1;
            }

            if(nums[mid]==target){
                i=mid;
            }
        }
        return i;
    }
}