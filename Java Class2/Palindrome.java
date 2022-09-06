
public class Palindrome {

	public Palindrome() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	Boolean palindromChecker(String...str) {
		int counter=0;
		int notPal =0;
		boolean check;
		
		for(int i=0; i<str.length; i++) {
//			System.out.println(str[i].equals(new StringBuilder(str[i]).reverse().toString()));
			if(str[i].equals(new StringBuilder(str[i]).reverse().toString())) {
				counter ++;

			}
		}
		
		if(str.length == counter) {
			check= true;
		}else {
			check= false;
		}
		return check;

}

}
