def fun(n):
    count=0
    while(n):
        if(n&1)==1:
            count+=1
        n=n>>1
    return count
n=7
print(fun(n))

