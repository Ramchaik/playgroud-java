package inheritance;

public class MainClass {
  public static void main(String[] args) {
    Teacher t = new Teacher("Mr. Harry");
    t.eat();
    t.walk();
    t.teach();

    Person p = t; // Implicit (Down Casting)

    Teacher t1 = (Teacher) p; // Explicit (Up Casting) : as t is actually of type Teacher

    // to check instance of class
    System.out.println(t instanceof Teacher);
    System.out.println(t instanceof Person);

    System.out.println(p instanceof Person);
    System.out.println(p instanceof Teacher);

    System.out.println(t1 instanceof Person);
    System.out.println(t1 instanceof Teacher);

    Singer s = new Singer("Dr DRE");
    s.sing();

  }

}
