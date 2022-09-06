import javax.swing.JOptionPane;

public class Date {
	// dates have a month, day, and year
	private int month;
	private int day;
	private int year;

	public Date() {// default constructor for Date
		getDate();

	}// end constructor

	public int getMonth() {// getter for month
		boolean in = false;
		do {
			try {
				String mess = "What month was this person born(1-12)? ";
				mess = JOptionPane.showInputDialog(mess);
				month = Integer.parseInt(mess);
				in = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Invalid Input: Must be a month 1-12\nPlease Try Again", null,
						JOptionPane.ERROR_MESSAGE);
			}
		} while (in == false);
		return month;
	}// end get

	public void setMonth(int month) {// setter for month and checks input
		if (month >= 1 && month <= 12) {
			this.month = month;
		} // end if
		else {
			JOptionPane.showMessageDialog(null, "Invalid Input: Must be a month 1-12\nPlease Try Again", null,
					JOptionPane.ERROR_MESSAGE);
			getMonth();
		} // end else

	}// end set

	public int getDay() {// getter for day
		boolean in = false;
		do {
			try {
				String mess = "What day was this person born? ";
				mess = JOptionPane.showInputDialog(mess);
				day = Integer.parseInt(mess);
				in = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Invalid Day\nPlease Try Again", null, JOptionPane.ERROR_MESSAGE);
			}
		} while (in == false);
		return day;
	}// end get

	public void setDay(int day, int month, int year) {// setter for day and checks if valid day or not
		if (day >= 1 && day <= 31)
			this.day = day;
		if (month == 2 && day > 29 && isLeap(year) == true) {
			JOptionPane.showMessageDialog(null, "Invalid Day\nPlease Try Again", null, JOptionPane.ERROR_MESSAGE);
			getDay();
		}
		if (month == 2 && day > 28 && isLeap(year) == false) {
			JOptionPane.showMessageDialog(null, "Invalid Day\nPlease Try Again", null, JOptionPane.ERROR_MESSAGE);
			getDay();
		} // end if
		if (day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
			JOptionPane.showMessageDialog(null, "Invalid Day\nPlease Try Again", null, JOptionPane.ERROR_MESSAGE);
			getDay();
		} // end if
	}// end set day

	public int getYear() {// getter for year
		boolean in = false;
		do {
			try {
				String mess = "What Year was this person born(YYYY)? ";
				mess = JOptionPane.showInputDialog(mess);
				year = Integer.parseInt(mess);
				in = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Invalid Year\nPlease Try Again", null, JOptionPane.ERROR_MESSAGE);
			}
		} while (in == false);
		return year;
	}// end get

	public void setYear(int year) {
		this.year = year;
	}// end set

	public String toString() {// formats output
		String mess = "\n";
		mess += "DOB: " + month + "/" + day + "/" + year;
		return mess;
	}// end toString

	public void getDate() {// calls all the methods for use
		getYear();
		setYear(year);
		getMonth();
		setMonth(month);
		getDay();
		setDay(day, month, year);
	}// end getDate

	public boolean isLeap(int year) {
		boolean leap = false;

		// if the year is divided by 4
		if (year % 4 == 0) {

			// if the year is century
			if (year % 100 == 0) {

				// if year is divided by 400
				// then it is a leap year
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			} // end if

			// if the year is not century
			else
				leap = true;
		} // end if

		else
			leap = false;
		return leap;
	}// end isLeap

}// end date
