import java.text.SimpleDateFormat;
import java.util.Date;

public class Dog extends Animal {
	private String name;
	private String dob;
	private String breed;
//    Date dob = new Date();
//	private date dob;

//    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(dob);  

//	SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
//	Date date = format.parse(request.getParameter("event_date"));


	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Dog(int weight,int height, String name, String dob, String breed) {
		super(weight,height);
		setDob(dob);
		setName(name);
		setBreed(breed);
	}
	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}


	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		String result;
		result = "DOG: "+name  + super.toString() + " "+ name+  " was born on : " +dob + " and is of " +breed+" breed.";
		return result;
	}

}
