package collections.vectorAndStacks;

import collections.linkedList.MyLinkedList;
public class MyStack<T> {
  private MyLinkedList<T> list = new MyLinkedList<>();

  void push(T data) {
    list.add(data);
  }

  T pop() throws Exception {
    if (list.isEmpty()) {
      throw new Exception("Popping from empty stack");
    }

    return list.removeLast();
  }

  T peek() throws Exception {
    if (list.isEmpty()) {
      throw new Exception("Popping from empty stack");
    }

    return list.getLast();
  }
  
}
