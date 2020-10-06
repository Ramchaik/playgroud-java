import java.util.Scanner;

public class ZeroMatrix {
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

    // setZeros(mat);
    _setZeros(mat);
  }

  static void setZeros(int[][] mat) {
    boolean[] row = new boolean[mat.length];
    boolean[] col = new boolean[mat[0].length];

    for (int i = 0; i < mat.length; ++i) {
      for (int j = 0; j < mat[0].length; ++j) {
        if (mat[i][j] == 0) {
          row[i] = true;
          col[j] = true;
        }
      }
    }

    for (int i = 0; i < mat.length; ++i) {
      if (row[i]) nullifyRow(mat, i);
    }

    for (int i = 0; i < mat.length; ++i) {
      if (col[i]) nullifyCol(mat, i);
    }

    System.out.println();
    printMatrix(mat);
  }

  static void _setZeros(int[][] mat) {
    boolean rowHasZero = false;
    boolean colHasZero = false;

    // Check if first row has zeros
    for (int i = 0; i < mat[0].length; ++i) {
      if (mat[0][i] == 0) {
        rowHasZero = true;
        break;
      }
    }

    // Check if first col has zeros
    for (int i = 0; i < mat.length; ++i) {
      if (mat[i][0] == 0) {
        colHasZero = true;
        break;
      }
    }

    // Check if rest of the matrix has 0 and update first row and col with i and j
    for (int i = 1; i < mat.length; ++i) {
      for (int j = 1; j < mat[0].length; ++j) {
        if (mat[i][j] == 0) {
          mat[i][0] = 0;
          mat[0][j] = 0;
        }
      }
    }

    // Check if first col has zero and nullify row depending on index
    for (int i = 1; i < mat.length; ++i) {
      if (mat[i][0] == 0) nullifyRow(mat, i); 
    }

    // Check if first row has zero and nullify col depending on index
    for (int i = 1; i < mat[0].length; ++i) {
      if (mat[0][i] == 0) nullifyCol(mat, i); 
    }

    if (rowHasZero) nullifyRow(mat, 0); // Update first row if it had zero
    if (colHasZero) nullifyCol(mat, 0); // Update first col if it had zero

    System.out.println();
    printMatrix(mat);
  }

  static void nullifyRow(int[][] mat, int row) {
    for (int i = 0; i < mat.length; ++i) {
      mat[row][i] = 0;
    }
  }

  static void nullifyCol(int[][] mat, int col) {
    for (int i = 0; i < mat[0].length; ++i) {
      mat[i][col] = 0;
    }
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
