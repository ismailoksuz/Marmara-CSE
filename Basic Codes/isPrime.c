#include<stdio.h>
int main(){
	int num;
	printf("Input:");
	scanf("%d",&num);
	int i=2;
	while(i<(num/2)+1){
		if(num%i==0){
			printf("%d is not prime.",num);
			return 0;
		}
		i++;
	}
	printf("%d is prime.",num);
}
