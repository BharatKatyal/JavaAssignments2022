import javax.swing.JOptionPane;

public class Candidate extends Person implements CandidateStuff {// a candidate is a person that uses the candidate
	// a candidate has a party and position                      // stuff interface
	private String party;
	private String position;

	public Candidate() {//no arg constructor
		getACandidate();
	}//end no arg

	private void getACandidate() {//calls setter and getter
		getParty();
		setParty(party);
		getPosition();
		setPosition(position);
		votes();
	}//end getAcandidate()

	public String getParty() {//getter
		Object[] selectionValues = { "Democrat", "Republican", "Other" };
		String initialSelection = "Democrat";
		Object selection = JOptionPane.showInputDialog(null, "What is this Person's Party?", "Party Selection",
				JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
		party = (String) selection;

		if (this.party == "Other") {
			String mess = "What is your Party?  ";
			String prompt = "type Something";
			mess = JOptionPane.showInputDialog(mess, prompt);
			party = mess;
		}//end if

		return party;
	}//end getter

	public void setParty(String party) {//setter
		this.party = party;
	}//end setter

	public String getPosition() {//getter
		Object[] selectionValues = { "Intern", "Secretary", "Senetor", "Vice President", "President", "Other" };
		String initialSelection = "Private";
		Object selection = JOptionPane.showInputDialog(null, "What is this Person's Position?", "Position Selection",
				JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
		position = (String) selection;

		if (this.position == "Other") {
			String mess = "What is your Position?  ";
			String prompt = "type Something";
			mess = JOptionPane.showInputDialog(mess, prompt);
			position = mess;
		}//end if

		return position;
	}// end getter

	public void setPosition(String position) {//setter
		this.position = position;
	}//end setter

	public String toString() {// formats the output
		String mess = super.toString();
		mess += "\nParty:" + party;
		mess += "\nPosition: " + position;
		mess += "\n" + thisIsWhatIDo();
		return mess;
	}//end toString

	public boolean equals(Object obj) {// compares two objects and sees if they are equal
		if (this != obj) {
			return false;
		}
		if (obj instanceof Candidate) {
			return true;
		}

		return false;
	}//end equals

	public String thisIsWhatIDo() {//abstract method
		String mess = "I am a Candidate and I run for office";
		return mess;
	}//end method

	public void votes() {//interface method
		int votes;
		boolean in = false;
		do {
			try {
				String mess = "How many votes do you have  ";
				String prompt = "type Something";
				mess = JOptionPane.showInputDialog(mess, prompt);
				votes = Integer.parseInt(mess);
				in = true;

				if (votes < MIN_NUMBER_VOTES) {
					mess = "You gotta step it up";
					JOptionPane.showMessageDialog(null, mess);
				} else {
					mess = "You're doing great";
					JOptionPane.showMessageDialog(null, mess);
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Invalid Number of votes\nPlease try again.", null,
						JOptionPane.ERROR_MESSAGE);
			}
		} while (in == false);

	}// end votes
}// end soldier
