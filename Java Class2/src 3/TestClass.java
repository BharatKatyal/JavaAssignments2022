//**********************************************************************//
// Author: Elldar Mizrachi,Bharat Katyal, Dexter Rideaux,               //
// Antonio Urdeneta												        //
// Date: 4.2.22														    //		
// Purpose:  Creates an arraylist of People and displays stats about    //
//   them.                                                              //
//**********************************************************************//
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TestClass {

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<>();
		char choice = 'Q';
		// Convert lower case to upper
		do {
			choice = Methods.getChoice(choice);
			switch (choice) {
			case 'A':
				persons.add(new Athlete());
				break;
			case 'B':
				persons.add(new Cowboy());
				break;
			case 'C':
				persons.add(new SerialKiller());
				break;
			case 'D': // Display all information (persons, athletes, cowboys, serial killers)
				Methods.displayPersons(persons);
				break;
			case 'E': // Display all stats
				Methods.displayStats(persons);
				break;
			case 'Q': // quit
				//System.exit(0);
				break;
			case ' ':
				break;
			default: // invalid
				String mess = "Invalid Menu Choice";
				JOptionPane.showMessageDialog(null, mess);
				break;
			}// end of switch
		} while (choice != 'Q');

	} // end of main
	

}//end test

