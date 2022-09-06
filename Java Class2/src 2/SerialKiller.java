import javax.swing.JOptionPane;

public class SerialKiller extends Person {
	private String weaponOfChoice;
	private int totalWomenKilled;
	private int totalMenKilled;


	public SerialKiller() {
		getSerialKiller();
	}

	public SerialKiller(Name name, double height, double weight, String weaponOfChoice, int totalWomenKilled,
			int totalMenKilled) {
		super(name, height, weight);
		this.weaponOfChoice = weaponOfChoice;
		this.totalWomenKilled = totalWomenKilled;
		this.totalMenKilled = totalMenKilled;
	}

	public void getSerialKiller() {
		getWeaponOfChoice();
		setWeaponOfChoice(weaponOfChoice);
		getTotalWomenKilled();
		setTotalWomenKilled(totalWomenKilled);
		getTotalMenKilled();
		setTotalMenKilled(totalMenKilled);
	}

	public String getWeaponOfChoice() {
		String mess = "What weapon was used?";
		String prompt = "Type something";
		mess = JOptionPane.showInputDialog(mess, prompt);
		weaponOfChoice = mess;
		return weaponOfChoice;
	}

	public void setWeaponOfChoice(String weaponOfChoice) {
		this.weaponOfChoice = weaponOfChoice;
	}

	public int getTotalWomenKilled() {
		String mess = "How many women have they killed?";
		String prompt = "Type something";
		mess = JOptionPane.showInputDialog(mess, prompt);
		try {
			totalWomenKilled = Integer.parseInt(mess);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid Number of Women\nPlease try again.", null,
					JOptionPane.ERROR_MESSAGE);
			getTotalWomenKilled();
		}
		return totalWomenKilled;
	}

	public void setTotalWomenKilled(int totalWomenKilled) {
		if (totalWomenKilled >= 0) {
			try {
				this.totalWomenKilled = totalWomenKilled;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Invalid Number of Women\nPlease try again.", null,
						JOptionPane.ERROR_MESSAGE);
				getTotalWomenKilled();
			}
		} else {
			JOptionPane.showMessageDialog(null, "Invalid Number of Women\nPlease try again.", null,
					JOptionPane.ERROR_MESSAGE);
			getTotalWomenKilled();
		}
	}

	public int getTotalMenKilled() {
		String mess = "How many Men have they killed: ";
		String prompt = "Type something";
		mess = JOptionPane.showInputDialog(mess, prompt);
		try {
			totalMenKilled = Integer.parseInt(mess);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid Number of Men\nPlease try again.", null,
					JOptionPane.ERROR_MESSAGE);
			getTotalMenKilled();
		}
		return totalMenKilled;
	}

	public void setTotalMenKilled(int totalMenKilled) {
		if (totalMenKilled >= 0) {
			try {
				this.totalMenKilled = totalMenKilled;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Invalid Number of Men\nPlease try again.", null,
						JOptionPane.ERROR_MESSAGE);
				getTotalMenKilled();
			}
		} else {
			JOptionPane.showMessageDialog(null, "Invalid Number of Men\nPlease try again.", null,
					JOptionPane.ERROR_MESSAGE);
			getTotalMenKilled();
		}
	}

	public String toString() {
		String result = super.toString();
		int totalKilled = totalWomenKilled + totalMenKilled;
		result += "Weapon of Choice: " + weaponOfChoice + " \n";
		result += "Total Women Killed: " + totalWomenKilled + " \n";
		result += "Total Men Killed: " + totalMenKilled + " \n";
		result += "Total People Killed: " + (totalKilled) + " \n";
		return result;
	}


}
