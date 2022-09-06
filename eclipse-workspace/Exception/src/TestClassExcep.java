import java.util.Scanner;

public class TestClassExcep {
  static Scanner input = new Scanner(System.in);
  public static int getInt(String mess) {  
      int result = 0;
      boolean badValue = true;
      System.out.print(mess);
      result = input.nextInt();



      return result;
  }// end getInt
} // end class Methods