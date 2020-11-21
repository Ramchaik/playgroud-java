package recursion;

public class CalculatePower {
  static int stepCount;
  static int anotherStepCount;

  public static int getPower(int base, int exponent) {
    stepCount++;

    if (exponent == 0)
      return 1;

    return base * getPower(base, exponent - 1);
  }

  // Approx: O(Log(n))
  public static int getFastPower(int base, int exponent) {
    anotherStepCount++;
    if (exponent <= 0)
      return 1;

    return exponent % 2 == 0 ? getFastPower(base * base, exponent / 2) : base * getFastPower(base, exponent - 1);
  }

  public static void main(String[] args) {
    int base = 3, exponent = 30;

    System.out.println("The power of " + base + " raised to power of " + exponent + " is: " + getPower(base, exponent));
    System.out.println("step Count : " + stepCount);
    System.out
        .println("The power of " + base + " raised to power of " + exponent + " is: " + getFastPower(base, exponent));
    System.out.println("step Count : " + anotherStepCount);
  }

}
