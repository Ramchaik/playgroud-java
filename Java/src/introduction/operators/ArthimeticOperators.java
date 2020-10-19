package introduction.operators;

public class ArthimeticOperators {
  public static void main(String[] args) {

    int a = 3;
    int b = 4;

    // int c = a * a + b * b + 2 * a * b;
    // int d = (a + b) * (a + b);

    // System.out.println(c);
    // System.out.println(d);
    // System.out.println(d == c);

    // double quotient = (double) b / (double) a;
    // int remainder = b % a;

    // System.out.println(quotient);
    // System.out.println(remainder);

    int c = b++; // post increment
    int d = ++a; // pre increament
    System.out.println(c + " " + b);
    System.out.println(d + " " + a);

  }
}
