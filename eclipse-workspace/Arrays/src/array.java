
// start 1:15
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;



public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
	    int upperbound = 25;


		int randomNumbers[];
		randomNumbers = new int[5];



		
		for(int i =0; i<randomNumbers.length; i++) {
			randomNumbers[i]= rand.nextInt(upperbound);
		}
		Arrays.sort(randomNumbers); 
//		Arrays.sort(randomNumbers,Collections.reverseOrder()); 
//		Collections.sort(randomNumbers, Collections.reverseOrder());
//		Collections.reverseOrder(randomNumbers);
//	    Arrays.sort(randomNumbers, Collections.reverseOrder());

//	    findFrequency(randomNumbers);





		MinAndMaxAndAvg m =  new MinAndMaxAndAvg();

		
		for(int j =0; j<randomNumbers.length; j++) {
			System.out.println(randomNumbers[j]);
			
		}

//		findFrequency(randomNumbers);
		
		System.out.println("This is Max" + m.max(randomNumbers));
		System.out.println("This is Min" + m.min(randomNumbers));
		System.out.println("This is length" +randomNumbers.length);

		System.out.print("This is avg "+ m.avg(randomNumbers));




	}
//	//Function to calculate the frequency of all elements in the array
//	public static void findFrequency(int[] A)
//	{
//		// create a count array of size `n` to store the count of all array elements
//		int[] freq = new int[A.length];
//
//		// update frequency of each element
//		for (int e: A) {
//			freq[e]++;
//		}
//
//		// iterate through the array to print frequencies
//		for (int i = 0; i < freq.length; i++)
//		{
//			if (freq[i] > 0) {
//				System.out.printf("%d appears %d times\n", i, freq[i]);
//			}
//		}
//	}
//	
}
