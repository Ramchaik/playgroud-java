package exceptionHandling;

public class MainClass {
  public static void main(String[] args) {
    try {
      int[] arr = new int[3];
      System.out.println(arr[5]);

      int a = 9;
      int b = 0;

      int c = a / b;

      System.out.println("c: " + c);
    } catch (ArithmeticException e) {
      // TODO: handle exception
      System.out.println(e.getMessage() + " occured, please check your code.");
    } catch (ArrayIndexOutOfBoundsException e) {

      System.out.println(e.getMessage() + " occured, index should lie between 0 and size of array.");
    } catch (IllegalAccessError e) {

      System.out.println(e.getMessage() + " occured, please check your casting carefully.");
    } finally {
      System.out.println("Sorry for the inconvenience.");
    }

    System.out.println("Very Important Code.");
    func1();
  }

  static void func1() {
    // int a = 9;
    // int b = 0;

    // int c = a / b;

    // System.out.println("c: " + c);

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }

    try {
      func2();
    } catch (ArrayIndexOutOfBoundsException e) {
      //TODO: handle exception
      System.out.println(e.getMessage() + " occured");
    }
  }

  static void func2() throws ArrayIndexOutOfBoundsException {
    boolean isDanger = true;
    if (isDanger) {
      throw new ArrayIndexOutOfBoundsException("Danger was coming");
    }
  }
}
