class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        white_count=0
        for i in range(k):
            if blocks[i]=='W':
                white_count+=1
        # white_count = sum(1 for i in range(k) if blocks[i] == 'W')
        min_color=white_count
        for i in range(1,len(blocks)-k+1):
            if blocks[i-1]=='W':
                white_count-=1
            if blocks[i+k-1]=='W':
                white_count+=1
            min_color=min(min_color,white_count)
        return min_color