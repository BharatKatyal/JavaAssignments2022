import java.util.Comparator;

//implements Comparable<Fruit>
public class Person implements Comparable<Person> {
	public String fName;
	public String lName;
	public String phoneNumber;
	public Person(String fName, String lName, String phoneNumber) {
		// TODO Auto-generated constructor stub
		
		getfName(); 
		setfName(fName);
		getlName();
		setlName(lName);
		getPhoneNumber();
		setPhoneNumber(phoneNumber);
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Person [fName=" + fName + ", lName=" + lName + ", phoneNumber=" + phoneNumber + "]";
	}
    public static Comparator<Person> PerNameComparator = new Comparator<Person>() {

	public int compare(Person s1, Person s2) {
	   String PersonName1 = s1.getfName().toUpperCase();
	   String PersonName2 = s2.getfName().toUpperCase();

	   //ascending order
	   return PersonName1.compareTo(PersonName2);

	   //descending order
	   //return StudentName2.compareTo(StudentName1);
    }};
	@Override
	public int compareTo(Person persons) {
		// TODO Auto-generated method stub
        return this.fName.compareTo(persons.fName);
	}
	



}
