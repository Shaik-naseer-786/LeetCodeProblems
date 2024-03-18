class Solution:
    def findMinArrowShots(self, points: List[List[int]]) -> int:
        points.sort(key=lambda x:x[0])
        # print(points)
    
        arrow=1
        end=points[0][1]
        for i in points[1:]:
            if i[0]>end:
                arrow+=1
                end=i[1]
            else:
                end=min(end,i[1])
        return arrow