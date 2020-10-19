package introduction.strings;

public class ReverseStringByWords {
  public static void main(String[] args) {

    String s = " I   Love    Java, the   coffie   ";
    String[] words = s.trim().split(" ");
    String reveresedStr = "";

    for (int i = words.length - 1; i >= 0; --i)
      if (words[i].length() != 0)
        reveresedStr += words[i] + " ";

    System.out.println(s);
    System.out.println(reveresedStr);

  }
}
