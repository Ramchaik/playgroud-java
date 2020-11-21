package comparatorAndComparables;

import java.util.*;

public class MainClass {

  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();

    students.add(new Student(70, "John"));
    students.add(new Student(38, "Ramesh"));
    students.add(new Student(38, "Suresh"));
    students.add(new Student(92, "John"));
    students.add(new Student(19, "Sam"));

    // Collections.sort(students, new SortByNameThenMarks());
    // Collections.sort(students, new Comparator<Student>() {

    // @Override
    // public int compare(Student o1, Student o2) {
    // // TODO Auto-generated method stub
    // return o1.name.equals(o2.name) ? o1.marks - o2.marks :
    // o1.name.compareTo(o2.name);
    // }

    // });

    // Lambda Functions
    // Collections.sort(students, (o1, o2) -> {
    // if (o1.name.equals(o2.name)) {
    // return o1.marks - o2.marks;
    // } else {
    // return o1.name.compareTo(o2.name);
    // }
    // });

    /*
     * Collections.sort(students, (o1, o2) -> o1.name.equals(o2.name) ? o1.marks -
     * o2.marks : o1.name.compareTo(o2.name));
     * 
     */

    Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());

    students.forEach(System.out::println);
  }
}

class SortByNameThenMarks implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    return o1.name.equals(o2.name) ? o1.marks - o2.marks : o1.name.compareTo(o2.name);
  }

}