
public abstract class Person {// blueprint for what a person can be

	private Name name;
	private Date date;

	public Person() {// no arg constructor
		getAPerson();
	}

	private void getAPerson() {// calls the name and date functions
		name = new Name();
		date = new Date();
	}

	public Name getName() {
		return name;
	}// end get

	public void setName(Name name) {
		this.name = name;
	}// end set

	public Date getDate() {
		return date;
	}// get

	public void setDate(Date date) {
		this.date = date;
	}// end set

	public String toString() {// formats output
		return name.toString() + date.toString();
	}// end toString()

	public boolean equals(Object obj) {// compares two objects and sees if they are equal
		if (this != obj) {
			return false;
		}
		if (obj instanceof Person) {
			return true;
		}

		return false;
	}// end equals

	// abstract method that children must create
	public abstract String thisIsWhatIDo();

}// end person
