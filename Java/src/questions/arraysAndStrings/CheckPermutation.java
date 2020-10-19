package questions.arraysAndStrings;

import java.util.Scanner;

public class CheckPermutation {

  static boolean checkPermutation(String s, String t) {
    if (s.length() != t.length())
      return false;

    int[] char_set = new int[128];

    char[] s_array = s.toCharArray();
    for (char c : s_array) {
      ++char_set[c];
    }

    for (int i = 0; i < t.length(); ++i) {
      int val = (int) t.charAt(i);

      --char_set[val];

      if (char_set[val] < 0)
        return false;
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();

    System.out.println("checkPermutation: " + checkPermutation(str1, str2));

  }

}
