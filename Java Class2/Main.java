import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

class Main {
  public static void main(String[] args) {
   
   ArrayList<String> names = new ArrayList<String>(5);
   addToList(names);
       	// System.out.println( " . The name is " + names.get(0));

Collections.sort(names);   
displayList(names);
System.out.println("Total Number Of Names Entered: " + names.size());
vowelsCount(names);

String max = Collections.max(names, Comparator.comparing(String::length)); // or s -> s.length()
	System.out.println("The Name with the most letters is : "+ max +" ("+(max.length()+") Letters"));

  }// end of main
  public static void displayList(ArrayList<String> array){

  for(int i = 0; i< array.size(); i++){
    	System.out.println((i+1)+ ". name is: " + array.get(i));

  } // enf for loop
  }// end displayList

    public static void addToList(ArrayList<String> array){
      Scanner sc= new Scanner(System.in); //System.in is a standard input stream 
      boolean repeat = true;
      while (repeat){
    	  System.out.print("Enter your Name:  - Type Done when done entering names ");
    	  String str= sc.next();
    	  
    	  if ("done".equals(str)) { // Ones "done is entered this condition is activated"
    		  System.out.println("List Input Completed. ");
    		  repeat = false; // This would break the infinite while loop 
    	  } else {
    		  array.add(str);
    		  System.out.println("Added to ArrayList ");
    		  repeat = true;
      		 // This would continue the loop


    	  }// end of else statement 
      }//end of while loop
      

  }// end addToList
    
    public static void vowelsCount(ArrayList<String> vowels) {
        int counter = 0;
        char letter= ' '; 

        for(int i = 0; i< vowels.size(); i++){
          for(int a = 0; a<vowels.get(i).length(); a++){
             letter = vowels.get(i).charAt(a);
  if(letter == 'a' || letter == 'e'|| letter=='i'|| letter=='o'|| letter == 'u' ){
        counter++;

  }

          }// Looping throuygh the "Strings"
          }// Looping through all the strings in the array 
          System.out.println("Total vowels Entered : " +counter);
    

      } // end of vowelsCount



}// end of class



