class Solution:
    def decrypt(self, code: List[int], k: int) -> List[int]:
        n=len(code)
        if(k==0):
            return [0]*n
        res=[0]*n
        if k>0:
            for i in range(n):
                sum=0
                for j in range(1,k+1):
                    sum+=code[(i+j)%n]
                res[i]=sum
        else:
            k=-k
            for i in range(n):
                sum=0
                for j in range(1,k+1):
                    sum+=code[(i-j)%n]
                res[i]=sum
        return res