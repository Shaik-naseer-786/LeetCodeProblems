class Solution:
    def makeGood(self, s: str) -> str:
        stack=[s[0]]
        for i in range(1,len(s)):
            if(len(stack)!=0):
                if abs(ord(stack[-1])-ord(s[i]))==32:
                    stack.pop()
                else:
                    stack.append(s[i])
            else:
                stack.append(s[i])
        ans=""     
        for i in range(len(stack)):
            ans=ans+stack[i]
        return ans      
            
            
        