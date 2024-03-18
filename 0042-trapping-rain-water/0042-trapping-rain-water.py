class Solution:
    def trap(self, height: List[int]) -> int:
        left=0
        right=len(height)-1
        leftMax=0
        rightMax=0
        trapWater=0
        while(left<right):
            if(height[left]<height[right]):
                if(height[left]>=leftMax):
                    leftMax=height[left]
                else:
                    trapWater+=leftMax-height[left]
                left+=1
            else:
                if(height[right]>=rightMax):
                    rightMax=height[right]
                else:
                    trapWater+=rightMax-height[right]
                right-=1
        return trapWater