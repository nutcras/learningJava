package oop.Encapsulation.AccessModifier;

public class Child extends Mom {
    public static void main(String[] args) {

        // printตัวแปร
        System.out.println(Pi_Public);
        System.out.println(Pi_Protected);
        // System.out.println(Pi_Private);
        System.out.println(Pi_default);

        // print method
        showTextPublic();
        showTextProtected();
        // showTextPrivate();
        showTextStatic();

    }
}
