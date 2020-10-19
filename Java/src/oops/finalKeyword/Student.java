package oops.finalKeyword;

public final class Student {
  final int rollNo;
  final static String name;
  final int age;
  // intializer block
  {
    rollNo = 3;
  }

  // static block
  static {
    name = "Vaibhav";
  }

  // constructor
  public Student() {
    age = 15;
  }
  
  public final void getDescription() {
    System.out.println("Some description");
  }
  
}
