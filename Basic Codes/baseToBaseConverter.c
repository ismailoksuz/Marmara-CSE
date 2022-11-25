#include <stdio.h>
#include <stdlib.h>
int main(){
	printf("Welcome to Base Converter Program!");
	printf("\nPlease enter the base value that your input has (2 to 10): ");
	int bi=baseController();
	printf("Input:");
	int num=numberController(bi);
	int dec=toDec(bi,num);	
	printf("\nEnter the base value that you want to convert (2 to 10): ");
	int br=baseController();
	int result[32];			
    	int i=0,j;   
    	while(dec>0){
    		result[i++]=dec%br;
        	dec/=br;
    	}
    	printf("%d (base %d) in base %d is: ",num,bi,br);
    	for (j=i-1;j>=0;j--)
    		printf("%d",result[j]);
    	printf("\n\n\n-------Program ended.-------");
	}

int numberController(int i){	//Checks whether any digit of input number is higher than initial base value
	int num;
	int j;
	scanf("%d",&num);
	int temp=num;
	while(temp!=0){
		if(i<=(temp%10)){
			printf("\nAny digit of the input exceeds the base value!!!\nEnter a valid input:");
			return numberController(i);
		}
		else{
			temp=temp/10;
		}
	}
	return num;	
}
int baseController(){	//Checks whether the input value between 2 and 10
	int i;
	scanf("%d",&i);
	while((i>10)||(i<2)){
		printf("\nYou entered an invalid number!!!\nEnter a valid value:");
		scanf("%d",&i);
	}
	return i;
}
int toDec(int bi, int num){		//Converts the given number with given base to decimal value
	int ie=0;
	int dec=0;
	while(num!=0){
		dec=dec+(num%10)*(pow(bi,ie));
		ie++;
		num=num/10;
	}
	return dec;
	
}


