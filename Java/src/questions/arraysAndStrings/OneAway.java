package questions.arraysAndStrings;
import java.util.Scanner;

public class OneAway {
  static boolean oneAway(String original, String edited) {
    int editCount = 0;
    int len1 = original.length();
    int len2 = edited.length();

    int diff = Math.abs(len1 - len2);

    if (diff > 1) return false;

    for (int i = 0, j = 0; i < len1 && j < len2; ) {

      if (original.charAt(i) != edited.charAt(j)) {
        editCount++;
        i++;
        if (diff == 0) j++;
      } else {
        i++;
        j++;
      }
    }

    return editCount <= 1;
  }

  static boolean oneEditReplace(String s1, String s2) {
    boolean foundDifference = false;

    for (int i = 0; i < s1.length(); ++i) {
      if (s1.charAt(i) != s2.charAt(i)) {
        if (foundDifference) return false;

        foundDifference = true;
      }
    }

    return true;
  }

  static boolean oneEditInsert(String s1, String s2) {
    int index1 = 0;
    int index2 = 0;

    while (index1 < s1.length() && index2 < s2.length()) {
      if (s1.charAt(index1) != s2.charAt(index2)) {
        if (index1 != index2) {
          return false;
        }
        index2++;
      } else {
        index1++;
        index2++;
      }
    }

    return true;
  }

  static boolean oneEditAway(String s1, String s2) {
    if (s1.length() == s2.length()) {
      return oneEditReplace(s1, s2);
    } else if (s1.length() + 1 == s2.length()) {
      return oneEditInsert(s2, s1);
    } else if (s1.length() - 1 == s2.length()) {
      return oneEditInsert(s1, s2);
    }

    return false;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String original = sc.nextLine();
    String afterEdit = sc.nextLine();

    System.out.println("one edit away: " + oneAway(original, afterEdit));
    System.out.println("one edit away (2): " + oneEditAway(original, afterEdit));
  }
  
}
