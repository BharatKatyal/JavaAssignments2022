public class Main {
  public static void main(String[] args) {
    System.out.println(sum(15));
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}
