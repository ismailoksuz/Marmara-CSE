/* Name: Ismail OKSUZ
 * ID: 150119516   
 */
public class Pro3_1_150119516{
	public static void main(String[] args) {
				// TEST NUMBER WHICH WILL BE INCREASED BY1 EVERY STEP
				int num = 2;				
		// LOOP TO TEST NUMBERS ONE BY ONE
				while(true) {					
		// A VARIABLE TO KEEP THE VALUE OF THE NUMBER 
					int b = num;					
		// RESULT WHICH WILL HAVE THE VALUE OF CUBS OF THE DIGITS
					int result = 0;					
		// WHILE LOOP TO EXTRACT DIGITS FROM NUMBER
					while(b != 0) {						
		// DIGIT VARIABLE WHICH WILL HAS THE NEXT DIGITS VALUE EVERY STEP
						int digit = b % 10;						
		// INCREASE THE RESULT BY THE CUB OF THE CURRENT DIGIT
						result += digit*digit*digit;						
		// REMOVE LAST DIGIT FROM THE NUMBER TO MOVE ON
						b = (b-(b%10))/10;
					}
		// IF RESULT EQUALS TO NUMBER ITSELF BREAK THE LOOP PRINT THE RESULT			
					if(result == num) {						
						System.out.println(num + " is the smallest positive Armstrong number, excluding 1.");						
						break;
					}
		// INCREASE NUMBER BY 1			
					num++;				
		} 																				
	}
}
