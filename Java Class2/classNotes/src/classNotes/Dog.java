package classNotes;

public class Dog extends Animal implements AnimalStuff, DogStuff2{
	private String name;
	private String breed;
	
	public Dog(double weight, String name, String breed) {
		super(weight);
		this.name = name;
		this.breed = breed;
	}

	public String toString() {
		String result = super.toString() + "\n";
		result += "I am a dog. My name is " + name + ".\n";
		result += "My breed is " + breed + ".\n";
		return result;
	}
	
	public void makesSound() {
		System.out.println("I say arf arf arf!\n");
	}
	
	public void whichArea() {
		if(super.getWeight() > 95.5) {
			System.out.println("go to big park");
		}
		
		else {
			System.out.println("go to small park");
		}
	}
	
	
}
