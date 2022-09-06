import javax.swing.JOptionPane;

public class Name {
	public String fName;
	public String lName;

	public Name() {
		getAName();
	}

	public void getAName() {
		getfName();
		setfName(fName);
		getlName();
		setlName(lName);
	}

	public String getfName() {
		String mess = "What is your first name : ";
		String prompt = "Please Type";
		mess = JOptionPane.showInputDialog(mess, prompt);
		fName = mess;
		return fName;
	}

	public void setfName(String fName) {
		this.fName = sentenceCase(fName);
	}

	public String getlName() {

		String mess = "What is your last name : ";
		String prompt = "Please Type";
		mess = JOptionPane.showInputDialog(mess, prompt);
		lName = mess;
		return lName;
	}

	public void setlName(String lName) {
		this.lName = sentenceCase(lName);
	}

	public String toString() {
		String result;
		result = "Name: " + fName + " " + lName;
		return result;
	}
	
	public static String sentenceCase(String name) {// makes the names into sentence case
		if (name == null || name.isEmpty()) {
			return name;
		} // end if

		return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
	}// end sentenceCase()

}
