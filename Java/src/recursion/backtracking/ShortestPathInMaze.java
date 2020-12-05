package recursion.backtracking;

public class ShortestPathInMaze {
  static int MAX_COST = 100000;

  static boolean isValid(int a[][], int i, int j, boolean vis[][]) {
    int rows = a.length;
    int cols = a[0].length;

    return i >= 0 && j >= 0 && i < rows && j < cols && a[i][j] == 1 && !vis[i][j];
  }

  static int shortestPath(int a[][], int i, int j, int x, int y, boolean vis[][]) {
    if (!isValid(a, i, j, vis))
      return MAX_COST;

    if (i == x && j == y)
      return 0;

    vis[i][j] = true;
    int left = shortestPath(a, i, j - 1, x, y, vis) + 1;
    int right = shortestPath(a, i, j + 1, x, y, vis) + 1;
    int up = shortestPath(a, i - 1, j, x, y, vis) + 1;
    int down = shortestPath(a, i + 1, j, x, y, vis) + 1;

    // backtracking
    vis[i][j] = false;

    return Math.min(Math.min(left, right), Math.min(up, down));
  }

  static int shortestPath(int a[][], int i, int j, int x, int y) {
    int rows = a.length;
    int cols = a[0].length;

    boolean vis[][] = new boolean[rows][cols];

    return shortestPath(a, i, j, x, y, vis);
  }

  public static void main(String[] args) {
    int a[][] = { { 1, 1, 1, 0, 0, 1 }, { 1, 0, 1, 0, 0, 0 }, { 0, 1, 1, 1, 0, 1 }, { 1, 1, 0, 1, 0, 0 },
        { 1, 0, 1, 1, 0, 1 }, { 0, 1, 0, 1, 1, 0 }, };

    for (int i = 0; i < a.length; ++i) {
      for (int j = 0; j < a[i].length; ++j) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }

    int srcX = 0;
    int srcY = 0;
    int destX = 5;
    int destY = 4;

    int result = shortestPath(a, srcX, srcY, destX, destY);
    if (result >= MAX_COST)
      System.out.println("Path not possible");
    else
      System.out.println("Cost of shortest path from source(" + srcX + "," + srcY + ") to destination(" + destX + ", "
          + destY + "): " + result);
  }

}
