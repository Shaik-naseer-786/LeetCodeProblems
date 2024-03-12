class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        if not intervals:
            return []
        intervals.sort(key=lambda x:x[0])
        stack=[]
        stack.append(intervals[0])

        for i in range(1,len(intervals)):
            curr=intervals[i]
            top=stack[-1]

            if(curr[0]<=top[1]):
                top[1]=max(curr[1],top[1])
            else:
                stack.append(intervals[i])
        return stack