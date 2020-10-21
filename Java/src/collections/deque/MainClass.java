
package collections.deque;

import java.util.ArrayDeque;

public class MainClass {
  public static void main(String[] args) {

    ArrayDeque<Integer> ad = new ArrayDeque<>();
    // Queue
    ad.addFirst(3);
    ad.addFirst(3324);

    ad.poll();
    System.out.println(ad.peek());
    ad.poll();

    // Stack

    ad.push(1);
    ad.push(41);
    System.out.println(ad.pop());
    System.out.println(ad.pop());
    
  }
}
