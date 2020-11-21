package recursion;

public class SumOfNaturalNumbers {

  public static int getSum(int n) {
    if (n == 1)
      return n;

    return n + getSum(n - 1);
  }

  public static void main(String[] args) {
    int n = 10;
    System.out.println("Sum of first " + n + " natural numbers is : " + getSum(n));
  }
}
