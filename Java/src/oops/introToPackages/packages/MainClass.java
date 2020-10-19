package oops.introToPackages.packages;

import oops.introToPackages.packages.models.Student;
import oops.introToPackages.packages.models.Teacher;

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