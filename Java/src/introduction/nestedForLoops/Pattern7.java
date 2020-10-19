package introduction.nestedForLoops;

import java.util.Scanner;

public class Pattern7 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; ++i) {
      if (i == 1 || i == n)
        for (int j = 1; j <= i; ++j)
          System.out.print("* ");
      else {
        System.out.print("* ");
        for (int j = 1; j <= i - 2; ++j)
          System.out.print("  ");
        System.out.print("* ");
      }

      System.out.println();
    }

  }
}
