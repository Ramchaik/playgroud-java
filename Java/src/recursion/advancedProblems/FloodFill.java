package recursion.advancedProblems;

public class FloodFill {
  public static void floodFill(int[][] a, int r, int c, int toFill, int prevFill) {
    int rows = a.length;
    int cols = a[0].length;

    if (r < 0 || r >= rows || c < 0 || c >= cols)
      return;
    if (a[r][c] != prevFill)
      return;

    a[r][c] = toFill;

    // Up
    floodFill(a, r - 1, c, toFill, prevFill);
    // Right
    floodFill(a, r, c + 1, toFill, prevFill);
    // Down
    floodFill(a, r + 1, c, toFill, prevFill);
    // Left
    floodFill(a, r, c - 1, toFill, prevFill);
  }

  static void printMatrix(int[][] a) {
    int rows = a.length;
    for (int i = 0; i < rows; ++i) {
      int cols = a[i].length;
      for (int j = 0; j < cols; ++j) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int[][] a = { { 1, 1, 1 }, { 1, 2, 1 }, { 2, 2, 4 }, { 4, 4, 4 } };

    floodFill(a, 0, 0, 0, 1);

    printMatrix(a);
  }

}
