#include <stdio.h>

int prime(long n)
{
    int i;
    for(i=2;i<=n/2;i++)
    {
        if(n%i!=0)
            continue;
        else
            return 1;
    }
    return 0;
}


int check_prime(long first, long second, long third ){
    int a,b,c;
    a = prime(first);
    b = prime(second);
    c = prime(third);
    int sum = 3-(a+b+c);
    
   return sum;
}
int main()
{
    
    long int a,b,c;
int p;
printf("Pythagorean triples for a, b, and c all no larger than 500\n");
printf("and at least 1 side is prime.\n");
printf("Prime#\tSides\n");
for(a=1; a<=500;a++)
for(b=1; b<=500;b++)
for(c=1; c<=500;c++)
if ( a*a + b*b == c*c )
{
if ( (p = check_prime(a, b, c ))> 0)
printf("%d\t%ld %ld %ld\n" ,p, a, b, c);
}
return 0;

}
