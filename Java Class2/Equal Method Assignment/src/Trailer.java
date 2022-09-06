
public class Trailer extends Building {
	int yearMade; // This can be date
	String wide; // only single or double - he wants us to use bool?
	public Trailer(int numOfStories, int yearMade, String wide) {
		super.setNumOfStories(numOfStories);
		getYearMade();
		setYearMade(yearMade);
		getWide();
		setWide(wide);		
	}
	private void getATrailer() {
		// TODO Auto-generated method stub
	
		
	}
	public int getYearMade() {
		return yearMade;
	}
	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}
	public String getWide() {
		return wide;
	}
	public void setWide(String wide) {
		this.wide = wide;
	}
	@Override
	public String toString() {
		return  "Trailer [yearMade=" + yearMade + ", wide=" + wide + "]" + super.toString() +"\n";
	}
	
	
	
	
}
