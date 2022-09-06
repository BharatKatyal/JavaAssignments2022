import javax.swing.JOptionPane;

public class Candidate extends Person implements CandidateStuff {
	public String party;
	public String position;

	public Candidate() {
		getACandidate();
	}

	private void getACandidate() {
		getParty();
		setParty(party);
		getPosition();
		setPosition(position);
		votes();
	}

	public String getParty() {
		String mess = "What is your party?";
		String prompt = "Type something";
		mess = JOptionPane.showInputDialog(mess, prompt);
		party = mess;
		
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getPosition() {
		String mess = "What is your position?";
		String prompt = "Type something";
		mess = JOptionPane.showInputDialog(mess, prompt);
		position = mess;
		
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String toString() {
		String mess = super.toString();
		mess += "\nParty:" + party;
		mess += "\nPosition: " + position;
		mess += "\n" + thisIsWhatIDo();
		return mess;
	}
	
	public boolean equals(Object obj) {// compares two objects and sees if they are equal
		if (this != obj) {
			return false;
		}
		if (obj instanceof Candidate) {
			return true;
		}

		return false;
	}

	public String thisIsWhatIDo() {
		String mess = "I am a Candidate and I run for office";
		return mess;
	}

	public void votes() {
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
			
	}//end votes
}//end soldier
