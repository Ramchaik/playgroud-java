package introToPackages;

class Vehicle {
  int wheels;
  int headLights;
  String color;

  Vehicle(int wheels) {
    this.wheels = wheels;
    headLights = 2;
  }

  Vehicle(int wheels, String color) {
    this.wheels = wheels;
    this.color = color;
    headLights = 4;
  }

}

public class MyConstructor {
  MyConstructor() {

    System.out.println("Object is now created");

  }

  public static void main(String[] args) {
    MyConstructor obj = new MyConstructor();
    Vehicle car = new Vehicle(4);
    Vehicle scooty = new Vehicle(2);

    System.out.println(car.wheels);
    System.out.println(scooty.wheels);
  }

}
