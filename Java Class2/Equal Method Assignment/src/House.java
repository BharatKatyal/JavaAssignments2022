
public class House extends Building{
	double houseLength;
	double houseWidth;
	int numOfBedrooms;
	public House(){
		
		
	}
	public double getHouseLength() {
		return houseLength;
	}
	public void setHouseLength(double houseLength) {
		this.houseLength = houseLength;
	}
	public double getHouseWidth() {
		return houseWidth;
	}
	public void setHouseWidth(double houseWidth) {
		this.houseWidth = houseWidth;
	}
	public int getNumOfBedrooms() {
		return numOfBedrooms;
	}
	public void setNumOfBedrooms(int numOfBedrooms) {
		this.numOfBedrooms = numOfBedrooms;
	}
	public House(int numOfStories,double houseLength, double houseWidth, int numOfBedrooms) {
		super.setNumOfStories(numOfStories);
		this.houseLength = houseLength;
		this.houseWidth = houseWidth;
		this.numOfBedrooms = numOfBedrooms;
	}
	@Override
	public String toString() {
		return "House [houseLength=" + houseLength + ", houseWidth=" + houseWidth + ", numOfBedrooms=" + numOfBedrooms
				+ "]"+super.toString()  +"\n";
	}
	

}
