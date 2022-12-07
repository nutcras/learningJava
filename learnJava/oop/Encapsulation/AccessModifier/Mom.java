package oop.Encapsulation.AccessModifier;

public class Mom {

  public static double Pi_Public = 3.14;
  protected static double Pi_Protected = 3.14;
  private static double Pi_Private = 3.14;

  public static void showTextPublic() {
    System.out.println("-----------Test Extends showTextPublic----------");
  }

  protected static void showTextProtected() {
    System.out.println("-------------Test Extends Protected-----------");
  }

  private static void showTextPrivate() {
    System.out.println("--------------Test Extends Private------------");
  }

  public static void main(String[] args) {
    // printตัวแปร
    System.out.println(Pi_Public);
    System.out.println(Pi_Protected);
    System.out.println(Pi_Private);

    // print method
    showTextPublic();
    showTextProtected();
    showTextPrivate();
  }
}
