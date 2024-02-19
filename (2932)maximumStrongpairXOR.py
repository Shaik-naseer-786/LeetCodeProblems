def fun(nums):
    maxi=0
    for x in nums:
        for y in nums:
            if(abs(x-y)<=min(x,y)):
                k=x^y 
                if(k>maxi):
                    maxi=k
    return maxi 
nums = [10,100]
print(fun(nums))   