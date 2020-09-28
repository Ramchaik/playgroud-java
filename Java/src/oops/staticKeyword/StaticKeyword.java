package staticKeyword;

import staticKeyword.A.B;
import staticKeyword.A.C;

public class StaticKeyword {
  static {
    System.out.println("In static block 1");
  }

  public static void main(String[] args) {
    System.out.println("In main function");

    // non-static and tightly coupled
    A objA = new A();
    B objB = objA.new B();

    // static
    C objC = new A.C();

  }

  static {
    System.out.println("In static block 2");
  }

}
