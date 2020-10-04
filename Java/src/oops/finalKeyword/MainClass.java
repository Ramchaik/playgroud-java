package finalKeyword;

public class MainClass {
  final String n = "raju"; // Need to initialize the final class varialbe

  // public void getDescription() {
  //   System.out.println("Override Student's method");
  // }
  public static void main(String[] args) {
    // *** final variable - Start ***
    String name = "Vaibhav";
    name = "Singh";
    int x = 3;
    x = 30;

    final int x1 = 3;
    // x1 = 30;
    final String name1 = "DD";
    // name1 = "CC";

    final String n1; // Can initialize the variable later in case of local final variable, but only once
    n1 = "D";

    final Student obj = new Student();
    Student obj2 = new Student();
    // obj = obj2; // Cannot do this

    // *** final variable - End ***

    // *** final method - Start ***

    // MainClass o = new MainClass();
    // o.getDescription();

    // *** final method - End ***

    // *** final class - Start ***

    // Cannnot extend Student class as it is final
    
    // *** final class - End ***
  }
  
}
