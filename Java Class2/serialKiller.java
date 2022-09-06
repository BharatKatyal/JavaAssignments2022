package javaProgramming;

import javax.swing.JOptionPane;

public class serialKiller {
	String weaponOfChoice;
	int totalWomenKilled;
	int totalMenKilled;
	int totalPeopleKilled = totalWomenKilled + totalMenKilled;

	public serialKiller() {
		getSerialKiller();
	}

	public void getSerialKiller() {
		// TODO Auto-generated method stub
		String mess = "Weapon Used: ";
		String prompt = "Type something here...";
		mess = JOptionPane.showInputDialog(mess, prompt);
		setWeaponOfChoice(mess);

		
		boolean invalidWomen = true;

		do {
		mess = "How many Women have they killed: ";
		prompt = "Type something here...";
		mess = JOptionPane.showInputDialog(mess, prompt);
		int womenKilled = Integer.parseInt(mess);
		if (womenKilled > 0) {
		setTotalWomenKilled(womenKilled); 
		invalidWomen = false;
		} 
			else {
				invalidWomen = true;
			}
		}while (invalidWomen);
		
		
		mess = "How many Men have they killed: ";
		prompt = "Type something here...";
		mess = JOptionPane.showInputDialog(mess, prompt);
		int menKilled = Integer.parseInt(mess);
		setTotalMenKilled(menKilled);
	}

	public String getWeaponOfChoice() {
		return weaponOfChoice;
	}

	public void setWeaponOfChoice(String weaponOfChoice) {
		this.weaponOfChoice = weaponOfChoice;
	}

	public int getTotalWomenKilled() {
		return totalWomenKilled;
	}

	public void setTotalWomenKilled(int totalWomenKilled) {
		this.totalWomenKilled = totalWomenKilled;
	}

	public int getTotalMenKilled() {
		return totalMenKilled;
	}

	public void setTotalMenKilled(int totalMenKilled) {
		this.totalMenKilled = totalMenKilled;
	}

	@Override
	public String toString() {
		String result = super.toString();
		result += "They are a known serial killer. \n";
		result += "Weapon of Choice: " + weaponOfChoice + " \n";
		result += "Total Women Killed: " + totalWomenKilled + " \n";
		result += "Total Men Killed: " + totalMenKilled + " \n";
		result += "Total People Killed: " + (totalWomenKilled + totalMenKilled) + " \n";
		return result;
	}

}
