package csehomework;
import java.util.Scanner;
public class Pro1_150119516 {

	public static void main(String[] args) {
        double x1, y1, x2, y2, m, e;
		
        //To begin with, we need to get the coordinates of the first point from the user.
        
        Scanner input= new Scanner(System.in);
		System.out.println("Please enter the coordinations of the first point as x1,y1:");
		x1=input.nextDouble();
		y1=input.nextDouble();
		
		
		//Secondly, user should write the values of coordinates of the second point.
		System.out.println("Please enter the coordinations of the second point as x2,y2:");
		x2=input.nextDouble();
		y2=input.nextDouble();
		input.close();
		
		
		/*Now, we know the values of all of the four values. The slope can be found now.
		  To find the slope, we need to write an equation.*/
		
		m = (y2-y1)/(x2-x1);
		e = (-1)*(m*x1)+y1;
		
		System.out.println("Slope of this equation =" + m + "\n"+"The equation = y " +m+"x + " + e );
	}

}



/*İsmail ÖKSÜZ
  150119516*/