#include <stdio.h>
int main()
{
	int f,s;
	printf("Enter the first number: ");
	scanf("%d",&f);
	printf("Enter the second number: ");
	scanf("%d",&s);
	int n=s;
	int d=s;
    int r;
    while (n != 0)
    {
        r=d%n;
        d=n;
        n=r;
    }
    printf("The gcd of %d and %d is: %d",f,s,d);
}
