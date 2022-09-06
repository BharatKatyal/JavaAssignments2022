package compositeClass;

import javax.swing.JOptionPane;

public class Student {
	private Name name;
	private double gpa;
	
	public Student() {
		getAStudent();
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	
	public String toString() {
		String result = name.toString() + "\n";
		result += "GPA: " + gpa + "\n";
		return result;
		
		//return name + " " + gpa;
	}
	
	public void getAStudent() {
		name = new Name();
		String mess = "What is your GPA: ";
		String prompt = "type Something";
		mess = JOptionPane.showInputDialog(mess, prompt);
		double value = Double.parseDouble(mess);
		setGpa(value);
	}
	
	

}
