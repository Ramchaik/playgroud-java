package introToPackages.packages;

import introToPackages.packages.models.Student;
import introToPackages.packages.models.Teacher;

/**
 * MainClass
 */
public class MainClass {
  public static void main(String[] args) {
    Student obj = new Student("Tom");
    Teacher obj1 = new Teacher();
    System.out.println(obj.getName());

  }

}