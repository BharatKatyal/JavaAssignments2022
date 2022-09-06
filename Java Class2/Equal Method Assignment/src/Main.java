import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ArrayList<Building> buildings = new ArrayList<>();
		   buildings.add(new Building(5));
		   buildings.add(new Building(4));
		   buildings.add(new House(5,10, 50,50));
		   buildings.add(new House(7,22, 40,50));
		   buildings.add(new House(9,52, 23,50));
		   buildings.add(new Trailer(1, 2015,"single"));
		   buildings.add(new Trailer(1, 2000,"double"));
		   buildings.add(new Trailer(1, 2020,"single"));
		   buildings.add(new Office(1, 123,"Lawyer Office"));
		   buildings.add(new Office(2, 555,"Doctor Office"));
		   buildings.add(new Office(5, 11,"Doctor Office"));
		   buildings.add(new Office(3, 584,"Lawyer Office"));
		   buildings.add(new Office(5, 22,"Retail Shop"));



			char choice = 'Q';
			// Convert lower case to upper
			do {
				choice = Methods.getChoice(choice);
				switch (choice) {
//				case 'A':
//					buildings.add(new Building());
//					break;
//				case 'B':
//					buildings.add(new House());
//					break;
//				case 'C':
//					buildings.add(new Trailer());
//					break;
//				case 'D': 
//					buildings.add(new Office());
				case 'E': 
					System.out.println(buildings);
					break;
				case 'F': 
					displayBuildings(buildings);
				case 'G': 
					displayHomes(buildings);
					break;
				case 'H': 
					displayTrailers(buildings);
					break;
				case 'I': 
					displayOffices(buildings);
					break;
				case 'J': 
					displayDoctorOffices(buildings);
					break;
				case 'K': 
					displayLawyerOffices(buildings);
					break;
				case 'L': 
					displayRetailShop(buildings);
					break;
				case 'Q': // quit
					//System.exit(0);
					break;
				case ' ':
					break;
				default: // invalid
					String mess = "Invalid Menu Choice";
					JOptionPane.showMessageDialog(null, mess);
					break;
				}// end of switch
			} while (choice != 'Q');

	}
	
	
	public static void displayBuildings(@SuppressWarnings("rawtypes") ArrayList myList) {
			for (int i = 0; i < myList.size(); i++) {
				if (myList.get(i) instanceof Building) {
				System.out.println(myList.get(i).toString());
			}
		}	
	} // end of display buildings
	
	public static void displayHomes(@SuppressWarnings("rawtypes") ArrayList myList) {
			for (int i = 0; i < myList.size(); i++) {
				if (myList.get(i) instanceof House) {
				System.out.println(myList.get(i).toString());
			}
		}	
	} // end of display homes
	
	public static void displayTrailers(@SuppressWarnings("rawtypes") ArrayList myList) {
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i) instanceof Trailer) {
			System.out.println(myList.get(i).toString());
		}
	}	
} // end of display trailers

	public static void displayOffices(@SuppressWarnings("rawtypes") ArrayList myList) {
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i) instanceof Office) {
			System.out.println(myList.get(i).toString());
		}
	}	
} // end of display offices
	
	public static void displayDoctorOffices(@SuppressWarnings("rawtypes") ArrayList myList) {
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i) instanceof Office) {
				if (((Office) myList.get(i)).getOfficePurpose().equals("Doctor Office") == true) {
					System.out.println(myList.get(i).toString());
				}
		}
	}	
} // end of display doctor offices

	public static void displayLawyerOffices(@SuppressWarnings("rawtypes") ArrayList myList) {
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i) instanceof Office) {
				if (((Office) myList.get(i)).getOfficePurpose().equals("Lawyer Office") == true) {
					System.out.println(myList.get(i).toString());
				}
		}
	}	
} // end of display lawyer offices
	
	public static void displayRetailShop(@SuppressWarnings("rawtypes") ArrayList myList) {
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i) instanceof Office) {
				if (((Office) myList.get(i)).getOfficePurpose().equals("Retail Shop") == true) {
					System.out.println(myList.get(i).toString());
				}
		}
	}	
} // end of display retail shop

}
