import java.util.Scanner;

public class Grade {
    private static void calculator(Scanner scObj) {
        int score = scObj.nextInt();
        System.out.println("Grade  :");
        if (score < 50) {
            System.out.println("E");
        } else if (score < 55) {
            System.out.println("D");
        } else if (score < 60) {
            System.out.println("D+");
        } else if (score < 65) {
            System.out.println("C");
        } else if (score < 70) {
            System.out.println("C+");
        } else if (score < 75) {
            System.out.println("B");
        } else if (score < 80) {
            System.out.println("B+");
        } else {
            System.out.println("A");
        }
    }

    private static void showText() {
        System.out.println("*************\nโปรแกรมคำนวณเกรด\n*****************");
    }

    public static void main(String[] args) {
        Scanner ScObj = new Scanner(System.in);
        showText();
        calculator(ScObj);
    }

}
