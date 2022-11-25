/*İsmail ÖKSÜZ
  150119516*/

import java.util.Scanner;

public class Pro2_150119516 {

   private static Scanner scan;

   public static void main(String[] args) {
	   
	   /*This program calculates the total price of the house that user want.
	    * User can select the type of house and the amount of storey.
	    * Also, furnitured house or not furnitured house can be selected as well.
	    */
       
	   //Scanner function was used for getting the input of type of house that user wants. 
       scan = new Scanner(System.in);
       
       System.out.print("--- Buy a House ---" + "\n"
               + "(A) Block A" + "\n"
               + "(B) Block B" + "\n"
               + "(C) Block C" + "\n"
               + "(D) Block D" + "\n"
               +"Which house type your prefer? (A, B, C, D): ");
       
       
       String inp = scan.next();
       inp = inp.toLowerCase();
       
       int storey = 0, block = 0;
       String furniture = "";
       double price = 0, kdv = 0;
       
       //  Inp is used for getting input from the user to which type of block that user wants.
       switch(inp) {
       //I used case a for A Block houses.
           case "a":
           {
               System.out.print("(1) 1+1" + "\n"
                       + "(2) 2+1" + "\n"
                       + "Which house type you prefer? (1, 2): ");
               
               block = scan.nextInt();
               
               System.out.print("Select storey? (max10): ");
               
               storey = scan.nextInt();
               
               switch(block) {
                   case 1:
                   {
                       price = 45000 + 45000*(0.0165*(storey-1));
                       System.out.println("Your house price: " + price);

                       break;
                   }
                   case 2:
                   {
                       price = 65000 + 19000 + 65000*(0.0174*(storey-1));
                       System.out.println("Your house price with furnished: " + price);

                       break;
                   }
               }
               break;
           }
         //I used case b for B Block houses.
           case "b":
           {
               System.out.print("(1) 1+1" + "\n"
                       + "(2) 2+1" + "\n"
                       + "(3) 3+1" + "\n"
                       + "Which house type you prefer? (1, 2, 3): ");
               
               block = scan.nextInt();
               
               System.out.print("Select storey? (max10): ");
               
               storey = scan.nextInt();
               
               switch(block) {
                   case 1:
                   {
                       price = 50000 + 13000 + 50000*(0.02*(storey-1));
                       System.out.println("Your house with furnished: " + price);

                       break;
                   }
                   case 2:
                   {
                       price = 72000 + 72000*(0.017*(storey-1));
                       System.out.println("Your house price: " + price);

                       break;
                   }
                   case 3:
                   {
                       System.out.print("Do you want furnitured house? (Y, N): ");
                       furniture = scan.next();
                       furniture = furniture.toLowerCase();
                       
                       if(furniture.equals("y")) {
                           price = 97500 + 26000 + 97500*(0.0175*(storey-1));
                           System.out.println("Your house price with furnished: " + price);
                       }
                       else if(furniture.equals("n")){
                           price = 97500 + 97500*(0.0175*(storey-1));
                           System.out.println("Your house price without furnished: " + price);
                       }
                       break;
                   }
               }
               break;
           }
         //I used case c for C Block houses.
           case "c":
           {
               System.out.print("(2) 2+1" + "\n"
                       + "(3) 3+1" + "\n"
                       + "(4) 4+1" + "\n"
                       + "Which house type you prefer? (2, 3, 4): ");
               
               block = scan.nextInt();
               
               System.out.print("Select storey? (max10): ");
               
               storey = scan.nextInt();

               switch(block) {
                   case 2:
                   {
                       System.out.print("Do you want furnitured house? (Y, N): ");
                       furniture = scan.next();
                       furniture = furniture.toLowerCase();
                       
                       if(furniture.equals("y")) {
                           price = 80000 + 19000 + 80000*(0.016*(storey-1));
                           System.out.println("Your house price with furnished: " + price);
                       }
                       else if(furniture.equals("n")){
                           price = 80000 + 80000*(0.016*(storey-1));
                           System.out.println("Your house price without furnished: " + price);
                       }

                       break;
                   }
                   case 3:
                   {
                       price = 102400 + 26000 + 102400 *(0.0185*(storey-1));
                       System.out.println("Your house price with furnished: " + price);

                       break;
                   }
                   case 4:
                   {
                       price = 137000 + 137000 *(0.021*(storey-1));
                       System.out.println("Your house price: " + price);

                       break;
                   }
               }
               break;
           }
         //I used case d for D Block houses.
           case "d":
           {
               System.out.print("(3) 3+1" + "\n"
                       + "(4) 4+1" + "\n"
                       + "Which house type you prefer? (3, 4): ");
               
               block = scan.nextInt();
               
               System.out.print("Select storey? (max10): ");
               
               storey = scan.nextInt();

               switch(block) {
                   case 3:
                   {
                       System.out.print("Do you want furnitured house? (Y, N): ");
                       furniture = scan.next();
                       furniture = furniture.toLowerCase();
                       
                       if(furniture.equals("y")) {
                           price = 119900 + 26000 + 119900*(0.019*(storey-1));
                           System.out.println("Your house price with furnished: " + price);
                       }
                       else if(furniture.equals("n")){
                           price = 119900 + 119900*(0.02*(storey-1));
                           System.out.println("Your house price without furnished: " + price);
                       }

                       break;
                   }
                   case 4:
                   {
                       price = 165000 + 165000 *(0.0185*(storey-1));
                       System.out.println("Your house price: " + price);

                       break;
                   }
                   default :
                   {
                       System.out.println("Wrong choice");

                       break;
                   }
               }
               break;
           }
       }
       
       //I calculated the tax with if and else function.
       if(price < 100000) {
           kdv = price * 0.01;
           System.out.println("1% KDV costs: " + kdv);
       }
       else {
           kdv = price * 0.08;
           System.out.println("8% KDV costs: " + kdv);
       }
       
       // Getting input from the user whether he/she wants a furnitured house or not to calculate total cost. 
       if(furniture.equals("y"))
           System.out.println("You select Block " + inp.toUpperCase() +", " + block
                   + "+1 type floor " + storey + " furnitured house with total cost: "
                   + (price + kdv));
       else if(furniture.equals("n") || furniture.equals(""))
           System.out.println("You select Block " + inp.toUpperCase() +", " + block
                   + "+1 type floor " + storey + " house with total cost: "
                   + (price + kdv));        
   }

}