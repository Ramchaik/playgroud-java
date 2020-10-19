package collections.queue;

import java.util.Queue;
import java.util.LinkedList;


public class MainClass {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

    q.add(3);
    q.add(33);
    q.add(553);

    System.out.println(q);
    System.out.println(q.remove());
    System.out.println(q.remove());

    MyQueue<Integer> mq = new MyQueue<>();

    mq.enqueue(3);
    mq.enqueue(33);
    mq.enqueue(333);

    System.out.println(mq.dequeue());
    System.out.println(mq.dequeue());
    System.out.println(mq.dequeue());
    mq.enqueue(324);
    System.out.println(mq.dequeue());
  }
}
