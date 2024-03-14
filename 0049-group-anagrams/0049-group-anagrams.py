class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map={}
        for word in strs:
            sort_word=''.join(sorted(word))
            if sort_word in map:
                map[sort_word].append(word)
            else:
                map[sort_word]=[word]
        return list(map.values())