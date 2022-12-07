package oop.Encapsulation.AccessModifier;

public class Mom {

  public static double Pi_Public = 3.14;
  protected static double Pi_Protected = 3.14;
  private static double Pi_Private = 3.14;
  static double Pi_default = 3.14;

  public static void showTextPublic() {
    System.out.println("-----------Test Extends showTextPublic----------");
  }

  protected static void showTextProtected() {
    System.out.println("-------------Test Extends Protected-----------");
  }

  private static void showTextPrivate() {
    System.out.println("--------------Test Extends Private------------");
  }

  static void showTextStatic() {
    System.out.println("--------------Test Extends default------------");
  }

  public static void main(String[] args) {
    // printตัวแปร
    System.out.println(Pi_Public);
    System.out.println(Pi_Protected);
    System.out.println(Pi_Private);
    System.out.println(Pi_default);

    // print method
    showTextPublic();
    showTextProtected();
    showTextPrivate();
    showTextStatic();
  }
}
