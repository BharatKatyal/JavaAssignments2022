import javax.swing.JOptionPane;

public class Cowboy {
	private String nameOfHorse;
	private int numRodeosEntered;

	private int numRodeosWon;
	private double annualRodeoIncome;

	public Cowboy() {
		getCowboy();
	}

	/*
	 * public Cowboy(double weight, double height, String nameOfHorse, int
	 * numRodeosEntered, int numRodeosWon, double annualRodeoIncome) { super(weight,
	 * height); setNameOfHorse(nameOfHorse); setNumRodeosEntered(numRodeosEntered);
	 * setNumRodeosWon(numRodeosWon); setannualRodeoIncome(annualRodeoIncome); }
	 */

	public String getNameOfHorse() {

		String mess = "Enter horse name: ";
		String prompt = "Please Type";
		mess = JOptionPane.showInputDialog(mess, prompt);
		setNameOfHorse(mess);
		
		String firstLetter = nameOfHorse.substring(0, 1).toUpperCase();
		String restLetters = nameOfHorse.substring(1).toLowerCase();
		return firstLetter + restLetters;

	}

	public void setNameOfHorse(String nameOfHorse) {
		this.nameOfHorse = nameOfHorse;
	}

	public int getNumRodeosEntered() {
		String mess = "Enter number of rodeos won: ";
		String prompt = "Please Type";
		mess = JOptionPane.showInputDialog(mess, prompt);
		numRodeosEntered = Integer.parseInt(mess);
		setNumRodeosEntered(mess);
		return numRodeosEntered;
	}

	public void setNumRodeosEntered(int numRodeosEntered) {
		if(
		
		
		
		
		
		
		
		this.numRodeosEntered = numRodeosEntered;
	}

	public int getNumRodeosWon() {
		String mess = "Enter annual income: ";
		String prompt = "Please Type";
		mess = JOptionPane.showInputDialog(mess, prompt);
		double value = Integer.parseDouble(value);
		setAnnualRodeoIncome(value);
		return value;
	}

	public void setNumRodeosWon(int numRodeosWon) {
		this.numRodeosWon = numRodeosWon;
	}

	public double getAnnualRodeoIncome() {
		return annualRodeoIncome;
	}

	public void setAnnualRodeoIncome(double annualRodeoIncome) {
		this.annualRodeoIncome = annualRodeoIncome;
	}

	@Override
	public String toString() {

		String result = super.toString() + "\n";
		result += "Your are a Cowboy\n";
		result += "Horse name: " + getNameOfHorse() + "\n";
		result += "Total number of rodeos: " + getNumRodeosEntered() + "\n";
		result += "Total number of rodeos won: " + getNumRodeosWon() + "\n";
		return result += "Total annual income: " + annualRodeoIncome + "\n";

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
