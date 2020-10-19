package questions.arraysAndStrings;
import java.util.HashMap;
import java.util.Scanner;

public class PalindromePermutation {

  static boolean palindromePermutation(String str) {
    HashMap<Character, Integer> map = new HashMap<>();
    int oddCounts = 0;

    for (char c : str.toCharArray())
      map.put(c, map.getOrDefault(c, 0) + 1);

    for (int count : map.values()) {

      if (count % 2 == 1) {
        if (oddCounts == 1) {
          return false;
        }
        oddCounts++;
      }
    }

    return true;
  }

  static int getCharNumber(Character c) {
    int a = Character.getNumericValue('a');
    int z = Character.getNumericValue('z');
    int val = Character.getNumericValue(c);

    if (val >= a && val <= z) {
      return val - a;
    }
    return -1;
  }

  static int[] buildCharFrequenceTable(String phrase) {
    int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

    for (char c : phrase.toCharArray()) {
      int x = getCharNumber(c);
      if (x != -1) {
        table[x]++;
      }
    }
    return table;
  }

  static boolean checkMaxOneOdd(int[] table) {
    boolean foundOdd = false;

    for (int count : table) {
      if (count % 2 == 1) {
        if (foundOdd) {
          return false;
        }

        foundOdd = true;
      }
    }
    return true;
  }

  static boolean isPermutationOfPalindrome(String phrase) {
    int countOdd = 0;
    int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

    for (char c : phrase.toCharArray()) {
      int x = getCharNumber(c);

      if (x != -1) {
        table[x]++;
        if (table[x] % 2 == 1) {
          countOdd++;
        } else {
          countOdd--;
        }
      }
    }

    return countOdd <= 1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    int[] table = buildCharFrequenceTable(str);

    System.out.println("STR: " + str);
    System.out.println("palindromePermutation: " + palindromePermutation(str));
    System.out.println("palindromePermutation 2: " + checkMaxOneOdd(table));
    System.out.println("palindromePermutation 3: " + isPermutationOfPalindrome(str));
  }

}
