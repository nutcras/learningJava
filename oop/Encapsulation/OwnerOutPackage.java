package oop.Encapsulation;

import oop.Encapsulation.AccessModifier.Mom;

public class OwnerOutPackage {
    public static void main(String[] args) {

        // printตัวแปร
        System.out.println(Mom.Pi_Public);
        // System.out.println(Mom.Pi_Protected);
        // System.out.println(Mom.Pi_Private);
        // System.out.println(Mom.Pi_default);

        // print method
        Mom.showTextPublic();
        // Mom.showTextStatic();
        // Mom.showTextProtected();
        // Mom.showTextPrivate();
    }
}
