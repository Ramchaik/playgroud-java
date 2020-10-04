package abstraction;

public abstract class Car {
  public abstract void accelerate();

  public abstract void breaking();

  // Concreate method
  public void honk() {
    System.out.println("Car is honking");
  }
  
}
