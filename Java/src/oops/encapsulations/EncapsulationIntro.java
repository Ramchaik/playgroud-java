package oops.encapsulations;

/**
 * EncapsulationIntro
 */
public class EncapsulationIntro {
  public static void main(String[] args) {
    Student s = new Student();
    s.setAge(90);
    s.setName("Hello");
    System.out.println(s.getName());
    System.out.println(s.getAge());

  }

}