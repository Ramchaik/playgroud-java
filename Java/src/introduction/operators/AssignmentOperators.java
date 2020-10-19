package introduction.operators;

public class AssignmentOperators {
  public static void main(String[] args) {
    // assignment opeartor '='
    int a = 4;

    a += 2; // a = a + 2
    System.out.println(a);

    a *= 2; // a = a * 2
    System.out.println(a);

    a /= 2; // a = a / 2
    System.out.println(a);

    // a %= 2; // a = a % 2
    // System.out.println(a);

    a <<= 2; // a = a << 2
    System.out.println(a);

    a >>= 2; // a = a >> 2
    System.out.println(a);

    a &= 2; // a = a & 2
    System.out.println(a);

    a |= 2; // a = a | 2
    System.out.println(a);
  }

}
