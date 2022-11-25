num=int(input("Input:"))
i=int(2)
while(i<(num/2)+1):
    if(num%i==0):
        print(num, " is not prime.")
        quit()
    i+=1
print(num, " is prime.")