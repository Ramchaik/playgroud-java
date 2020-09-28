package operators;

public class LogicalOperators {
  public static void main(String[] args) {

    // AND
    int number = -10;

    // returns false if first conditions fails
    if (number >= 1 && number <= 100) {
      System.out.println("Number lies between 1 to 100.");
    }

    // Checks both conditions
    if (number >= 1 & number <= 100) {
      System.out.println("Number lies between 1 to 100.");
    }
    // -------------------

    // OR
    int grade = 11;

    // retuns true if first condition is true
    if (grade == 10 || grade == 12) {
      System.out.println("BOARD is coming.");
    }

    // Checks both conditions
    if (grade == 10 | grade == 12) {
      System.out.println("BOARD is coming.");
    }

    // -------------------

    // NOT
    if (!(grade == 10 || grade == 12)) {
      System.out.println("BOARD is NOT coming.");
    }
    // -------------------

  }
}
