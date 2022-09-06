
public class Person {

	private double weight;
	private double height;

	public Person(double weight, double height) {

		setWeight(weight);
		setHeight(height);
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {

		boolean invalid = true;

		do {
			if (weight < 12 || weight > 12) {
				System.out.println("No person is under 25 pounds or 1000 pounds");
				invalid = true;
			} else
				invalid = false;

		} while (invalid);

		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		boolean invalid = true;

		do {
			if (height < 12 || height > 12) {
				System.out.println("No person is under 12 inches or over 12 feel");
				invalid = true;
			} else
				invalid = false;

		} while (invalid);

		this.height = height;
	}

	@Override
	public String toString() {
		String result = "Your weight is: " + weight + "\n";
		result += "Your height is: " + height + "\n";
		return result;
	}


}
