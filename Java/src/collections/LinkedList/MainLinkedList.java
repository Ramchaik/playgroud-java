import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {
  public static void main(String[] args) {
    List<Integer> ll = new LinkedList<>();
    List<Integer> al = new ArrayList<>();

    MyLinkedList<Integer> list = new MyLinkedList();
    list.add(2);
    list.add(3);
    list.add(7);

    list.print();


    // getTimeDiff(al);
    // getTimeDiff(ll);
  }

  static void getTimeDiff(List<Integer> l) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < 100000; i++) {
      l.add(0, i);
    }

    long end = System.currentTimeMillis();
    System.out.println(l.getClass().getName() + " --> " + (end - start));
  }
  
}
