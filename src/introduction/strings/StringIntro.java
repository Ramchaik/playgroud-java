package strings;

public class StringIntro {
  public static void main(String[] args) {
    // literal syntax , Stored only in String pool
    String name = "Vaibhav";
    String name2 = "Vaibhav";

    // new syntax , Stored in heap as well as in String pool if not present
    String myName = new String("Vaibhav");

    System.out.println(name);
    System.out.println(myName);

    System.out.println();

    System.out.println(name == myName);
    System.out.println(name == name2);

    System.out.println();

    System.out.println(name.charAt(3));
    System.out.println(name.length());

    System.out.println();

    System.out.println(name.substring(4));
    System.out.println(name.substring(1, 4));

    System.out.println();

    System.out.println(name.contains("a"));
    System.out.println(name.contains("bhav"));

    System.out.println();

    System.out.println(name == myName); // checks reference
    System.out.println(name.equals(myName)); // checks value

    System.out.println();

    String a = "";
    System.out.println(name.isEmpty());
    System.out.println(a.isEmpty());

    System.out.println();

    // Concat
    String s1 = "Hellow";
    s1 = s1 + " World"; // overloading '+'

    System.out.println();

    System.out.println(s1);
    System.out.println(s1.concat(" RAJU!")); // using concat method

    System.out.println();

    // Replace
    System.out.println(s1.replace("He", "EH"));
    System.out.println(s1.replace('l', 'D'));

    System.out.println();

    // Split
    String cars = "car1, Car3, car5, Car7";
    String[] allCars = cars.split(",");

    for (String car : allCars)
      System.out.print(car);

    System.out.println();
    System.out.println();

    // Index Of
    System.out.println(cars.indexOf("3"));

    System.out.println();

    // Change string to lower case
    System.out.println(cars.toLowerCase());

    System.out.println();

    // Change string to upper case
    System.out.println(cars.toUpperCase());

    System.out.println();

    // Trim out trailing spaces from string
    String n1 = "   Vaibhav ";
    System.out.println(n1);
    System.out.println(n1.trim());
  }

}
