package methods;

public class PassByValue {
  public static void main(String[] args) {

    // int c = 12;
    // int d = 13;

    // swap(c, d);

    // System.out.println("c: " + c + " d: " + d);

    Dog1 c = new Dog1();
    c.legs = 3;
    Dog1 d = new Dog1();
    d.legs = 9;

    Dog1 f = new Dog1();
    f.legs = 1;

    changeDog(f);
    System.out.println(f.legs);

    swap(c, d);
    // System.out.println("c: " + c.legs + " d: " + d.legs);
  }

  static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
  }

  static void swap(Dog1 a, Dog1 b) {
    Dog1 temp = a;
    a = b;
    b = temp;
  }

  static void changeDog(Dog1 d) {
    d.legs = 10;
  }
}

class Dog1 {
  int legs;

}
