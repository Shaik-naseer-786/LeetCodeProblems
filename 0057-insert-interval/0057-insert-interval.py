class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        merged=[]
        i=0
        while i<len(intervals) and intervals[i][1]<newInterval[0]:
            merged.append(intervals[i])
            i+=1
        while i<len(intervals) and intervals[i][0]<=newInterval[1]:
            newInterval=[min(intervals[i][0],newInterval[0]),max(intervals[i][1],newInterval[1])]
            i+=1
        merged.append(newInterval)
        while i<len(intervals):
            merged.append(intervals[i])
            i+=1
        return merged