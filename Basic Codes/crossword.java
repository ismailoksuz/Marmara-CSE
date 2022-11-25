//Name: Ismail Oksuz
//ID:   150119516

package ioksuz;
import java.util.Random;
import java.util.Scanner;

public class Pro5_2_150119516 {
	// A METHOD TO FIND CROSS WORDS
		public static boolean findCrossWord(String [][] grid , String keyword) {
			
			// ROW SIZE
			int rowSize = grid.length; 
			
			// COLUMN SIZE
			int columnSize = grid[0].length;
			
			// i VALUES FOR ROWS
			for(int i = 0 ; i<rowSize ; i++) {
				
				// j VALUES FOR COLUMNS 
				for(int j = 0 ; j<columnSize ; j++) {
					
					// VARIABLE TO KEEP THE CHARACTER VALUE AT THE CURENT LOCATION
					String letter = grid[i][j];
					
					// IF IT IS EQUAL TO FIRST LETTER OF OUR WORD
					if(letter.equals(keyword.charAt(0)+"")) {
						
						// KEEP CHECKING NEXT CHARACTERS
						checkwordloop : for(int k = 1 ; k<keyword.length() ; k++) {
							
							// NEXT ROW NUMBER
							int x = i+k;
							// NEXT COLUMN NUMBER
							int y = j+k;
							
							// IF THE NEXT NUMBERS ARE OUT OF BOUND BREAK THE LOOP
							if(x>=rowSize) {break checkwordloop;}
							if(y>=columnSize) {break checkwordloop;}
							
							// A VARIABLE TO KEEP THE NEXT CHARACTER VALUE
							letter = grid[x][y];
							
							// IF NEXT CHAR IS ALSO EQUAL TO NEXT LETTER IN OUR WORD JUMP TO NEXT STEP 
							if(letter.equals(keyword.charAt(k) + "")) {
							
								// IF THESE PROCESS COMES TO LAST LETTER OF OUR WORD THEN WE HAVE THAT WORD IN THE PUZZLE
								if(k==keyword.length()-1) {return true;} 
								
								// ELSE JUMP
								continue checkwordloop;
							}
							
						}
					}
					
					
				}
				
			}
			
			// IF THE PROCESS FINISHES WITHOUT A MATCH THEN RETURN FALSE
			return false;
		}

		// A METHOD TO FIND HORIZONTAL WORDS
		public static boolean findHorizontalWord(String[][] grid, String keyword) {
			
			// COLUMN SIZE
			int columnSize = grid[0].length; 
			
			// ROW SIZE
			int rowSize = grid.length;
			
			// i VALUES FOR ROWS
			for(int i = 0 ; i<rowSize ; i++) {
				
				// j VALUES FOR COLUMNS
				columnloop : for(int j = 0 ; j<columnSize ; j++) {
					
					// VARIABLE TO KEEP THE CHARACTER VALUE AT THE CURENT LOCATION
					String letter = grid[i][j];
					
					// IF IT IS EQUAL TO FIRST LETTER OF OUR WORD
					if(letter.equals(keyword.charAt(0) + "")) {
					
						// KEEP CHECKING NEXT CHARACTERS
						checkwordloop : for(int k = 1 ; k<keyword.length() ; k++) {
						
						// NEXT ROW NUMBER
						int x = i;
						// NEXT COLUMN NUMBER
						int y = j+k;
						
						// IF THE NEXT NUMBERS ARE OUT OF BOUND BREAK THE LOOP
						if(y>=columnSize) {break columnloop;}
						
						// A VARIABLE TO KEEP THE NEXT CHARACTER VALUE
						letter = grid[x][y];
						
						
						// IF NEXT CHAR IS ALSO EQUAL TO NEXT LETTER IN OUR WORD JUMP TO NEXT STEP 
						if(letter.equals(keyword.charAt(k) + "")) {
						
							// IF THESE PROCESS COMES TO LAST LETTER OF OUR WORD THEN WE HAVE THAT WORD IN THE PUZZLE
							if(k==keyword.length()-1) {return true;}
							
							// ELSE JUMP
							continue checkwordloop;
						}
					}
					
					}
				
				}
			}
			
			// IF THE PROCESS FINISHES WITHOUT A MATCH THEN RETURN FALSE
			return false;
		}
		
		// A METHOD TO FIND VERTICAL WORDS
		public static boolean findVerticalWord(String[][] grid , String keyword) {
			
			
			// COLUMN SIZE
			int columnSize = grid[0].length; 
		
			// ROW SIZE
			int rowSize = grid.length;
		
			// i VALUES FOR COLUMNS
			for(int i = 0 ; i<columnSize ; i++) {
			
				// j VALUES FOR ROWS
				rowloop : for(int j = 0 ; j<rowSize ; j++) {
				
					// VARIABLE TO KEEP THE CHARACTER VALUE AT THE CURENT LOCATION
					String letter = grid[j][i];
				
					// IF IT IS EQUAL TO FIRST LETTER OF OUR WORD
					if(letter.equals(keyword.charAt(0) + "")) {

						// KEEP CHECKING NEXT CHARACTERS
						checkwordloop : for(int k = 1 ; k<keyword.length() ; k++) {
					
							// NEXT ROW NUMBER
							int x = j+k;
							// NEXT COLUMN NUMBER
							int y = i;
					
							// IF THE NEXT NUMBERS ARE OUT OF BOUND BREAK THE LOOP
							if(y>=columnSize) {break rowloop;}
					
							// A VARIABLE TO KEEP THE NEXT CHARACTER VALUE
							letter = grid[x][y];
					
							// IF NEXT CHAR IS ALSO EQUAL TO NEXT LETTER IN OUR WORD JUMP TO NEXT STEP 
							if(letter.equals(keyword.charAt(k) + "")) {
					
								// IF THESE PROCESS COMES TO LAST LETTER OF OUR WORD THEN WE HAVE THAT WORD IN THE PUZZLE
								if(k==keyword.length()-1) {return true;}
						
								// ELSE JUMP
								continue checkwordloop;
							}
						}
				
					}
			
				}
			}
		
			// IF THE PROCESS FINISHES WITHOUT A MATCH THEN RETURN FALSE
		
			return false;
		}
		
		// A METHOD TO USE CROSS, HORIZONTAL, VERTICAL METHODS COMBINED
		public static boolean findWord(String[][] grid , String keyword) {
			
			// IF THERE IS A CROSS WORD RETURN TRUE
			if(findCrossWord(grid,keyword)) {return true;}
			// IF NOT TRY IT WITH THE REVERSE OF THE KEYWORD
			else if (findCrossWord(grid, new StringBuilder(keyword).reverse().toString())) {return true;}
			
			// IF THERE IS A HORIZONTAL WORD RETURN TRUE
			if(findHorizontalWord(grid,keyword)) {return true;}
			// IF NOT TRY IT WITH THE REVERSE OF THE KEYWORD
			else if (findHorizontalWord(grid, new StringBuilder(keyword).reverse().toString())) {return true;}
			
			// IF THERE IS A VERTICAL WORD RETURN TRUE
			if(findVerticalWord(grid,keyword)) {return true;}
			// IF NOT TRY IT WITH THE REVERSE OF THE KEYWORD
			else if (findVerticalWord(grid, new StringBuilder(keyword).reverse().toString())) {return true;}
			
			// IF NONE OF THESE CONDITIONS WEREN'T ACCOMPLISHED RETURN FALSE
			return false;
		}
		
		
		// A METHOD TO CREATE, PRINT AND RETURN OUR PUZZLE 
		public static String[][] createPuzzle(int row, int col) {
			
			// JUMP TO NEW LINE FOR BETTER LOOKING
			System.out.println();
			
			// RANDOM OBJECT TO CREATE THE RANDOM INDEX FOR OUR CHARSET
			Random ran = new Random();
			
			// LETTERS
			String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			
			// NUMBERS
			String numbers = "0123456789";
			
			// LETTERS AND NUMBERS AS A CHAR ARRAY
			char[] chars = (alphabet + numbers).toCharArray();
			
			// OUR MAP
			String[][] map = new String[row][col];
			
			// i VALUES FOR ROW NAVIGATION
			for(int i = 0 ; i<row ; i++) {
				
				// j VALUES FOR COLUMN NAVIGATION
				for(int j = 0 ; j<col ; j++) {
					
					// CREATE A RANDOM CHAR BY REFFERING THE CHARACTER OF OUR CHAR SET WITH OUR RANDOM INDEX VALUE
					String letter = chars[ran.nextInt(chars.length)] +"";
					
					// PRINT THE CHAR
					System.out.print(letter + " ");
					
					// ASSIGN THE LETTER TO OUR MAP'S CURRENT LOCATION
					map[i][j] = letter;
				}
				
				// NEW LINE FOR NEW ROW
				System.out.println();
			}
			
			//A NEW LINE FOR BETTER LOOKING
			System.out.println();
			
			// RETURN MAP
			return map;
		}
		
		
		public static void main(String[] args) {
			
			// SCANNER OBJECT TO GET INPUTS
			Scanner sc = new Scanner(System.in);
			
			// GET ROW NUMBER
			System.out.print("Please enter the number of rows : ");
			int row = sc.nextInt();
			
			// GET COLUMN NUMBER
			System.out.print("\nPlease enter the number of columns : ");
			int col = sc.nextInt();
			
			// CREATED OUR PUZZLE BY INVOKING THE METHOD createPuzzle()
			String[][] puzzle = createPuzzle(row,col);
			
			// GET KEYWORD
			System.out.print("\nPlease enter the keyword : ");
			String keyword = sc.next();
			
			// PRINT WHETER THE KEYWORD IS IN THE PUZZLE OR NOT BY INVOKING THE METHOD findWord() 
			System.out.println("\n" + findWord(puzzle,keyword));
			
			// CLOSE SCANNER INSTANCE
			sc.close();
			
		}


}
