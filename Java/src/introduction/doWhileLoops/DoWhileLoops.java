package introduction.doWhileLoops;

import java.util.Scanner;

public class DoWhileLoops {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 1;

    do {
      n = sc.nextInt();
      System.out.println(n);
    } while (n != 0);
  }

}
