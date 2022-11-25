//Name: İSMAİL ÖKSÜZ
//ID:   150119516
package pckg;

import java.util.Scanner;

public class Pro4_150119516 {
	
	
	// CHECKING SMITH NUMBER
		public static boolean isSmith(int number){
			
			// COUNTER FOR NUMBERS N = 2,3,4,5,6.....
			int c = 2; 
			
			// A VARIABLE TO KEEP OUR NUMBER'S VALUE TO NOT MAKE CHANGE ON THE ORIGINAL
			int num=number; 
			
			// A VARIABLE TO KEEP SUM OF DIGITS OF OUR NUMBER
			int digit_sum = 0; 
			
			while(num!=0) {
			    
			    // ADD LAST DIGIT TO STORING VARIABLE
				digit_sum += num%10; 
				
				// REMOVE LAST DIGIT
				num = (num - num%10)/10; 
			}
			
			// A VARIABLE TO KEEP SUM OF DIGITS OF THE PRIME NUMBERS
			int digit_sum2 = 0; 
			
			// WHILE COUNTER IS LESS THAN OUR NUMBER
			while(c<=number) { 
				
				// IF THERE IS DIVISOR DIVIDE OUR NUMBER WITH IT, UNTIL OUR NUMBER CANNOT BE DIVIDED WITH IT
				while(number%c==0) { 
					
					// DIVIDER NUMBER
					num = c; 
					
	                //TAKE DIGITS OF THE DIVIDER AND ADD IT TO THE STORING VARIABLE
					while(num!=0) {
						digit_sum2 += num%10;
						num = (num - num%10)/10;
					}
	                
	                // UPDATE OUR NUMBER'S VALUE
					number = number/c; 
				}
				
				// INCREASE COUNTER TO CONTINUE
				c++; 
			}
			
			// COMPARE SUM OF DIGITS OF OUR NUMBER AND SUM OF DIGITS OF THE PRIME NUMBERS
			return digit_sum == digit_sum2; 
		}
		
		// CHECKING TAU NUMBER
		public static boolean isTau(int number) {
			
			// COUNTER FOR NUMBERS N = 0,1,2,3,4...
			int c = 1; 
			
			// STORING VARIABLE TO KEEP THE VALUE OF THE NUMBER OF THE DIVISORS
			int num_of_divs = 0; 
			
			// WHILE COUNTER IS LESS THAN OUR NUMBER
			while(c<=number) { 
				
				// IF A NUMBER CAN BE DIVIDED WITH OUR NUMBER, THEN INCREASE STORING VARIABLE BY 1
				if(number%c==0) {num_of_divs++;} 
				
				// INCREASE COUNTER TO CONTINUE;
				c++; 
			}
			
			// IF REMAINDER OF THE DIVISION (OUR NUMBER / NUMBER OF DIVISORS) IS 0, THEN IT IS A TAU NUMBER
			return (number%num_of_divs) == 0; 
			
		}
		
		// CHECKING WOODALL NUMBER
		public static boolean isWoodall(int number) {
			
			// A COUNTER FOR NUMBERS N = 0,1,2,3,4....
			int c = 0; 
			
			// VARIABLE TO KEEP VALUE OF, 2^N*N-1
			int result; 
	        
	        // WHILE STORING VARIABLE IS SMALLER THAN OUR NUMBER
			while((result = (int) (Math.pow(2, c) * c -1) ) <= number) { 
				
				// INCREASE COUNTER TO CONTINUE
				c++; 
				
				// IF ONE OF THIS FORMATTED NUMBERS EQUALS TO OUR NUMBER, THEN IT IS A WOODALL NUMBER
				if(result==number)return true; 
			}
			
			// IF OUR NUMBER CANNOT BE WRITTEN AS 2^N*N-1, THEN IT IS NOT A WOODALL NUMBER
			return false; 
		}
		
		
		// CHECKING FIBONACCI NUMBER
		public static boolean isFibonacci(int number){
			
			// A VARIABLE TO KEEP VALUE OF THE FIRST NUMBER
			int c = 1; 
			
			// A VARIABLE TO KEEP VALUE OF THE SECOND NUMBER
			int d = 1; 
			
			// POINTER TO KEEP NEXT NUMBER  
			int pointer=0; 
			
			// WHILE POINTER IS SMALLER THAN OUR NUMBER
			while(pointer<number) { 
			    
				// UPDATE THE VALUE OF THE POINTER
				pointer=c+d; 
				
				// UPDATE THE FIRST NUMBER
				c=d;
				
				// UPDATE THE SECOND NUMBER
				d=pointer; 
				
				// IF OUR NUMBER IS IN THIS SEQUENCE THEN IT'S A FIBONACCI NUMBER
				if(number==pointer)return true; 
			}
			
			// IF OUR NUMBER IS NOT IN THIS SEQUENCE THEN IT'S NOT A FIBONACCI NUMBER
			return false; 
		}
		
		
		//CHECKING PERFECT NUMBER
		public static boolean isPerfect(int number) {
			
			// COUNTER FOR DIVIDERS
			int c = 1; 
			
			// VARIABLE TO KEEP VALUE OF THE SUM OF DIVISORS
			int sum=0; 
			
			// UNTIL COUNTER EQUALS TO OUR NUMBER 
			while(c<number) { 
				
				// IF THERE IS A DIVISOR ADD IT TO THE STORING VARIABLE
				if(number%c==0) {sum+=c;} 
				
				//INCREASE COUNTER TO CONTINUE
				c++;
			}
			
			// IF DIVISORS' SUM EQUALS TO OUR NUMBER
			return sum==number; 
		}
		
		

		// CHECKING PRIME NUMBER
		public static boolean isPrime(int number) {
			
			//SMALLEST PRIME NUMBER TO START ACTION
			int c = 2;
			
			//WHILE OUR NUMBER'S REMAINDER IS NOT  0 FOR ALL NUMBERS SMALLER THAN IT
			while((number%c) != 0) { 
				
				// IF THERE IS NO NUMBER WHICH OUR NUMBER CAN BE DIVIDED EXACTLY, THEN  IT'S A PRIME NUMBER
				if(c==(number-1)) {return true;} 
				
				// INCREASE COUNTER TO CONTINUE
				c++; 
			}
			
			// IF THERE IS A NUMBER WHICH CAN BE DIVIDED WITH OUR NUMBER, THEN IT'S NOT PRIME
			return false; 
		}

		
		//CREATE THE MAIN METHOD
		public static void main(String[] args) {
			
			
		    // SCANNER OBJECT
			Scanner sc = new Scanner(System.in); 
			
			// GREETING
			System.out.println("Welcome to Number Finder Program"); 
			
			// UNTIL THE USER STOP THE PROCCESS CONTINUE
			while(true) { 
			
			System.out.print("Enter the smaller positive number: "); 
			int start = sc.nextInt();
		
			// TAKE STARTING POINT FROM USER
	        System.out.print("Enter the bigger positive number: "); 
			int end = sc.nextInt();
			
			// IF THE USER INSERTS A NEGATIVE NUMBER/ NUMBERS RESTART THE PROCCESS
			if(start<0 || end<0) { 
				System.out.println("\nAll of the input values must be positive, \nrestarting...\n");
				continue;
			}
			
			// IF THE SECOND INPUT IS LESS THAN THE FIRST ONE, ASK FOR A NEW VALUE.
			while(end<start) { 
				System.out.print("\nThe second number should not be less than the first one.\nPlease enter new value for the second input:");
				end=sc.nextInt();}
			
			//PRINT OPTIONS
			System.out.println("1.Prime numbers between "+start + " and " + end);
			System.out.println("2.Perfect numbers between "+start + " and " + end);
			System.out.println("3.Fibonacci numbers between "+start + " and " + end);
			System.out.println("4.Woodall numbers between "+start + " and " + end);
			System.out.println("5.Tau numbers between "+start + " and " + end);
			System.out.println("6.Smith numbers between "+start + " and " + end);
			System.out.print("Please enter your menu choice ( 0 for exit):");
			
			int menu=sc.nextInt();
			
			//CREATE A WHILE LOOP TO GET VARIABLE INPUT FROM THE USER
			 while(menu>6 || menu<0 ){
	        
	        //ASK UNTIL THE USER ENTER A VARIABLE VALUE
	        System.out.println ("Please re-enter your menu choice in range of 1-6 to run that program or 0 for exit: ");
	        
	        //ASK FOR A NEW VALUE OF THE 'MENU'
	        menu = sc.nextInt ();
	        
	        //CLOSE THE WHILE LOOP HERE
	        }
	        
	        
	        //CREATE A SWITCH CASE STRUCTURE TO LIST THE MENU TO THE USER
			switch(menu){
			
			
			
			// IF 0 IS PRESSED EXIT
			
			case 0 : 
			    System.exit(1);
			
			// IF 1 IS PRESSED TEST THE NUMBERS IN THE RANGE AND IF IT SATISFY THE CONDITION BEING PRIME PRINT IT
			case 1 : {
				
				//DEFINE SUM AS '0'
				int sum=0;
				
				//CREATE A FOR LOOP
				for(int i = start ; i<=end ; i++)
				if(isPrime(i)) {
				System.out.print(i+" ");
				
				sum=sum+1;
								
			}
			
			//IF THERE IS NO PRIME NUMBERS IN THAT RANGE, PRINT "NO PRIME NUMBERS FOUND BETWEEN THE FIRST INPUT AND THE SECOND INPUT
			if(sum==0)
				System.out.println("No prime numbers found between "+start+" and "+end+".");
			
			}
			// NEW LINE
			System.out.println();
			break; 
			
			// IF 2 IS PRESSED TEST THE NUMBERS IN THE RANGE AND IF IT SATISFY THE CONDITION BEING PERFECT PRINT IT
	        case 2 : {
	        	
	        	//DEFINE SUM AS '0'
				int sum=0;
				
				for(int i = start ; i<=end ; i++)
				if(isPerfect(i)) {
				System.out.print(i+" ");
				
				sum=sum+1;
			}
				
				//IF THERE IS NO PERFECT NUMBERS IN THAT RANGE, PRINT "NO PRIME NUMBERS FOUND BETWEEN THE FIRST INPUT AND THE SECOND INPUT
				if(sum==0)
					System.out.println("No perfect numbers found between "+start+" and "+end+".");
				
	        }
			
			// NEW LINE
			System.out.println();
			break; 
			
			// IF 3 IS PRESSED TEST THE NUMBERS IN THE RANGE AND IF IT SATISFY THE CONDITION BEING FIBONACCI PRINT IT
	        case 3 : {
	        	
	        	//DEFINE SUM AS '0'
				int sum=0;
				
				for(int i = start ; i<=end ; i++)
				if(isFibonacci(i)) {
				System.out.print(i+" ");
				
				sum=sum+1;
				
		    }
				
				//IF THERE IS NO FIBONACCI NUMBERS IN THAT RANGE, PRINT "NO PRIME NUMBERS FOUND BETWEEN THE FIRST INPUT AND THE SECOND INPUT
				if(sum==0)
					System.out.println("No fibonacci numbers found between "+start+" and "+end+".");
				
	        }
		    
		    // NEW LINE
		    System.out.println();
			break; 
			
			// IF 4 IS PRESSED TEST THE NUMBERS IN THE RANGE AND IF IT SATISFY THE CONDITION BEING WOODALL PRINT IT
	        case 4 : { 
	        	
	        	//DEFINE SUM AS '0'
				int sum=0;				
				
				for(int i = start ; i<=end ; i++)
				if(isWoodall(i)) {
				System.out.print(i+" ");
				
				sum=sum+1;
			}
				
				// IF THERE IS NO WOODALL NUMBERS IN THAT RANGE, PRINT "NO PRIME NUMBERS FOUND BETWEEN THE FIRST INPUT AND THE SECOND INPUT
				if(sum==0)
					System.out.println("No woodall numbers found between "+start+" and "+end+".");
				
	        }
			
			// NEW LINE
			System.out.println();
			break; 
			
			// IF 5 IS PRESSED TEST THE NUMBERS IN THE RANGE AND IF IT SATISFY THE CONDITION BEING TAU PRINT IT
	        case 5 : {
	        	
	        	// DEFINE SUM AS '0'
				int sum=0;
				
				for(int i = start ; i<=end ; i++)
				if(isTau(i)) {
				System.out.print(i+" ");
				
				sum=sum+1;
				
			}
				
				// IF THERE IS NO TAU NUMBERS IN THAT RANGE, PRINT "NO PRIME NUMBERS FOUND BETWEEN THE FIRST INPUT AND THE SECOND INPUT
				if(sum==0)
					System.out.println("No tau numbers found between "+start+" and "+end+".");
				
	        }
			
			// NEW LINE
			System.out.println();
			break; 
			
			// IF 6 IS PRESSED TEST THE NUMBERS IN THE RANGE AND IF IT SATISFY THE CONDITION BEING SMITH PRINT IT
	        case 6 : { 
	        	
	        	// DEFINE SUM AS '0'
				int sum=0;
				
				for(int i = start ; i<=end ; i++)
				if(isSmith(i) && !isPrime(i)) {
				System.out.print(i+" ");
				
				sum=sum+1;
				
			}
				
				// IF THERE IS NO SMITH NUMBERS IN THAT RANGE, PRINT "NO PRIME NUMBERS FOUND BETWEEN THE FIRST INPUT AND THE SECOND INPUT
				if(sum==0)
					System.out.println("No smith numbers found between "+start+" and "+end+".");
				
	        }
			
			// NEW LINE
			System.out.println();
			break; 
			
			}
			
			// ASK USER WHETHER HE WANTS TO CONTINUE OR NOT
			System.out.println("Do you want to find new numbers? (Y/N)"); 
			
			// HE DOESN'T EXIT
			if(sc.next().toUpperCase().equals("N"))
			System.exit(1); 
			
			}
			
			
		}
		
	}