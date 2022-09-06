import javax.swing.JOptionPane;

public class Soldier extends Person implements SoldierStuff {// A soldier is a person that uses SoldierStuff interface
	//A soldier has a rank, branch, officer
	private String rank;
	private String branch;
	private Boolean officer;

	public Soldier() {//no arg constructor for soldier
		getASoldier();
	}

	private void getASoldier() {//calls getter and setter methods
		getRank();
		setRank(rank);
		getBranch();
		setBranch(branch);
		getOfficer();
		setOfficer(officer);
		legs();
	}//end getASoldier

	public String getRank() {//getter
		Object[] selectionValues = { "Private", "Sergeant", "Colonel", "General", "Commander", "Other" };
		String initialSelection = "Private";
		Object selection = JOptionPane.showInputDialog(null, "What is this Person's Rank?", "Rank Selection",
				JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
		rank = (String) selection;

		if (this.rank == "Other") {
			String mess = "What is your Rank?";
			String prompt = "type Something";
			mess = JOptionPane.showInputDialog(mess, prompt);
			rank = mess;
		}

		return rank;
	}//end get

	public void setRank(String rank) {//setter
		this.rank = rank;
	}//end set

	public String getBranch() {//getter
		Object[] selectionValues = { "Army", "Marine", "Navy", "Air Force", "Space Force", "Other" };
		String initialSelection = "Army";
		Object selection = JOptionPane.showInputDialog(null, "What is this Person's Branch?",
				"Branch Selection",
				JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
		branch = (String) selection;

		if (this.branch == "Other") {
			String mess = "What is your Branch?";
			String prompt = "type Something";
			mess = JOptionPane.showInputDialog(mess, prompt);
			branch = mess;
		}

		return branch;
	}//end get

	public void setBranch(String branch) {//setter
		this.branch = branch;
	}//end set

	public Boolean getOfficer() {//getter
		int reply = JOptionPane.showConfirmDialog(null, "Are you an Officer?", null, JOptionPane.YES_NO_OPTION);
		if (reply == JOptionPane.YES_OPTION) {
			this.officer = true;
		} else {
			this.officer = false;
		}
		return officer;
	}//end get

	public void setOfficer(Boolean officer) {//setter
		this.officer = officer;
	}//end set

	public String toString() {//formats output
		String mess = super.toString();
		mess += "\nRank: " + rank;
		mess += "\nBranch: " + branch;
		mess += "\nOfficer? " + officer;
		mess += "\n" + thisIsWhatIDo();
		return mess;
	}// end toString()

	public boolean equals(Object obj) {// compares two objects and sees if they are equal
		if (this != obj) {
			return false;
		}
		if (obj instanceof Soldier) {
			return true;
		}

		return false;
	}//end equals

	public String thisIsWhatIDo() {//abstract method that must be implemented
		String mess = "I am a Soldier and I fight for my country!";
		return mess;
	}//end thisIsWhatIDo()

	public void legs() {//interface method
		String message;
		int reply = JOptionPane.showConfirmDialog(null, "Do you have two legs? ", "Type Something ",
				JOptionPane.YES_NO_OPTION);
		if (reply == 0) {
			message = "Great you have two legs";
			JOptionPane.showMessageDialog(null, message);
		} else {
			message = "We offer robotic legs, would you like one? ";
			JOptionPane.showMessageDialog(null, message);
		}

	}// end legs

}// end soldier
