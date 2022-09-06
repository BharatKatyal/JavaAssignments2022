
public class Bird extends Animal {
	private String fly;
	private double wingSpan;
	
	public Bird(int weight,int height,String fly, double wingspan) {
		super(weight,height);
		setFly(fly);
		setWingSpan(wingspan);
		
		
	}

	
	public double getWingSpan() {
		return wingSpan;
	}
	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}
	public String isFly() {
		return fly;
	}
	public void setFly(String fly) {
		this.fly = fly;
	}
	
	
	public String toString() {
		String result;
		result = "Bird: " + super.toString() +   " Flying Status: " + fly + " Fly! with a wingspan of  "+ wingSpan +" inches.";
		return result;
	}

	

}
