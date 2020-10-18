package LinkedList;

import java.util.Scanner;

public class SumLists {
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

  private static LinkedList<Integer> sumOfList(Node<Integer> l1, Node<Integer> l2) {
    LinkedList<Integer> fList = new LinkedList<>();
    int carry = 0;

    while (l1 != null && l2 != null) {
      int data = (l1.data + l2.data + carry);
      carry = data / 10;

      fList.add(data % 10);

      l1 = l1.next;
      l2 = l2.next;
    }

    if (l2 != null) {
      while (l2 != null) {
        int data = (l2.data + carry);
        carry = data / 10;

        fList.add(data % 10);
        l2 = l2.next;
      }
    } else {
      while (l1 != null) {
        int data = (l1.data + carry);
        carry = data / 10;
        
        fList.add(data % 10);
        l1 = l1.next;
      }
    }

    if (carry == 1) {
      fList.add(1);
    }

    return fList;
  }

  static void addLists(Node<Integer> l1, Node<Integer> l2, int carry, LinkedList<Integer> list) {
    if (l1 == null && l2 == null && carry == 0) return;

    int data = carry;

    if (l1 != null) data += l1.data;
    if (l2 != null) data += l2.data;


    if (l1 != null || l2 != null) {
      addLists(l1 == null ? null : l1.next, l2 == null ? null : l2.next, data >= 10 ? 1 : 0, list);
      list.add(data % 10);
    }
  }

  public static void main(String[] args) {
    LinkedList<Integer> list1 = new LinkedList<>();
    LinkedList<Integer> list2 = new LinkedList<>();

    list1 = inputList(list1);
    list2 = inputList(list2);

    LinkedList<Integer> finalList = sumOfList(list1.getHead(), list2.getHead());

    finalList.print();

    System.out.println("\n *** For non reversed list *** \n");
    LinkedList<Integer> revSumList = sumOfList(list1.reverseList().getHead(), list2.reverseList().getHead()).reverseList();

    revSumList.print();

    System.out.println();

    System.out.println("------------------------");

    list1.reverseList().print(); 
    list2.reverseList().print(); 
    System.out.println("------------------------");

    LinkedList<Integer> l = new LinkedList<>();
    addLists(list1.getHead(), list2.getHead(), 0, l);
    l.print();

    revAddList(list1, list2);
  }

  static LinkedList<Integer> padList(LinkedList<Integer> l, int padding) {
    for (int i = 0; i < padding; ++i) {
      l.addToHead(0);
    }
    
    return l;
  }

  static void revAddList(LinkedList<Integer> l1, LinkedList<Integer> l2) {
    int len1 = l1.length(); 
    int len2 = l2.length(); 

    if (len1 < len2) {
      l1 = padList(l1, len2 - len1);
    } else {
      l2 = padList(l2, len1 - len2);
    }

    PartialSum result = revAddListHelper(l1.getHead(), l2.getHead());

    result.list.print();
  }

  static PartialSum revAddListHelper(Node<Integer> l1, Node<Integer> l2) {
    if (l1 == null && l2 == null) {
      PartialSum sum = new PartialSum();
      sum.list = new LinkedList<Integer>();
      return sum;
    }

    PartialSum sum = revAddListHelper(l1.next, l2.next);
    int val = sum.carry + l1.data + l2.data;

    sum.list.addToHead(val % 10);
    sum.carry = val / 10;

    return sum;
  }

  static class PartialSum {
    public LinkedList<Integer> list = null;
    public int carry = 0;
  }
}
