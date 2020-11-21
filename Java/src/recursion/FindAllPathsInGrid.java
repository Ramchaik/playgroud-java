package recursion;

public class FindAllPathsInGrid {
  public static int getTotalPaths(int n, int m) {
    if (m == 1 || n == 1)
      return 1;

    return getTotalPaths(n - 1, m) + getTotalPaths(n, m - 1);
  }

  public static void main(String[] args) {
    int n = 10, m = 10;
    System.out.println("Total paths in grid of " + n + " x " + m + " is : " + getTotalPaths(n, m));

  }
}
