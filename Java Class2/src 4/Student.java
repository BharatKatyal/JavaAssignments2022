import javax.swing.JOptionPane;

public class Student extends Person implements StudentStuff {// student is a person and uses the studentStuff interface
	// students have a gpa, major, and cheater
	private double gpa;
	private String major;
	private Boolean cheater;

	public Student() {// no arg constructor
		getAStudent();
	}

	private void getAStudent() {// calls setters and getter for student
		getGpa();
		setGpa(gpa);
		getMajor();
		setMajor(major);
		getCheater();
		setCheater(cheater);
		exams();
	}

	public String getMajor() {// getter for major
		Object[] selectionValues = { "Biology", "Math", "Chemistry", "Computer Science", "English", "Other" };
		String initialSelection = "Computer Science";
		Object selection = JOptionPane.showInputDialog(null, "What is this Person's Major?", "Major Selection",
				JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
		major = (String) selection;

		if (this.major == "Other") {
			String mess = "What is your Major?  ";
			String prompt = "type Something";
			mess = JOptionPane.showInputDialog(mess, prompt);
			major = mess;
		} // end if

		return major;
	}// end getter

	public void setMajor(String major) {// setter for major
		this.major = major;
	}// end set

	public boolean getCheater() {// getter for cheater
		int reply = JOptionPane.showConfirmDialog(null, "Did you cheat in school?", null, JOptionPane.YES_NO_OPTION);
		if (reply == 0) {
			this.cheater = true;
		} else {
			this.cheater = false;
		}
		return cheater;

	}// end get

	public void setCheater(Boolean cheater) {
		this.cheater = cheater;
	}// end set

	public double getGpa() {
		boolean in = false;
		do {
			try {
				String mess = "Please enter your GPA: ";
				String prompt = "type Something";
				mess = JOptionPane.showInputDialog(mess, prompt);
				gpa = Double.parseDouble(mess);
				in = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Invalid GPA Entered\nPlease try again.", null,
						JOptionPane.ERROR_MESSAGE);
			}
		} while (in == false);
		return gpa;
	}// end get

	public void setGpa(double gpa) {
		if (gpa > 0 && gpa < 5) {
			this.gpa = gpa;
		} else {
			JOptionPane.showMessageDialog(null, "Invalid GPA Entered\nPlease try again.", null,
					JOptionPane.ERROR_MESSAGE);
			getGpa();
		}
	}// end set

	public String toString() {
		return super.toString() + "\nStudent's GPA: " + gpa + "\nStudent's Major: " + major + "\nCheater? " + cheater
				+ "\n" + thisIsWhatIDo();
	}// end toString()

	public boolean equals(Object obj) {// compares two objects and sees if they are equal
		if (this != obj) {
			return false;
		}
		if (obj instanceof Student) {
			return true;
		}

		return false;
	}// end equals()

	public String thisIsWhatIDo() {// abstract method that must be implemented
		String mess = "I am a student and I study!";
		return mess;
	}// end method

	public void exams() {// interface methods
		boolean in = false;
		int tests;
		do {
			try {
				String mess = "How many exams do you have?  ";
				String prompt = "type Something";
				mess = JOptionPane.showInputDialog(mess, prompt);
				tests = Integer.parseInt(mess);
				in = true;
				if (tests < NUMBER_OF_EXAMS && tests > 1) {
					mess = "Only " + tests + " exams!\nYou have it easy";
					JOptionPane.showMessageDialog(null, mess);
				}
				if (tests > NUMBER_OF_EXAMS) {
					mess = "Whoa you have " + tests + " exams!\nTime to start studying";
					JOptionPane.showMessageDialog(null, mess);
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Invalid Number of exams\nPlease try again.", null,
						JOptionPane.ERROR_MESSAGE);
			}
		} while (in == false);

	}// end exams()
}// end student
