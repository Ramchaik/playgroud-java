package introduction.typeCasting;
public class TypeCasting {
  public static void main(String[] args) {
    // Automatic Type casting
    byte x = 2;
    int y = x;

    int x1 = 7;
    double y1 = x1;

    System.out.println(y);
    System.out.println(y1);

    System.out.println("\n----------------------------\n");

    // Widening Type casting
    double myDouble = 3.14;
    int myInt = (int) myDouble;

    System.out.println(myDouble);
    System.out.println(myInt);
  }

}
