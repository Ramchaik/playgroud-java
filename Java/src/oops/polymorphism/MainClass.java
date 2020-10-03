package polymorphism;


public class MainClass {
  public static void main(String[] args) {
    Dog d = new Dog();

    Pet p = d; // Upcasting
    Animal a = p; // Upcasting

    // Variables are not overriden
    System.out.println(d.name);
    System.out.println(p.name);

    // Overriding
    d.walk();
    p.walk();

    // Overloading
    greetings();
    greetings("RAJU");
    greetings("MUKESH", 10);
  }

  public static void greetings() {
    System.out.println("Hello World!");
  }

  public static void greetings(String s) {
    System.out.println("Hello " + s);
  }
  
  public static void greetings(String s, int count) {
    for (int i = 0; i < count; ++i) System.out.println("Hello " + s);
  }
}
