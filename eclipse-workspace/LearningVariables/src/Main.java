// Declare the variable 
// feb 3 2022 11:52AM
import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args) {
/*
 * lesson 1
 * 	int x;
		x = 123;
		System.out.println("Muy number is "+ x);
		
		long y;
		y = 123908907098789l;
		// long numbers like spead of light need to use long datatype and the number has to be followed by a L\
		
		byte z;
		z = 100;
		
		// Int cannot store decimels, you must use float or 
		
		float a = 31.4F;
		// floats need F
		double b  = 31.4;
		// doesnt need F aftrer
		
		boolean g = true;
				// boolenas only store true and false
		
		String name = "bro";
		System.out.println("hello"+ name);

		
		// strings is a reference data type and must be capital 
 * 
 */
	
//		
		/* Lesson 2
		 * String x ="water";
		String y = "sand";
		String temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("X :"+ x);
		System.out.println("Y: "+ y);
		 * 
		 */
		
		/*
		 * 
		 * 
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name");
		String name = scanner.nextLine();
		System.out.println("How old are you");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("What is your favoirate food");
		String food = scanner.nextLine();
		System.out.println("How much do you make");
		int money = scanner.nextInt();
		
		
		//********** NEED TO PRATICE USING SCANNER next line*******
		
		
		
		System.out.println("hello "+ name);
		System.out.println("you are "+age +"years old");
		System.out.println("you like "+food);
		System.out.println("you make "+money);


		


		
	} // end static void main

}
