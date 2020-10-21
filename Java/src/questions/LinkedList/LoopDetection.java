package questions.linkedList;

public class LoopDetection {
  public static boolean hasLoop(LinkedList<Integer> l) {
    Node<Integer> slow = l.getHead(), fast = l.getHead();

    while (fast != null && fast.next != null) {
      if (slow == fast) return true;
      slow = slow.next;
      fast = fast.next.next;
    }

    return false;
  }

  public static Node<Integer> findBeginningOfLoop(LinkedList<Integer> l) {
    Node<Integer> slow = l.getHead();
    Node<Integer> fast = l.getHead();

    while (fast != null && fast.next != null) {
      if (slow == fast) break; // Collision

      slow = slow.next;
      fast = fast.next.next;
    }

    if (fast == null || fast.next == null) return null; // Check for no loop

    slow = l.getHead();
    while (slow != fast) {
      slow = slow.next;
      fast = fast.next;
    }

    return fast;
  }
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();

    System.out.println("Loop in list: " + hasLoop(list));
    System.out.println("Loop begins at: " + findBeginningOfLoop(list));
  }
  
}
