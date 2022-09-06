import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Methods {

	public static char getChoice(char choice) {
		String mess = "[A] Add an Athlete\n";
		mess += "[B] Add a Cowboy\n";
		mess += "[C] Add a Serial Killer\n";
		mess += "[D] Display all Information \n";
		mess += "[E] Display Stats\n";
		mess += "[Q] Quit\n";
		mess = JOptionPane.showInputDialog(mess);
		try {
			choice = mess.toUpperCase().charAt(0);
		} catch (Exception e) {
			mess = "Invalid Menu Option";
			JOptionPane.showMessageDialog(null, mess);
			getChoice(choice);
		}
		
		return choice;
	} // end of getChoice()

	public static void displayPersons(@SuppressWarnings("rawtypes") ArrayList myList) {
		for (int i = 0; i < myList.size(); i++) {
			String mess = myList.get(i).toString();
			JOptionPane.showMessageDialog(null, mess);
		}
	} // end of display students
	
	public static void displayStats(@SuppressWarnings("rawtypes") ArrayList persons) {
		String mess = "";
		mess += "Total Number of Athletes: " + Person.getAthleteStats(persons) + "\n";
		mess += "Total Number of Cowboys: " + Person.getCowboyStats(persons) + "\n";
		mess += "Total Number of Serial Killers: " + Person.getSerialKillerStats(persons) + "\n";
		JOptionPane.showMessageDialog(null, mess);
		
	}
}
