package hashCodeAndEquals;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
  public static void main(String[] args) {
    Pen pen1 = new Pen(10, "red");
    Pen pen2 = new Pen(10, "red");

    System.out.println(pen1.equals(pen2));

    Set<Pen> setOfPens = new HashSet<>();

    setOfPens.add(pen1);
    setOfPens.add(pen2);

    System.out.println(setOfPens);
  }

}

class Pen {
  int price;
  String color;

  public Pen(int price, String color) {
    this.price = price;
    this.color = color;
  }
  /**
   * 
   * NOTE: 
   *  contract: if two objects are equal, then there hashCode must be same, vice-versa is not true as it can be a case of collision.
   */

  @Override
  public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    Pen other = (Pen) obj;
    boolean isEqual = this.price == other.price && this.color.equals(other.color);

    return isEqual;
  }

  @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    return price + color.hashCode();
  }

}
