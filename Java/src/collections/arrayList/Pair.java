/**
 * Before Generics
 * 
 * 
  public class Pair {
    String x;
    int y;

    public Pair(String x, int y) {
      this.x = x;
      this.y = y;
    }
  }

 */

 /**
  *   Class with generics
  */
package collections.arrayList;

  public class Pair<X, Y> {
    X x;
    Y y;
    
    public Pair(X x, Y y) {
      this.x = x;
      this.y = y;
    }

    public void getDescription() {
      System.out.println(x + " and " + y);
    }
  }
