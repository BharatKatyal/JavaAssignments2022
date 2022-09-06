



import java.util.InputMismatchException;
import java.util.Scanner;


public class Methods {
	  static Scanner input = new Scanner(System.in);
	  public static int getInt(String mess) {  
	      int result = 0;
	      boolean badValue = true;
	      do {
	        try{
	       System.out.print(mess);
	      result = input.nextInt();
	      badValue = false;
	        }catch (InputMismatchException ime){
	        	System.out.println("Invalid input! ");
	        	badValue = true;
	        	input.next();

	        }// end TryCatch

	      }while(badValue);
	      return result;// Clears out the keyboard buffer
	     



	      return result;
	  }// end getInt
	} // end class Methods