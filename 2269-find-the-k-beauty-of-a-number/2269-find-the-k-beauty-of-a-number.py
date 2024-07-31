class Solution:
    def divisorSubstrings(self, num: int, k: int) -> int:
        num_str = str(num)
        length = len(num_str)
        count = 0
        
        for i in range(length - k + 1):
            substring = num_str[i:i+k]
            substring_int = int(substring)
            
            # Check if substring_int is a divisor of num and not zero
            if substring_int != 0 and num % substring_int == 0:
                count += 1
                
        return count
