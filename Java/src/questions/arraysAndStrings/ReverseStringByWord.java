package arraysAndStrings;
import java.util.Scanner;

/**
 * ReverseStringByWord
 */
public class ReverseStringByWord {
  static String reverseWord(String word) {
    String ans = "";
    int i = word.length() - 1;
    int j;

    while (i >= 0) {
      while (i >= 0 && word.charAt(i) == ' ')
        --i;

      if (i < 0)
        break;

      j = i;
      while (i >= 0 && word.charAt(i) != ' ')
        --i;

      if (ans.isEmpty())
        ans = ans.concat(word.substring(i + 1, j + 1));
      else
        ans = ans.concat(" " + word.substring(i + 1, j + 1));
    }

    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();

    String result = reverseWord(word);

    System.out.println("\"" + result + "\"");
  }
}
