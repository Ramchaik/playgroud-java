package recursion.advancedProblems;

import java.util.HashSet;
import java.util.Set;

public class Permutations {
  static Set<String> set;

  static String swapCharsInString(String s, int a, int b) {
    char[] chars = s.toCharArray();
    char temp = chars[a];
    chars[a] = chars[b];
    chars[b] = temp;
    return String.valueOf(chars);
  }

  static void permutations(String s, int l, int r) {
    if (l == r) {
      // check for unique permutation
      if (set.contains(s))
        return;

      set.add(s); // Update set for unique permutation

      System.out.println(s);
      return;
    }

    for (int i = l; i <= r; i++) {
      s = swapCharsInString(s, l, i);
      permutations(s, l + 1, r);
      s = swapCharsInString(s, l, i);
    }
  }

  public static void main(String[] args) {
    set = new HashSet<>();
    permutations("abca", 0, 3);
  }

}
