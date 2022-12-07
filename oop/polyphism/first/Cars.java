package oop.polyphism.first;

public class Cars extends MoveTo {
  // อันนี้คือ polymorphism
  public void Move() {
    System.out.println("ไปหน้าหลังได้");
  }

  public void start() {
    System.out.println("บรื้นๆๆ");
  }
}
