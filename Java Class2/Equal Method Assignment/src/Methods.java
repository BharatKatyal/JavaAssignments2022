import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Methods {

	public static char getChoice(char choice) {
		String mess = "";
//		mess +=  "[A] Add an Building\n";
//		mess += "[B] Add a House\n";
//		mess += "[C] Add a Trailer\n";
//		mess += "[D] Add a Office \n";
		mess += "[E] Display Everything \n";
		mess += "[F] Display Buildings \n";
		mess += "[G] Display Houses \n";
		mess += "[H] Display Trailers \n";
		mess += "[I] Display Offices \n";
		mess += "[J] Display Doctor Offices \n";
		mess += "[K] Display Lawyer Offices \n";
		mess += "[L] Display Retail Shops \n";
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

	
}
