package whileLoops;

import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    int temp = number;
    int sum = 0;

    while (temp > 0) {
      int lastDigit = temp % 10;
      temp /= 10;

      sum += lastDigit;
    }

    System.out.println(sum);

    int numberOfDigits = (int) Math.log10(number) + 1;
    System.out.println(numberOfDigits);

  }

}
