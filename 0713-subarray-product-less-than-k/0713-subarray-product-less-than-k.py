class Solution:
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        if(k<=0):
            return 0
        count=0
        p=1
        i=0
        for j in range(len(nums)):
            p*=nums[j]
            while p>=k:
                p=p//nums[i]
                i+=1
            count+=j-i+1
        return count