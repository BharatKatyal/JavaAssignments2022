package classNotes;

public class Test {

	public static void main(String[] args) {
		
		//Animal myAnimal = new Animal(99.99);
		//System.out.println(myAnimal);
		Dog myDog = new Dog(33.33, "Rover", "Mutt");
		//Animal myDog = new Dog(33.33, "Rover", "Mutt");
		System.out.println(myDog);
		myDog.makesSound();
		myDog.whichArea();

	}//end of main()

}//end test
