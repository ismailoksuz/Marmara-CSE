/* Name: ismail öksüz
 * ID: 150119516   
 */

import java.util.Scanner;
public class Pro3_2_150119516 {	


		public static void main(String[] args) {

	// CREATE AN INSTANCE OF SCANNER CLASS
		    Scanner scan=new Scanner (System.in);

	// ASKING FOR A CHARACTER
		    System.out.println("Enter a character: ");

	// ASSIGN THE INPUT VALUE TO A VARIABLE
			String character=scan.nextLine();

	// ASKING FOR A NUMBER
			System.out.println("Enter a number: ");

	// ASSIGN THE INPUT VALUE TO A VARIABLE
			int NumberOfRows=scan.nextInt();
	
	// CREATE VARIABLE "LINE" WITH VALUE OF 2*NUMBER + 1 		
			int line;
			
			line = 2 * NumberOfRows + 1;
			
	// FOR LOOP TO CREATE THE SHAPE ON THE CONSOLE		
			for(int i = 0; i < line; i++) {
				
				// FIRST HALF OF THE SHAPE : (row_num-i) times "*" and char and again (row_num-i) times "*" again
				if(i <= NumberOfRows) {
					
					// A FOR LOOP TO PUT "." BEFORE THE CHARACTER
					for(int j = NumberOfRows - i; j > 0; j--) {
						System.out.print(".");
					}
					// A FOR LOOP TO PUT 2i+1 TIMES CHARACTER
					for(int t = 2 * i + 1; t > 0; t--) {
						System.out.print(character);
					}
					// A FOR LOOP TO PUT "." AFTER THE CHARACTER
					for(int j = NumberOfRows - i; j > 0; j--) {
						System.out.print(".");
					}
					
					// JUMPS TO NEW LINE
					System.out.println();
					
					
					
				} 
				
				// SECOND HALF OF THE SHAPE : (i-row_num) times "*" and char and again (i-row_num) times "*" again
				else if(i > NumberOfRows && i <= line) {
					
					// A FOR LOOP TO PUT "." BEFORE THE CHARACTER
					for(int t = i - NumberOfRows; t > 0; t--) {
						System.out.print(".");
					}
					
					// A FOR LOOP TO PUT 2i+1 TIMES CHARACTER
					for(int k = 2 * (line - i) - 1; k > 0; k--) {
						System.out.print(character);
					}
					
					// A FOR LOOP TO PUT "." AFTER THE CHARACTER
					for(int t = i - NumberOfRows; t > 0; t--) {
						System.out.print(".");
					}
					
					//JUMPS TO NEW LINE
					System.out.println();
			}
		}
	}
}
