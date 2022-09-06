
public class Office extends Building {
	int officeNumber;
	String officePurpose;
	
	public Office(int numOfStories, int officeNumber,String officePurpose) {
		super.setNumOfStories(numOfStories);
		setOfficeNumber(officeNumber);
		setOfficePurpose(officePurpose);
				
	}

	private void getaOffice() {
		
		// TODO Auto-generated method stub
		
	}

	public int getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(int officeNumber) {
		this.officeNumber = officeNumber;
	}

	public String getOfficePurpose() {
		return officePurpose;
	}

	public void setOfficePurpose(String officePurpose) {
		this.officePurpose = officePurpose;
	}

	@Override
	public String toString() {
		return "Office [officeNumber=" + officeNumber + ", officePurpose=" + officePurpose + "]"+ super.toString() +"\n";
	}
	
	

}
