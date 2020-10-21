package questions.linkedList;

import java.util.Scanner;

public class Intersection {
  public static LinkedList<Integer> inputList(LinkedList<Integer> list) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter -1 to End the list.");
    while (true) {
      int data = sc.nextInt();
      if (data == -1)
        break;

      list.add(data);
    }

    return list;
  }

  static class Result {
    Node<Integer> tail;
    int size;
    public Result(Node<Integer> node, int size) {
      this.tail = node;
      this.size = size;
    }
  }

  public static Result getTailAndSize(LinkedList<Integer> l) {
    Node<Integer> node = l.getHead();
    int size = 1;

    while (node.next != null) {
      size++;
      node = node.next;
    }

    return new Result(node, size);
  }

  public static Node<Integer> getKthNode(Node<Integer> head, int k) {
    Node<Integer> node = head;

    while (k > 0 && node != null) {
      node = node.next;
      k--;
    }

    return node;
  }

  public static Node<Integer> findIntersectionOfLists(LinkedList<Integer> l1, LinkedList<Integer> l2 ) {
    Result result1 = getTailAndSize(l1);
    Result result2 = getTailAndSize(l2);

    // Intersection not possible
    if (result1.tail != result2.tail) return null;

    Node<Integer> shorter = result1.size > result2.size ? l2.getHead() : l1.getHead();
    Node<Integer> longer = result1.size > result2.size ? l1.getHead() : l2.getHead();

    longer = getKthNode(longer, Math.abs(result1.size - result2.size));

    while (shorter != longer) {
      shorter = shorter.next;
      longer = longer.next;
    }

    return longer;
  }

  public static void main(String[] args) {
    LinkedList<Integer> list1 = new LinkedList<>();
    LinkedList<Integer> list2 = new LinkedList<>();

    list1 = inputList(list1);
    list2 = inputList(list2);

    Node<Integer> intersectingNode = findIntersectionOfLists(list1, list2);
    System.out.println("Node is: " + intersectingNode.data + " address: " + intersectingNode);
  }
}
