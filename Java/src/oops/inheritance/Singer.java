package oops.inheritance;

public class Singer extends Person {
  public Singer(String name) {
    super(name);
    System.out.println("Inside singer constuctor");
  }

  public void sing() {
    System.out.println(name + " is singing");
  }

}
