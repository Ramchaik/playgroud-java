package questions.arraysAndStrings;
import java.util.Scanner;

public class URLify {
  static char[] replaceSpaces(char[] str, int trueLength) {
    int spaceCount = 0, index, i = 0;

    for (i = 0; i < trueLength; ++i)
      if (str[i] == ' ')
        spaceCount++;

    index = trueLength + spaceCount * 2;

    if (trueLength < str.length) {
      str[trueLength] = '\0';
    }

    for (i = trueLength - 1; i >= 0; --i) {
      if (str[i] == ' ') {
        str[index - 1] = '0';
        str[index - 2] = '2';
        str[index - 3] = '%';
        index = index - 3;
      } else {
        str[index - 1] = str[i];
        index--;
      }
    }

    return str;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    int trueLength = sc.nextInt();

    for (char c : replaceSpaces(str.toCharArray(), trueLength)) {
      System.out.print(c);
    }

  }

}
