import javax.swing.JOptionPane;

public class Athlete extends Person {
	private String nameOfSport;
	private int titlesWon;
	public Name name;

	public Athlete() {
		getAthlete();

	}

	public Athlete(Name name, double height, double weight, String nameOfSport, int titlesWon) {
		this.nameOfSport = nameOfSport;
		this.titlesWon = titlesWon;
	}

	public String getNameOfSport() {
		String mess = "What sport do you play : ";
		String prompt = "Please Type";
		mess = JOptionPane.showInputDialog(mess, prompt);
		try {
			setNameOfSport(mess);
		} catch (Exception e) {
			
		}
		return nameOfSport;
	}

	public void setNameOfSport(String nameOfSport) {
		this.nameOfSport = nameOfSport;
	}

	public int getTitlesWon() {
		String mess = "How many titles has this athlete won?";
		mess = JOptionPane.showInputDialog(mess);
		try {
			this.titlesWon = Integer.parseInt(mess);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid amount of titles\n Please try again.", null,
					JOptionPane.ERROR_MESSAGE);
			getTitlesWon();
		}
		return this.titlesWon;
	}

	public void setTitlesWon(int titlesWon) {
		if (titlesWon > 0)
			try {
				this.titlesWon = titlesWon;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Invalid amount of titles\n Please try again.", null,
						JOptionPane.ERROR_MESSAGE);
				getTitlesWon();
			}
		else {
			JOptionPane.showMessageDialog(null, "Invalid amount of titles\n Please try again.", null,
					JOptionPane.ERROR_MESSAGE);
			getTitlesWon();
		}

	}

	public String toString() {
		String result = super.toString();
		result += "Name of Sport: " + nameOfSport + "\nTitles Won: " + titlesWon + "\n";
		return result;
	}

	public void getAthlete() {
		getNameOfSport();
		setNameOfSport(nameOfSport);
		getTitlesWon();
		setTitlesWon(titlesWon);
	}

}