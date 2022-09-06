package compositeClass;

import javax.swing.JOptionPane;

public class Name {
	private String fName;
	private String lName;

	public Name() {
		getName();
	}

	public Name(String fName, String lName) {
		setfName(fName);
		setlName(lName);
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String toString() {
		return fName + " " + lName;
	}
	
	public void getName() {
		String mess = "What is yor first name: ";
		String prompt = "Please Type";
		mess = JOptionPane.showInputDialog(mess, prompt);
		setfName(mess);
		
		mess = "What is your last name: ";
		mess = JOptionPane.showInputDialog(mess, prompt);
		setlName(mess);
		
	}
	
}
