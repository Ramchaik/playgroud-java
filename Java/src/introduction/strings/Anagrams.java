package strings;

public class Anagrams {
  public static void main(String[] args) {
    String a = "acbad21@";
    String b = "a@21bdca";
    if (a.length() != b.length())
      System.out.println("Not anagram");
    else {

      // O(n ^ 2) Approach
      // boolean isAnagram = false;
      // boolean[] visited = new boolean[a.length()];

      // for (int i = 0; i < a.length(); ++i) {
      // char c = a.charAt(i);

      // for (int j = 0; j < b.length(); ++j) {
      // if (b.charAt(j) == c && !visited[j]) {
      // visited[j] = true;
      // isAnagram = true;
      // break;
      // }

      // }

      // if (!isAnagram)
      // break;
      // }

      // O(n) Approach

      int count[] = new int[256];
      boolean isAnagram = true;

      for (char c : a.toCharArray()) {
        int index = (int) c;
        count[index]++;
      }

      for (char c : b.toCharArray()) {
        int index = (int) c;
        count[index]--;
      }

      for (int i = 0; i < 256; ++i) {
        if (count[i] != 0) {
          isAnagram = false;
          break;
        }
      }

      if (isAnagram)
        System.out.println("Is Anagram ");
      else
        System.out.println("Is NOT Anagram");

    }
  }

}
