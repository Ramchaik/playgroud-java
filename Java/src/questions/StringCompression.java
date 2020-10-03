import java.util.Scanner;

public class StringCompression {
  static String stringCompression(String str) {
    StringBuffer result = new StringBuffer();
    int[] charFrequencies = new int[128];

    for (char c : str.toCharArray()) {
      int val = (int) c;

      charFrequencies[val]++;
    }

    for (char c : str.toCharArray()) {
      int val = (int) c;

      result.append(c + "" + charFrequencies[val]);
    }
    System.out.println("STRING: " + result.toString());

    return result.length() > str.length() ? str : result.toString();
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    System.out.println("Compressed String: " + stringCompression(str));
    
  }
}
