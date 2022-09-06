import javax.swing.JOptionPane;

public class Cowboy extends Person {
	private String nameOfHorse;
	private int numRodeosEntered;
	private int numRodeosWon;
	private double annualRodeoIncome;

	public Cowboy() {
		getCowboy();
	}

	public String getNameOfHorse() {
		String mess = "Enter horse name: ";
		String prompt = "Please Type";
		mess = JOptionPane.showInputDialog(mess, prompt);
		nameOfHorse = Name.sentenceCase(mess);
		return nameOfHorse;
	}

	public void setNameOfHorse(String nameOfHorse) {
		this.nameOfHorse = nameOfHorse;
	}

	public int getNumRodeosWon() {
		String mess = "How many Rodeos were won: ";
		String prompt = "Please Type";
		mess = JOptionPane.showInputDialog(mess, prompt);
		try {
			numRodeosWon = Integer.parseInt(mess);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid Number of Rodeos Won\nPlease try again.", null,
					JOptionPane.ERROR_MESSAGE);
			getNumRodeosWon();
		}
		return numRodeosWon;
	}

	public void setNumRodeosWon(int numRodeosWon) {
		if (numRodeosWon >= 0) {
			try {
				this.numRodeosWon = numRodeosWon;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Invalid Number of Rodeos Won\nPlease try again.", null,
						JOptionPane.ERROR_MESSAGE);
				getNumRodeosWon();
			}
		} else {
			JOptionPane.showMessageDialog(null, "Invalid Number of Rodeos Won\nPlease try again.", null,
					JOptionPane.ERROR_MESSAGE);
			getNumRodeosWon();
		}
	}

	public double getAnnualRodeoIncome() {
		String mess = "What was the annual income: ";
		String prompt = "Please Type";
		mess = JOptionPane.showInputDialog(mess, prompt);
		try {
			annualRodeoIncome = Double.parseDouble(mess);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid Annual Rodeo Income\nPlease try again.", null,
					JOptionPane.ERROR_MESSAGE);
			getAnnualRodeoIncome();
		}
		return annualRodeoIncome;
	}

	public void setAnnualRodeoIncome(double annualRodeoIncome) {
		if (annualRodeoIncome >= 0) {
			try {
				this.annualRodeoIncome = annualRodeoIncome;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Invalid Annual Rodeo Income\nPlease try again.", null,
						JOptionPane.ERROR_MESSAGE);
				getAnnualRodeoIncome();
			}
		} else {
			JOptionPane.showMessageDialog(null, "Invalid Annual Rodeo Income\nPlease try again.", null,
					JOptionPane.ERROR_MESSAGE);
			getAnnualRodeoIncome();
		}
	}

	public int getNumRodeosEntered() {
		String mess = "Enter number of rodeos entered: ";
		String prompt = "Please Type";
		mess = JOptionPane.showInputDialog(mess, prompt);
		try {
			numRodeosEntered = Integer.parseInt(mess);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid Number of rodeos entered\nPlease try again.", null,
					JOptionPane.ERROR_MESSAGE);
			getNumRodeosEntered();
		}
		setNumRodeosEntered(numRodeosEntered);
		return numRodeosEntered;
	}

	public void setNumRodeosEntered(int numRodeosEntered) {
		if (numRodeosEntered >= 0) {
			try {
				this.numRodeosEntered = numRodeosEntered;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Invalid Number of rodeos entered\nPlease try again.", null,
						JOptionPane.ERROR_MESSAGE);
				getNumRodeosEntered();
			}
		} else {
			JOptionPane.showMessageDialog(null, "Invalid Number of rodeos entered\nPlease try again.", null,
					JOptionPane.ERROR_MESSAGE);
			getNumRodeosEntered();
		}
	}

	public String toString() {

		String result = super.toString();
		result += "Horse name: " + nameOfHorse + "\n";
		result += "Total number of rodeos: " + numRodeosEntered + "\n";
		result += "Total number of rodeos won: " + numRodeosWon + "\n";
		result += "Total annual income: " + String.format("%.2f", annualRodeoIncome) + "\n";
		return result;
	}

	public void getCowboy() {
		getNameOfHorse();
		setNameOfHorse(nameOfHorse);
		getNumRodeosEntered();
		setNumRodeosEntered(numRodeosEntered);
		getNumRodeosWon();
		setNumRodeosWon(numRodeosWon);
		getAnnualRodeoIncome();
		setAnnualRodeoIncome(annualRodeoIncome);
	}

}
