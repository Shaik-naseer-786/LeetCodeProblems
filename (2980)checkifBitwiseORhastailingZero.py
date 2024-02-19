def fun(nums):
    for i in range(len(nums)):
        for j in range(i+1,len(nums)):
            k=nums[i] | nums[j]
            if(k&1)==0:
                return True 
    return False
nums = [1,3,5,7,9]
print(fun(nums)) 