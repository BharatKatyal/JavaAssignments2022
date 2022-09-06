package compositeClass;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TestClass {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		int choice = 0;
		do {
			choice = Methods.getChoice();
			switch(choice) {
			case 1://Add a student
				students.add(new Student());
				break;
			case 2: // Display all students
				Methods.displayStudents(students);//System.out.println(students);
				break;
			case 3: //quit
				break;
			default: //invalid
				System.out.println("Invalid Menu Choice");
				break;
			
			}
		}while(choice != 3);
	

	}

}
