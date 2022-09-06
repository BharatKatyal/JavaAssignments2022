import java.util.ArrayList;

class Main {
 public static void main(String[] args) 
    {

      		ArrayList<ClassA> str = new ArrayList<>();


      		ClassA a = new ClassB("bharat", 26, 5.5);
		ClassA b = new ClassA("sam", 36);
		ClassA c = new ClassB("dad", 29, 7.5);

		str.add(a);
		str.add(b);
		str.add(c);


      double highestNum = 0;
int index=0;
		for (int i = 0; i < str.size(); i++) {
			if (str.get(i) instanceof ClassB) {
        if (str.get(i).passingWeight > highestNum) {
					highestNum = str.get(i).passingWeight;
          index = i;
				}
			}

      
    }
          System.out.println(str.get(index));

}
}