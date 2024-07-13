class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        rows=len(mat)
        cols=len(mat[0])
        result=[0]*(rows*cols)
        k=0
        for d in range(0,rows+cols):
            if d%2==0:
                r=d if d<rows else rows-1
                c=d-r
                while(r>=0 and c<cols):
                    result[k]=mat[r][c]
                    k+=1
                    r-=1
                    c+=1
            else:
                c=d if d<cols else cols-1
                r=d-c
                while(c>=0 and r<rows):
                    result[k]=mat[r][c]
                    k+=1
                    r+=1
                    c-=1
        return result
