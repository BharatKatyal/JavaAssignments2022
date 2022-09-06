package compositeClass;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Methods {
	
	public static int getChoice() {
		String mess = "1. New Student\n";
		mess += "2. Display all students\n";
		mess += "3. Quit\n";
		int choice;
		mess = JOptionPane.showInputDialog(mess);
		choice = Integer.parseInt(mess);
		return choice;
	}
	
	public static void displayStudents(ArrayList myList) {
		for(int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i).toString());
		}
	}
}
