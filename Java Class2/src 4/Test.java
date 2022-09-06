//**********************************************************************//
// Author: Elldar Mizrachi, Bharat Katyal								//
// Date: 4.17.22														//		
// Purpose: Creates an array of people and gives the user the ability   //
// to add or view the list of students                                  // 
//**********************************************************************//
import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		// creates an array of people
		ArrayList<Person> persons = new ArrayList<>();
		int choice = -1;
		// menu
		do {
			choice = Methods.getChoice(choice);
			switch (choice) {
			case 0:// add student
				persons.add(new Student());
				break;
			case 1:// add candidate
				persons.add(new Candidate());
				break;
			case 2:// add soldier
				persons.add(new Soldier());
				break;
			case 3: // Display all information
				Methods.displayPersons(persons);
				break;
			case 4: // quit
				System.exit(0);
				break;
			case ' ':
				break;
			default: // invalid
			}// end of switch
		} while (choice != 'Q');

	}// end main
}// end test
