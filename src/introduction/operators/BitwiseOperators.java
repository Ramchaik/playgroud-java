package operators;

public class BitwiseOperators {

  public static void main(String[] args) {
    int a = 5;
    int b = 6;

    int c = a & b; // AND
    int d = a | b; // OR

    int e = b >> 1; // Right shift (divide by 2^n) n = 1
    int e1 = b >> 3; // Right shift (divide by 2^n) n = 3
    int f = b << 1; // Left shift (multiply by 2^n) n = 1
    int f1 = b << 3; // Left shift (multiply by 2^n) n = 3

    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(e1);
    System.out.println(f);
    System.out.println(f1);

  }
}
