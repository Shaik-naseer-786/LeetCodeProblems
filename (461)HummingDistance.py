class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        n=x^y
        count=0
        while(n):
            if(n&1)==1:
                count+=1
            n=n>>1
        return count        
