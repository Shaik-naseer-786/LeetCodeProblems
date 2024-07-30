class Solution:
    def longestNiceSubstring(self, s: str) -> str:
        def is_nice(char_count) -> bool:
            # A substring is nice if every character has both its lowercase and uppercase present
            for c in char_count:
                if c.swapcase() not in char_count:
                    return False
            return True
        
        n = len(s)
        if n < 2:
            return ""

        max_len = 0
        longest_nice_substr = ""

        for left in range(n):
            char_count = {}
            for right in range(left, n):
                char_count[s[right]] = char_count.get(s[right], 0) + 1
                
                if is_nice(char_count):
                    current_len = right - left + 1
                    if current_len > max_len:
                        max_len = current_len
                        longest_nice_substr = s[left:right+1]

        return longest_nice_substr


