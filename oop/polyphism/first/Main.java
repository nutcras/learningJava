package oop.polyphism.first;

public class Main {
  public static void main(String[] args) {
    MoveTo human = new MoveTo();
    human.Move();
    System.out.println("**************");

    MoveTo toyota = new Cars();
    toyota.Move();
    // Toyota.start();
    // ตรงนี้คือเรียกใช้ polymorphism

    System.out.println("**************");
    Cars benz = new Cars();
    benz.Move();
    benz.start();
  }
}
