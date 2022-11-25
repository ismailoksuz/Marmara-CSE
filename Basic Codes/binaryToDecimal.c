#include <stdio.h>
int main(){
	printf("Input: ");
	int i;
	scanf("%d",&i);
	int temp=i;
	int res=0;
	int e=0;
	while(temp!=0){
		if(2<=(temp%10)){
			printf("\nAny digit of the input exceeds the base value 2.\nProgram ended");
			return 0;
		}
		else{
			temp=temp/10;
		}
	}
	while(i!=0){
		res+=(i%10)*(pow(2,e));
		i/=10;
		e++;
	}
	printf("Output: %d",res);
	return 0;
}

