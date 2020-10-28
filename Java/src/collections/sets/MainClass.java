package collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {
  public static void main(String[] args) {
    Set<String> fruits = new HashSet<>();// unordered - faster
    Set<String> fruits2 = new TreeSet<>(); // ordered - with BST - sorted by value - slower
    Set<String> fruits3 = new LinkedHashSet<>(); // orderted - Linked list - sorted by sequence - slower

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    fruits.add("Apple");

    fruits2.add("Apple");
    fruits2.add("Banana");
    fruits2.add("Orange");
    fruits2.add("Apple");

    fruits3.add("Apple");
    fruits3.add("Banana");
    fruits3.add("Orange");
    fruits3.add("Apple");

    System.out.println(fruits);
  }
  
}
