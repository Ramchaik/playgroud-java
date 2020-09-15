package whileLoops;

import java.util.Scanner;

public class PalindromeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int temp = n;
    int reverse = 0;

    while (temp > 0) {
      int lastDigit = temp % 10;
      temp /= 10;

      reverse = reverse * 10 + lastDigit;
    }

    if (reverse == n)
      System.out.println("Number is Palindrome");
    else
      System.out.println("Number is not Palindrome");

  }

}
