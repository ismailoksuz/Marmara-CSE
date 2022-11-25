package csehomework;
import java.util.Scanner;
public class Pro2_150119516 {

	public static void main(String[] args) {
        
		//Firstly, we need to know the billing amount.
		Scanner scbill = new Scanner(System.in);		
		System.out.println("Enter the billing amount:");
		double bill=scbill.nextDouble();
		
		// Then, we need to know the amount of money that customer gave to the cashier.
		
		Scanner scmoney = new Scanner(System.in);
		System.out.println("Enter the money given:");
		double money=scmoney.nextDouble();
		
		// Now, we know these two values. So, we can calculate the amount of the change.
		double left=money-bill;
		
		int twohund,onehund,fifty,twelve,ten,five,one,ftkr,tfkr,tkr,fkr,okr;
		
		    twohund = (int) (left/200);
		    left-=twohund*200;		
		
			onehund = (int) (left/100);
			left-=onehund*100;
			
			fifty = (int) (left/50);
			left-=fifty*50;

		    twelve = (int) (left/20);	
			left-=twelve*20;

			ten = (int) (left/10);
			left-=ten*10;

			five = (int) (left/5);		
		  	left-=five*5;
		
			one = (int) (left/1);
			left-=one*1;

			ftkr = (int) (left/0.5);
			left-=ftkr*0.5;
				
			tfkr = (int) (left/0.25);
			left-=tfkr*0.25;	
			
			tkr = (int) (left/0.1);
			left-=tkr*0.1;
				
			fkr = (int) (left/0.05);
			left-=fkr*0.05;
				
			okr = (int) (left/0.01);
			left-=okr*0.01;
		
		//Finally, we can see how much and how cashier will give money to the customer.
		System.out.println(twohund + " 200TL" + "\n" + onehund + " 100TL" + "\n"+ fifty + " 50TL" +"\n" + 
						twelve + " 20TL" +"\n"+  ten + " 10TL"+"\n" + five + " 5TL"+"\n" + one + " 1TL"
					+"\n"+ftkr+" 50KR"+"\n"+tfkr+" 25KR"+"\n"+tkr+" 10KR"+"\n"+fkr+" 5KR"+"\n"+okr+" 1KR"
		); 
	}

}



/* İsmail ÖKSÜZ
   150119516 */