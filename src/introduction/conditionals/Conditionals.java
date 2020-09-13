package conditionals;

public class Conditionals {
  public static void main(String[] args) {
    int age = 18;

    if (age >= 18) {
      System.out.println("You can vote!!");
    }

    int noOfPetals = 21;

    if (noOfPetals % 2 == 0) {
      System.out.println("I am God!");
    } else {
      System.out.println("I am THE God!");
    }

    int number = 41;

    if (number <= 10) {
      System.out.println("Less than 10");
    } else if (number > 10 && number <= 30) {
      System.out.println("greater than 10 and less than 30");
    } else if (number > 30 && number <= 40) {
      System.out.println("greater than 30 and less than 40");
    } else {
      System.out.println("greater than 40");
    }

    int a = 10;
    int b = 12;
    int c = 100;
    int result = -1;

    // Shorthand
    int maxOfBoth = a > b ? a : b;
    System.out.println("Max of " + a + " and " + b + ": " + maxOfBoth);

    if (a > b) {
      if (a > c) {
        result = a;
      } else {
        result = c;
      }
    } else {
      if (b > c) {
        result = b;
      } else {
        result = c;
      }
    }

    System.out.println("Max of 3: " + result);

    result = -1;

    // Ternary Magic
    result = a > b ? a > c ? a : c : b > c ? b : c;
    System.out.println("Max of 3: " + result);

    // Switch

    int dayOfWeek = 8;

    switch (dayOfWeek) {
      case 1:
        System.out.println("I am 1");
        break;

      case 2:
        System.out.println("I am 2");
        break;

      case 3:
        System.out.println("I am 3");
        break;

      case 4:
        System.out.println("I am 4");
        break;

      case 5:
        System.out.println("I am 5");
        break;

      case 6:
        System.out.println("I am 6");
        break;

      case 7:
      case 8:
        System.out.println("I am 7 or 8");
        break;

      default:
        System.out.println("I am default");
    }
  }
}
