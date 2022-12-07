package oop.Inheritance.first;

public class Main {
  private static void showText(Cars car) {
    System.out.println("รถ-----------------------");
    System.out.print(car.brand + " ");
    System.out.print(car.model + " ");
    System.out.print(car.colors + " ");
    System.out.println(car.price + " ");
  }

  public static void main(String[] args) {
    Cars No1 = new Cars();
    showText(No1);

    No1.setCars("Toyota", "supra", "blue", 3000000);
    showText(No1);

    SuperCars No2 = new SuperCars();
    No2.setCars("BMW", "G80", "white", 500000);
    No2.setSuperspeed("500", "300");

    showText(No2);
    System.out.println("แรงม้า : " + No2.hp + " ความเร็วสูงสุด : " + No2.highSpeed);
  }
}
