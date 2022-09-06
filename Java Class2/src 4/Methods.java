import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Methods {

	public static int getChoice(int choice) {// menu options
		Object stringArray[] = { "Add an Student", "Add a Candidate", "Add a Soldier", "Display the output", "Quit" };
		choice = JOptionPane.showOptionDialog(null, "What would you like to do?", "Select an Option",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, stringArray, stringArray[0]);

		return choice;
	} // end of getChoice()

	public static void displayPersons(@SuppressWarnings("rawtypes") ArrayList myList) {// method to display the array
																						// list
		for (int i = 0; i < myList.size(); i++) {
			String mess = myList.get(i).toString();
			JOptionPane.showMessageDialog(null, mess);
		}
	} // end of display students

}
