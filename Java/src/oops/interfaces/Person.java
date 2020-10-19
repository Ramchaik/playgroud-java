package oops.interfaces;

public class Person implements Student, Youtuber {

  @Override
  public void study() {
    // TODO Auto-generated method stub
    System.out.println("Person is studing");

  }

  @Override
  public void makeVideos() {
    // TODO Auto-generated method stub
    System.out.println("Person is making a video");
  }

  @Override
  public void editVideo() {
    // TODO Auto-generated method stub

  }

  public static void main(String[] args) {
    Person p = new Person();

    p.study();
    p.makeVideos();

    // Can't instantiate the interface

  }
}
