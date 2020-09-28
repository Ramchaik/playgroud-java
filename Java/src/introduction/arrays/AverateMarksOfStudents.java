package arrays;

import java.util.Scanner;

public class AverateMarksOfStudents {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of Students: ");
    int totalStudents = sc.nextInt();

    int[] marks = new int[totalStudents];
    for (int i = 0; i < totalStudents; ++i) {
      System.out.println("Enter marks of student " + (i + 1));
      marks[i] = sc.nextInt();
    }

    int sum = 0;
    for (int i = 0; i < totalStudents; ++i)
      sum += marks[i];

    System.out.println("Avg of Student Marks: " + sum / totalStudents);

  }

}
