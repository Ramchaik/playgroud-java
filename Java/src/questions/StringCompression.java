import java.util.Scanner;

public class StringCompression {
  static String stringCompression(String str) {
    StringBuilder result = new StringBuilder();

    if (str.length() <= 1) return str;

    char prev = str.charAt(0);
    int count = 1;

    for (int i = 1; i < str.length(); ++i) {
      char currentChar = str.charAt(i);

      if (currentChar == prev) {
        count++;
      } else {
        result.append(prev);
        result.append(count);

        prev = currentChar;
        count = 1;
      }
    }

    result.append(prev + "" + count);

    return result.length() > str.length() ? str : result.toString();
  }

  public static String compress(String str) {
    StringBuilder compressed = new StringBuilder();
    int countConsecutive = 0;

    for (int i = 0; i < str.length(); ++i) {
      countConsecutive++;

      if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
        compressed.append(str.charAt(i));
        compressed.append(countConsecutive);
        countConsecutive = 0;
      }
    }

    return compressed.length() < str.length() ? compressed.toString() : str;
  }

  public static String _compress(String str) {
    int finalLength = countCompression(str);
    if (finalLength >= str.length()) return str;

    StringBuilder compressed = new StringBuilder(finalLength);
    int countConsecutive = 0;

    for (int i = 0; i < str.length(); ++i) {
      countConsecutive++;

      if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
        compressed.append(str.charAt(i));
        compressed.append(countConsecutive);
        countConsecutive = 0;
      }
    }

    return compressed.toString();
  }

  public static int countCompression(String str) {
    int countCompressed = 0;
    int countConsecutive = 0;

    for (int i = 0; i < str.length(); ++i) {
      countConsecutive++;

      if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
        countCompressed += 1 + String.valueOf(countConsecutive).length();
        countConsecutive = 0;
      }
    }

    return countCompressed;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // System.out.println(String.valueOf(4));
    // System.out.println(String.valueOf(4).length());
    // System.out.println();

    String str = sc.nextLine();
    System.out.println("Compressed String: " + stringCompression(str));
    System.out.println("Compressed String 2: " + compress(str));
    System.out.println("Compressed String 3: " + _compress(str));
  }
}
