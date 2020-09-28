package introToPackages;

class Singleton {
  private static Singleton singleton_instance = null;
  public String s;

  private Singleton() {
    s = " I am a singleton. ";
  }

  public static Singleton Singleton() {
    if (singleton_instance == null)
      singleton_instance = new Singleton();

    return singleton_instance;
  }

}

public class SingletonClass {
  public static void main(String[] args) {
    Singleton obj = Singleton.Singleton();
    Singleton obj2 = Singleton.Singleton();
    Singleton obj3 = Singleton.Singleton();

    System.out.println(obj.s);
    System.out.println(obj2.s);
    System.out.println(obj3.s);

    obj.s += " : Mutated! ";

    System.out.println(obj.s);
    System.out.println(obj2.s);
    System.out.println(obj3.s);

  }

}
