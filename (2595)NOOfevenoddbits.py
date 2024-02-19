def fun(n):
    even=0
    odd=0
    i=0
    lis1=[]
    while(n>0):
        if(i%2==0):
            if((n&1)==1):
                even+=1
        else:
            if((n&1)==1):
                odd+=1
        i+=1 
        n=n>>1
    lis1.append(even)
    lis1.append(odd)
    return lis1 
n=17
print(fun(n))    
