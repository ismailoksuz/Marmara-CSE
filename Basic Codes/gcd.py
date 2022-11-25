f=int(input("Enter the first number: "))
s=int(input("Enter the second number: "))
n=f
d=s
while(n!=0):
    r=d%n
    d=n
    n=r
print("The gcd of",f,"and",s,"is:",d)