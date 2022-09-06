import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestData {

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>(); // Create an ArrayList object


		persons.add(new Person("John", "Smith", "610-555-7384"));
		persons.add(new Person("Sarah", "Barnes", "215-555-3827"));
		persons.add(new Person("Mark", "Riley", "733-555-2969"));
		persons.add(new Person("Laura", "Getz", "663-555-3984"));
		persons.add(new Person("Larry", "Smith", "464-555-3489"));
		persons.add(new Person("Frank", "Phelps", "322-555-2284"));
		persons.add(new Person("Mario", "Guzman", "804-555-9066"));
		persons.add(new Person("Marsha", "Grant", "243-555-2837"));

		System.out.println("********* Unsorted List below *********");

		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i));
		}

		Collections.sort(persons);
		System.out.println("********* sorted list below *********");
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i));
		}
		
		System.out.println("********* equals method below - finding similar last name **********");
		for (int i = 0; i < persons.size(); i++) {

			if(persons.get(i).lName.equals("Smith")) {
				System.out.println(persons.get(i));
			}
			
		}

	

		// TODO Auto-generated method stub

	}
}
