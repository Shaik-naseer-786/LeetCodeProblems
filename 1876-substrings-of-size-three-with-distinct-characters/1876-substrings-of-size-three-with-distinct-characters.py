class Solution:
    def countGoodSubstrings(self, s: str) -> int:
        n=len(s)
        if(n<3):
            return 0
        count=0
        for i in range(n-2):
            if(len(set(s[i:i+3]))==3):
                count+=1
        return count