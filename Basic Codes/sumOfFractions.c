#include <stdio.h>
int gcd(int n, int d)
{
    int gcd, r;
    while (n != 0)
    {
        r=d%n;
        d=n;
        n=r;
    }
    gcd=d;
    return gcd;
}
int main()
{
    int n1,d1,n2,d2;
    printf("Enter the first numerator: ");
    scanf("%d",&n1);
    printf("Enter the first denominator: ");
    scanf("%d",&d1);
    printf("Enter the second numerator: ");
    scanf("%d",&n2);
    printf("Enter the second denominator: ");
    scanf("%d",&d2);
    int n=(n1*d2)+(n2*d1);
    int d=(d1*d2);
    printf("Output:\n%d/%d+%d/%d=%d/%d",n1,d1,n2,d2,n/gcd(n,d),d/gcd(n,d));
    return 0;
}

