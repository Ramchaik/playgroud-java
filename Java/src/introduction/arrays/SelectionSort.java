package introduction.arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int[] a = { 9, 3, 12, -1, 2, 0 };
    int n = a.length;

    for (int i = 0; i < n - 1; ++i) {
      int minIndex = i;

      for (int j = i + 1; j < n; ++j) {
        if (a[minIndex] > a[j]) {
          minIndex = j;
        }
      }

      if (minIndex != i) {
        int temp = a[i];
        a[i] = a[minIndex];
        a[minIndex] = temp;
      }
    }

    for (int item : a)
      System.out.print(item + " ");
  }

}
