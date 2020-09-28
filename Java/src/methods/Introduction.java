package methods;

public class Introduction {
  public static void main(String[] args) {
    int firstNum = 30;
    int secondNum = 33;

    int result = maxOf(firstNum, secondNum);
    System.out.println(result);

  }

  // Method overloading
  static int maxOf(int a, int b) {
    return a > b ? a : b;
  }

  static int maxOf(float a, float b) {

    return 0;
  }

  static void maxOf(int a, int b, int c) {

  }

}
