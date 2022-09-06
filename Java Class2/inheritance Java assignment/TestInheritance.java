import java.text.SimpleDateFormat;
import java.util.Date;



public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
//		Date date = format.parse(request.getParameter("event_date"));
	
		
//	    String sDate1="31/12/1998";  
//	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
//	    System.out.println(sDate1+"\t"+date1);  
		
		Animal myPet = new Animal(12,4);
		
		
		
		Cat jill = new Cat(10,2,"jill");
		System.out.println(jill);
		// CAT DONE
		
		// DOG
		Dog max = new Dog(32,4,"Max","01/10/1994","husky");
		System.out.println(max);


		// Bird
		Bird flye = new Bird(23,1,"can",23.4);
		System.out.println(flye);

		
//		max.setName("maxwell");
//	max.setWeight(56);
		
	}

}
