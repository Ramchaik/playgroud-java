package introduction.loops;

public class NestedFor {

  public static void main(String[] args) {

    for (int i = 1; i <= 20; ++i) {
      for (int j = 1; j <= 10; ++j) {
        System.out.println(i + " * " + j + " = " + i * j);
      }

      System.out.println();
    }

  }
}
