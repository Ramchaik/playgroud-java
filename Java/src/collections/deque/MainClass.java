
package collections.deque;

import java.util.ArrayDeque;

public class MainClass {
  public static void main(String[] args) {

    ArrayDeque<Integer> ad = new ArrayDeque<>();
    ad.addFirst(3);
    ad.addFirst(3324);

    ad.poll();
    System.out.println(ad.peek());
    
  }
}
