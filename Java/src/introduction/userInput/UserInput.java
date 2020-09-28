package userInput;

import java.util.Scanner;

public class UserInput {
  public static float getSimpleIntrest(int principal, float rate, int time) {
    return (principal * rate * time / 100);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int principal = sc.nextInt();
    float rate = sc.nextFloat();
    int time = sc.nextInt();

    System.out.println("Simple Intrest: " + getSimpleIntrest(principal, rate, time));

  }

}
