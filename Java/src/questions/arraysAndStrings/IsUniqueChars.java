package arraysAndStrings;
import java.util.Scanner;

public class IsUniqueChars {
  static boolean isUniqueChars(String str) {
    boolean[] char_set = new boolean[128];

    for (int i = 0; i < str.length(); ++i) {
      int val = str.charAt(i);

      if (char_set[val])
        return false;
      char_set[val] = true;
    }

    return true;
  }

  static boolean _isUniqueChars(String str) {
    // given is string will only contain small alphabets
    int checker = 0;

    for (int i = 0; i < str.length(); ++i) {
      int val = str.charAt(i) - 'a';

      if ((checker & (1 << val)) > 0)
        return false;

      checker |= (1 << val);
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    System.out.println("isUniqueChars(" + str + ") : " + isUniqueChars(str));
    System.out.println("_isUniqueChars(" + str + ") : " + _isUniqueChars(str));
  }

}
