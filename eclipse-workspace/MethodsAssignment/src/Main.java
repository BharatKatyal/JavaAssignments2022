import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String usersName;
		int usersAge;
		int repeat = 1;
		
		while(repeat == 1)  {
				usersName = Name();
				Age usersAge1 =  new Age();
				usersAge = usersAge1.printAge();
				Output(usersName,usersAge);
				System.out.println("Would you like to repeat? Enter the integer 1 to repeat "); // Was not able to compare string value of "yes" so used INT
				repeat=sc.nextInt();
//				System.out.println(repeat);

		}// end while look
		
		
	}
	
	public static String Name() {
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your full name");
		String myName=sc.nextLine();
		return myName;
	}// close String Name method

	
	static void Output(String x, int y) {
		if(y>50) {
			System.out.println("Hello"+ x + "since you are "+ y +"years old you are really old");
		}else if(y<21) {
			System.out.println("Hello"+ x + "since you are "+ y +"years old you are really young");
		}else {
			System.out.println("Hello"+ x + "since you are "+ y +"years old you are doing just fine");	
		}
	} // Close Output Method

}// Close Main


