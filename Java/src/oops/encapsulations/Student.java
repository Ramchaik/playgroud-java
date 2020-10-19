package oops.encapsulations;

public class Student {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age > 20)
      System.out.println("YOU are to old to be a student in current school");

    else
      this.age = age;
  }

}
