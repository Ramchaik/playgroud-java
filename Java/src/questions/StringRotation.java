import java.util.Scanner;

public class StringRotation {
  static boolean isSubstring(String s1, String s2) {
    return s1.contains(s2);
  }

  static boolean isRotation(String s1, String s2) {
    int len = s1.length();
    
    if (len > 0 && len == s2.length()) {
      String s1s1 = s1 + s1; 

      return isSubstring(s1s1, s2);
    }
    return false;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str1 = sc.nextLine();
    String str2 = sc.nextLine();

    System.out.println("has rotation: " + isRotation(str1, str2));
  }
}
