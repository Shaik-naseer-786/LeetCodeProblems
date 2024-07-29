class Solution:
    def numberOfAlternatingGroups(self, colors: List[int]) -> int:
        if not colors:
            return 0
        count=0
        n=len(colors)
        for i in range(n):
            prev=(i-1+n)%n
            curr=i
            next=(i+1)%n 
            if(colors[prev]!=colors[curr] and colors[curr]!=colors[next]):
                count+=1
        print(count)
        return count