import java.util.InputMismatchException;
import java.util.Scanner;


public class Age {
	 public int printAge() {
		 try {
			 Scanner sc = new Scanner(System.in);
				System.out.println("what is your Age as an integrer");
				int myAge=sc.nextInt();
				return myAge;
		 } catch(Exception e){
				System.out.println("Something went wrong.");

		 }
		 finally {
				System.out.println("The try catch has finished");

		 }
		return 0;
		

	} // close printAge

} // close public class Agew










