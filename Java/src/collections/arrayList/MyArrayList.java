
/**
 * MyArrayList
 */

import java.util.*;

public class MyArrayList {
  public static void main(String[] args) {
    // Without generics
    ArrayList fruits = new ArrayList();

    fruits.add(3);
    fruits.add("Hellow");

    System.out.println(fruits);

    // With generics
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(2);
    arr.add(3);

    System.out.println(arr);

    // More Flexiable Way
    List<Integer> list = new ArrayList<>();
    List<Integer> list2 = new LinkedList<>();

    Double d = 3.20;

    // Using a Custom generic Class Pair
    Pair<String, Integer> p1 = new Pair("a", 3);
    Pair<Boolean, String> p2 = new Pair(true, "Hello");
    Pair<Character, Boolean> p3 = new Pair('d', false);

    p1.getDescription();
    p2.getDescription();
    p3.getDescription();

    // Methods
    List<String> f = new LinkedList<>();
    f.add("Apple");
    f.add("Orange");

    System.out.println(f);

    List<String> vegi = new ArrayList<>();
    vegi.add("Tomato");
    vegi.add("Potato");
    vegi.add("Carret");

    f.addAll(vegi);

    System.out.println("after Add all: " + f);
    System.out.println("get by index: " + f.get(0));

    f.set(1, "Banana");
    System.out.println("get by index, after set: " + f.get(1));

    f.remove(1);
    System.out.println(f);

    System.out.println("size: " + f.size());

    System.out.println("contains: " + f.contains("Apple"));
    System.out.println("contains: " + f.contains("Pineapple"));

    System.out.println("is list empty: " + f.isEmpty());

    Object a[] = f.toArray(); // By default will return an array of object

    String temp[] = new String[f.size()];
    f.toArray(temp); // We can pass the array with the type we want to toArray()

    System.out.println();
    for (String s : temp) {
      System.out.println(s);
    }
    System.out.println();

    List<String> toRemove = new ArrayList<>();
    toRemove.add("Apple");
    toRemove.add("Tomato");

    f.removeAll(toRemove);
    System.out.println(f);

    f.clear();
    System.out.println(f);
  }
}