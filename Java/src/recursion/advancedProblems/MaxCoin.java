package recursion.advancedProblems;

public class MaxCoin {
  static int maxCoin(int[] a, int l, int r) {
    if (l + 1 == r) {
      return Math.max(a[l], a[r]);
    }

    return (Math.max(
      a[l] + Math.min(maxCoin(a, l + 2, r), maxCoin(a, l + 1, r - 1)),
      a[r] + Math.min(maxCoin(a, l + 1, r - 1), maxCoin(a, l, r - 2))
    ));
  }

  public static void main(String[] args) {
    int a[] = { 1, 5, 7, 3, 2, 4 };
    System.out.println(maxCoin(a, 0, a.length - 1));
  }
}
