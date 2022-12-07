package oop.Polymorphism.first;

public class Cars extends MoveMent {
  @Override
  public void Move() {
    System.out.println("ไปหน้าหลังได้");
    super.Move();
    // ติดตรงนี้
  }

  public void start() {
    System.out.println("บรื้นๆๆ");
  }
}
