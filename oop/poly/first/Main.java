package oop.poly.first;

public class Main {
  public static void main(String[] args) {
    MoveTo human = new MoveTo();
    human.Move();
    System.out.println("**************");

    MoveTo Toyota = new Cars();
    Toyota.Move();
    // Toyota.start();
    // ตรงนี้คือเรียกใช้ polymorphism

    System.out.println("**************");
    Cars Benz = new Cars();
    Benz.Move();
    Benz.start();
  }
}
