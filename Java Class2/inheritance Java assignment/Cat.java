
public class Cat extends Animal {
	private String name;
	private int lives = 9;
	public Cat(int weight,int height, String name) {
		super(weight,height);
		setName(name);
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	
	
	public String toString() {
		String result;
		result = "CAT: "+name + super.toString() +name +  " can also have up-to  " + lives + " lives! ";
		return result;
	}

}
