class Solution:
    def minOperations(self, logs: List[str]) -> int:
        stack = []
        for log in logs:
            operation = log[:-1]
            if operation == "..":
                if stack:
                    stack.pop()
            elif operation != ".":
                stack.append(operation)  
        return len(stack)