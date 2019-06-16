/************************************************************/
/*Program:  Arrays                                          */
/*CIS163AA                                                  */
/*Nicholas Zarek                                            */
/*10/06/2017                                                */
/*this program prints a user filled array                   */
/************************************************************/
import java.util.Scanner;
public class NicholasZarek_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable declaration 
		Scanner scnr = new Scanner(System.in);
		final int NUM_ELEMENTS = 10;
		int[] userVals = new int[NUM_ELEMENTS];
		int i = 0;
		
		//Prompt user to populate array
		System.out.println("Please enter " + NUM_ELEMENTS + " integer values."); 
		
		//Populating array
		for (i = 0; i < NUM_ELEMENTS; ++i) {
		System.out.print("Enter Value: ");
		userVals[i] = scnr.nextInt();
	}
		//Printing array content
		for (i = 0; i < NUM_ELEMENTS; ++i) {
	         System.out.println(userVals[i]);
	      }
		//close scanner
		scnr.close();
}
}