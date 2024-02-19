def fun(n):
    res=[]
    for i in range(n+1):
        count=0
        temp=i 
        while(temp):
            count+=1
            temp=temp&(temp-1)
        res.append(count)
    return res 

n=5
print(fun(n)) 