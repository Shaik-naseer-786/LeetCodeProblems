from typing import List

class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        if k == 1:
            return 0
        
        n = len(nums)
        if k > n:
            return 0  # or some appropriate value if `k` is invalid

        # Sort the array
        nums.sort()
        
        # Initialize ans with a large number
        ans = float('inf')
        
        # Find the minimum difference using a sliding window
        for i in range(n - k + 1):
            ans = min(ans, nums[i + k - 1] - nums[i])
        
        return ans
