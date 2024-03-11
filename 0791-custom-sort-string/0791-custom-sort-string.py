class Solution:
    def customSortString(self, order: str, s: str) -> str:
        mp={}
        for i in s:
            mp[i]=mp.get(i,0)+1
        print(mp)
        ans=""
        for i in order:
            if i in mp:
                ans+=i*mp[i]
                del mp[i]
        for i in mp:
            ans+=i*mp[i]
        return ans