package oops.introToPackages;

class Cat {
  boolean hasFur;
  int legs, eyes;
  String name;

  public void walk() {
    System.out.println("Cat is walking");
  }

  public void eat() {
    System.out.println("Cat is eating");
  }

  public void description() {
    System.out.println("Cats name " + name + " with " + eyes + " eyes and " + legs + " legs.");
  }
}

class Dog {
  String breed, name;

  public void jump() {
    System.out.println("Dog jumped");
  }

  public void description() {
    System.out.println("My Dog's name is " + name + " of breed " + breed);
  }
}

public class MainClass {
  public static void main(String[] args) {
    Cat c1 = new Cat();
    Cat c2 = new Cat();

    c1.name = "C1";
    c1.legs = 4;
    c1.eyes = 2;

    c1.walk();
    c1.description();

    c2.name = "C2";
    c2.legs = 3;
    c2.eyes = 1;

    c2.description();

    Dog d1 = new Dog();
    Dog d2 = new Dog();

    d1.name = "Jack";
    d1.breed = "husky";
    d1.jump();
    d1.description();

    d2.breed = "poodle";
    d2.name = "Mark";
    d2.description();

  }

}
