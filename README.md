# Side-Project1
Asks the user to enter how many pennies, nickels, dimes, quarters, and then adds them up.

package MoneyCounter;

import java.util.Scanner;

public class MoneyCounter {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		  
			final float PEN_VAL = .01f, NCK_VAL = .05f, DIM_VAL = .10f, QTR_VAL = .25f;
			 
			 
			
			
			System.out.print("How many pennies do you have: " );
			float penny = scan.nextInt();
		  
		    
			System.out.print("How many nickels do you have: " );
			float nickel = scan.nextInt();
		  
		    
			System.out.print("How many dimes do you have: ");
			float dime = scan.nextInt();
		  
		    
			System.out.print("How many quarters do you have: ");
			float quarter = scan.nextInt();
			
			float total = ((penny * PEN_VAL) + (nickel * NCK_VAL) + (dime * DIM_VAL) + (quarter * QTR_VAL));
			
			
			System.out.print("Total: $" + total);
		  
		  
		  
		  
		  
	  }
}
