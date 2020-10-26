package collections.priorityQueue;

import java.util.PriorityQueue;

public class MainClass {
  public static void main(String[] args) {
    PriorityQueue<String> strPQ = new PriorityQueue<>();

    strPQ.add("Hello");
    strPQ.add("World");
    strPQ.add("Apple");
    strPQ.add("Orange");
    strPQ.add("Jack Fruit");

    System.out.println("queue: " +  strPQ);
    System.out.println(strPQ.remove());
    System.out.println(strPQ.remove());
    System.out.println(strPQ.remove());
    System.out.println(strPQ.remove());
    System.out.println("head of queue: " + strPQ.element());

    PriorityQueue<Integer> intPQ = new PriorityQueue<>();

    intPQ.add(3);
    intPQ.add(13);
    intPQ.add(31);
    intPQ.add(323);
    intPQ.add(1033);

    System.out.println("int PQ: " + intPQ);
    System.out.println(intPQ.remove());
    System.out.println(intPQ.remove());
    System.out.println(intPQ.remove());
    System.out.println(intPQ.remove());
  }
}
