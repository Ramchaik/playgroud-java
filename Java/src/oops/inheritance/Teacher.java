package oops.inheritance;

public class Teacher extends Person {
  public Teacher(String name) {
    super(name);
    System.out.println("Inside teacher constuctor");
  }

  public void teach() {
    System.out.println(name + " is teaching");
  }

  // Method Overriding
  public void eat() {
    super.eat(); // call to immediate super class
    System.out.println("teacher " + name + " is eating");
  }
}
