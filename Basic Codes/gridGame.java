package ioksuz;
import java.util.Random;
import java.util.Scanner;

public class Pro5_1_150119516 {
	
	//CREATE A METHOD TO MOVE THE USER
		public static void movement( char [][] game , char rotation,int current,int current2) {
		
		//ASK THE USER WHERE HE WANTS TO MOVE 
		System.out.print("Choose your direction (R,L,U,D): ");	
			
			
			//FIRST CONDITION TO THE LEFT
			if ( rotation == 'L') {
				game[current][current2]='+';
				game[current][current2-1]='X';

				
				
				
				
			//SECOND CONDITION TO THE RIGHT	
			}else if ( rotation == 'R') {
				game[current][current2]='+';
				game[current][current2+1]='X';

				
				
				
			//THIRD CONDITION TO THE UPWARD
			}else if ( rotation == 'U') {
				game[current][current2]='+';
				game[current-1][current2]='X';

				
				
				
			//FOURTH CONDITION TO THE DOWNWARD	
			}else if ( rotation == 'D') {
				game[current][current2]='+';
				game[current+1][current2]='X';

				
				
				
				
			}
			
		}
	    
	    //CREATE MAIN METHOD HERE 
		public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	//START THE GAME 
	System.out.println("Welcome to grid game.");

	//ASK THE DIRECTION TO THE USER
	System.out.print("Please enter the grid size: ");

	//AN INPUT VARIABLE FOR SIZE 
	int size = scan.nextInt();

	//GENERATE RANDOM NUMBER 
	Random r =  new Random();

	//A VARIABLE FOR INT 
	int move =  (int)(2.5*size);



	char [][] game = new char[size][size];

	//CREATE A FOR LOOP TO PRINT *
	for ( int i = 0 ; i < size/2;i++) {
		
		 //PRINT THE *
		 game [r.nextInt(size)][r.nextInt(size)] = '*'  ;
	}

	//DEFINE AND VARIABLE CURRENT 
	int current = 0 ;

	//DEFINE AND VARIABLE CURRENT2 
	int current2 = 0 ;

	//THE PLACE OF THE USER 
	game[0][0]='X';

	//SHOW AND PRINT THE LOCATION OF THE USER
	System.out.println("You are on   "+ "("+current+","+current2+")" );
	System.out.println("Choose your direction (R,L,U,D): ");

	//CREATE A FOR LOOP TO PRINT GRID FRAMES (|)
	for (int m = 0 ; m<size;m++) {
		
		//PRINT THE GRID FRAMES
		System.out.print("|");
		
		//CREATE A FOR LOOP 
		for (int n =0 ; n<size; n++ ) {
			System.out.print(game[m][n]);
			
		}
		
		//PRINT THE |
		System.out.println("|");
		
	}

	//CREATE A WHILE LOOP 
	while(move>0) {
		char rotation = scan.next().charAt(0);
		movement(game,rotation,current,current2);
		
		//CRATE AN IF STRUCTURE TO MOVE LEFT
		if ( rotation == 'L') {
			current2--;
			
		//CREATE AN ELSE IF STRUCTURE TO MOVE RIGHT	
		}else if ( rotation == 'R') {
		current2++;
		
		//CREATE AN ELSE IF STRUCTURE TO MOVE UPWARD
		}else if ( rotation == 'U') {
		current--;	
		
		//CREATE AN ELSE IF STRUCTURE TO MOVE DOWNWARD
		}else if ( rotation == 'D') {
	current++;
		}
		System.out.println();
				//CREATE A FOR LOOP 
		for (int m = 0 ; m<size;m++) {
			
			System.out.print("|");
			
			//CRATE A FOR LOOP 
			for (int n =0 ; n<size; n++ ) {
				System.out.print(game[m][n]);
				
			}
			
			System.out.println("|");
			
		}
		
		//DEFINE COUNT AS AN INTEGER '0'
		int count = 0 ;
		
		//CREATE A FOR LOOP
		for (int m = 0 ; m<size;m++) {
			
			//CRATE A FOR LOOP 
			for (int n =0 ; n<size; n++ ) {
			    
	//CRATE AN IF STRUCTURE		    
	if(game[m][n]=='*') {
		
		count++;
	}


			}
		
		}
		
		//CRATE AN IF STRUCTURE
		if( count == 0) {
			
			//IF THE USER HAS WON, PRINT 'YOU WIN'
			System.out.println("YOU WIN");
		}
		
		
		
	}

	//CREATE A FOR LOOP 
	for (int m = 0 ; m<size;m++) {
		
		//CRATE A FOR LOOP 
		for (int n =0 ; n<size; n++ ) {

	//CREATE AN IF STRUCTURE
	if(game[m][n]=='*') {

	//PRINT 'GAME OVER'
	System.out.println("GAME OVER");
	}

	//CREATE ELSE STRUCTURE
	else {
	    
	//PRINT 'YOU WIN'    
	System.out.println("YOU WIN");
	}
		}

	}

	}

	}
		 