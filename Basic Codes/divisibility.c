#include <stdio.h>
int main(){
	int x;
	printf("Welcome to the Divisibility Checker Program!\n\n\nThat program checks whether the number is divisible by the sum of its digits or not.\n\n\n");
	printf("Enter the number that you want to check: ");
	scanf("%d",&x);
	int sum = sumofdigits(x);
	printf("The number that you entered was: %d\n",x);
	printf ("Sum of digits of %d --> ",x);	
	int y=x;
	while(y != 0){
        while (y>10){
        	int i = y % 10;
        	y = y / 10;
        	printf("%d + ", i);
		}
		printf("%d = %d", y,sum);
		y = y / 10;
    }
    if(x%sum==0){
		printf("\n%d is divisible by %d. (result: %d)\n",x,sum,x/sum);
	}
	else{
		printf("\n%d is NOT divisible by %d. (result: %f)\n",x,sum,(float)x/(float)sum);
	}

}
int sumofdigits(int x){			
	int i,r;
	while(x>0){    
		r=x%10;    
 		i+=r;    
		x/=10;    
}    
	return i;
}

