package arraysAndStrings;
import java.util.Scanner;

public class RotateMatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int[][] mat = new int[rows][cols];

    for (int i = 0; i < rows; ++i) {
      for (int j = 0; j < cols; ++j) {
        mat[i][j] = sc.nextInt();
      }
    }

    // rotateMatrix(mat);
    inplaceRotationOfMatrix(mat);
  }

  static void rotateMatrix(int[][] mat) {
    int row = mat.length;
    int col = mat[0].length;
    System.out.println("row: " + row + " col: " + col);
    int[][] fMat = new int[col][row];

    for (int i = 0; i < row; ++i) {
      for (int j = 0; j < col; ++j) {
        fMat[j][row - 1 - i] = mat[i][j];
      }
    }

    System.out.println();
    System.out.println("After Rotation: ");
    System.out.println();

    printMatrix(fMat);
  }

  static boolean inplaceRotationOfMatrix(int[][] m) {
    if (m.length == 0 || m.length != m[0].length) return false;
    int n = m.length;

    for (int layer = 0; layer < n / 2; ++layer) {
      int first = layer;
      int last = n - 1 - layer;

      for (int i = first; i < last; ++i) {
        int offset = i - first;
        int top = m[first][i]; // save top

        // left -> top
        m[first][i] = m[last - offset][first];

        // bottom -> left
        m[last - offset][first] = m[last][last - offset];

        // right -> bottom
        m[last][last - offset] = m[i][last];

        // top -> right
        m[i][last] = top; 
      }
    }

    System.out.println();
    printMatrix(m);

    return true;
  }

  static void printMatrix(int[][] mat) {
    for (int i = 0; i < mat.length; ++i) {
      for (int j = 0; j < mat[0].length; ++j) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
  }
  
}
