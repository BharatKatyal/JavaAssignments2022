
public class Building {
	
	int numOfStories;
	
	public Building() {
		getABuilding();
	}
	public Building(int numOfStories) {
		setNumOfStories(numOfStories);
		// TODO Auto-generated constructor stub
	}
	public void getABuilding() {
		setNumOfStories(numOfStories);

	}
	public int getNumOfStories() {
		return numOfStories;
	}
	public void setNumOfStories(int numOfStories) {
		this.numOfStories = numOfStories;
	}
	@Override
	public String toString() {
		return "This Building has  [numOfStories=" + numOfStories + "]" +"\n";
	}
}
