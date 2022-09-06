
public class Animal extends Object {

private int weight;
private int height;

public Animal(int weight, int height) {
	super();
	setWeight(weight);
	setHeight(height);
}



public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}

public String toString() {
	String results;
	results = " - This animal weights " + weight + "LB and is " + height+ " FT tall. ";
	return results;
}



public int getHeight() {
	return height;
}



public void setHeight(int height) {
	this.height = height;
}
}
