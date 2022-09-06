import java.util.Scanner;

import javax.swing.JOptionPane;

public class Name {
	// Names have a first, middle, and last name
	private String fName;
	private String mName;
	private String lName;

	public Name() {// Default constructor method
		getfName();
		setfName(fName);
		getmName();
		setmName(mName);
		getlName();
		setlName(lName);
		
	}

	public Name(String fName, String mName, String lName) {// constructor method
		setfName(fName);
		setmName(mName);
		setlName(lName);
	}

	public String getfName() {// getter for first
		String mess = "What is this person's First Name?";
		JOptionPane.showInputDialog(mess);
		fName = sentenceCase(mess);
		return fName;
	}// end get first

	public void setfName(String fName) {// setter for first
		this.fName = fName;
	}// end set first

	public String getmName() {// getter for middle
		String mess = "Does this Person have a Middle Name?\n";
		int n = JOptionPane.showConfirmDialog(null, mess, null,JOptionPane.YES_NO_OPTION);	
		if(n == 0) {
			mess = "What is this person's middle name?";
			JOptionPane.showInputDialog(mess);
			mName = mess.toUpperCase().charAt(0) + ". ";
		}
		else {
			mName = " ";
		}
		return mName;
	}// end get middle

	public void setmName(String mName) {// setter for middle
		this.mName = mName;
	}// end setter middle

	public String getlName() {// getter for last
		String mess = "What is this person's last name? ";
		JOptionPane.showInputDialog(mess);
		lName = sentenceCase(mess);
		return lName;
	}// end getter for last

	public void setlName(String lName) {// setter for last
		this.lName = lName;
	}// end set last

	public String toString() {// displays and formats the names
		String mess = "";
		/*try {// try with middle name
			mess = (sentenceCase(fName) + " " + mName.toUpperCase().charAt(0) + ". " + sentenceCase(lName));
		} catch (Exception e) {// display if no middle name
			mess = (sentenceCase(fName) + " " + sentenceCase(lName));
		} // end try-catch*/
		mess += "Name:" + fName + " " + mName + " " + lName;
		return mess;
	}// end toString()

	public static String sentenceCase(String name) {// makes the names into sentence case
		if (name == null || name.isEmpty()) {
			return name;
		} // end if

		return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
	}// end sentenceCase()

}// end Name
