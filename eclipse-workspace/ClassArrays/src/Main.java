
public class Main {

	public static void main(String[] args) {
		int size = 0;
		int eSize=0;
//		int []MyArray1;
		
//		System.out.println("please enter an array size");
		
		size = 100;
		
		int[]MyArray1 = new int[size];
		
		// load the array with random values 
		
		eSize = loadArray(myArray1,eSize);
		
		// display the stuff in array
	displayArray(myArray1,eSize);
		
	}// test of main
	
	public static int loadArray(int []a, int eSize) {
		final int lowerNum = 1;
		final int higherNum = 100;
		for(eSize=eSize; eSize < a.length  ; eSize++) {
			a[eSize] = (int)(Math.random()* (higherNum-lowerNum+lowerNum)+lowerNum);
		}// end of loop
		return eSize;
	}// end of method loadArray
	
	public static int displayArray(int []b, int eSize) {
		
		for(eSize=eSize; eSize < b.length  ; eSize++) {
			System.out.println( (b+1)+ "Contains "+ b[eSize]);
		}// end of loop
	}
	

}// end of Main public class
