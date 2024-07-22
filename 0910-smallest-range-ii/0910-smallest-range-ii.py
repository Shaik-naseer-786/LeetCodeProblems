class Solution:
    def smallestRangeII(self, nums: List[int], k: int) -> int:
        n=len(nums)
        nums.sort()
        max_val=nums[-1]
        min_val=nums[0]
        result=max_val-min_val
        for i in range(n-1):
            high=max(max_val-k,nums[i]+k)
            low=min(min_val+k,nums[i+1]-k)
            result=min(result,high-low)
        return result