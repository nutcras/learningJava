package oop.Inheritance.first;

//ตรงนี้คือ Inheritance ตรง extends
public class SuperCars extends Cars {
  public String highSpeed;
  public String hp;

  public void setSuperspeed(String highSpeed, String hp) {
    this.highSpeed = highSpeed;
    this.hp = highSpeed;
  }

  // public void setCars(String brand, String model, String colors, double price)
  // {
  // this.model = model;
  // this.colors = colors;
  // this.price = price;
  // this.brand = brand;
  // }

}
