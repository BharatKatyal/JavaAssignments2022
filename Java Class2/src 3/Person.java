import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Person {
	public Name name;
	private double weight;
	private double height;
	
	public Person() {
		getAPerson();
	}

	private void getAPerson() {
		name = new Name();
		getWeight();
		setWeight(weight);
		getHeight();
		setHeight(height);

	}

	public Person(Name name, double weight, double height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public double getWeight() {
		String mess = "Enter a weight between 25 pounds or 1000 pounds: ";
		String prompt = "type Something";
		mess = JOptionPane.showInputDialog(mess, prompt);
		try {
			weight = Double.parseDouble(mess);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid Weight Entered\nPlease try again.", null,
					JOptionPane.ERROR_MESSAGE);
			this.getWeight();
		}
		return weight;
	}

	public void setWeight(double weight) {
			if (weight >= 25 && weight <= 1000) {
				try {
					this.weight = weight;
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Invalid Weight Entered\nPlease try again.", null,
							JOptionPane.ERROR_MESSAGE);
					getWeight();
					
				}
			} else {
				JOptionPane.showMessageDialog(null, "Invalid Weight Entered\nPlease try again.", null,
						JOptionPane.ERROR_MESSAGE);
				getWeight();
			}
	}

	public double getHeight() {
		String mess = "Enter a height between 1 and 12 feet : ";
		String prompt = "type Something";
		mess = JOptionPane.showInputDialog(mess, prompt);
		try {
			height = Double.parseDouble(mess);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid Height Entered\nPlease try again.", null,
					JOptionPane.ERROR_MESSAGE);
			getHeight();
		}
		return height;
	}

	public void setHeight(double height) {
		if (height >= 1 && height <= 12) {
			try {
				this.height = height;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Invalid Height Entered\nPlease try again.", null,
						JOptionPane.ERROR_MESSAGE);
				getHeight();
			}
		} else {
			JOptionPane.showMessageDialog(null, "Invalid Height Entered\nPlease try again.", null,
					JOptionPane.ERROR_MESSAGE);
			getHeight();
		}
	}

	public String toString() {
		String result = name.toString() + "\n";
		result += "Weight: " + weight + " pounds" + "\nHeight: " + height + " feet" + "\n";
		return result;
	}

	public static int getCowboyStats(@SuppressWarnings("rawtypes") ArrayList persons) {
		int counter = 0;
		for (int i = 0; i < persons.size(); i++) {
			if (persons.get(i) instanceof Cowboy) {
				counter++;
			}
		}
		return counter;
	}

	public static int getAthleteStats(@SuppressWarnings("rawtypes") ArrayList persons) {
		int counter = 0;
		for (int i = 0; i < persons.size(); i++) {
			if (persons.get(i) instanceof Athlete) {
				counter++;
			}
		}
		return counter;
	}

	public static int getSerialKillerStats(@SuppressWarnings("rawtypes") ArrayList persons) {
		int counter = 0;
		for (int i = 0; i < persons.size(); i++) {
			if (persons.get(i) instanceof SerialKiller) {
				counter++;
			}
		}
		return counter;
	}
	


}
