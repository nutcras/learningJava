package oop.poly.first;

public class Main {
  public static void main(String[] args) {
    MoveTo human = new MoveTo();
    human.Move();

    MoveTo Toyota = new Cars();
    Toyota.Move();
    // ตรงนี้คือเรียกใช้ polymorphism
  }
}
