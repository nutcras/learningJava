import java.util.Scanner;

public class Calculator {
  private static void showText() {
    System.out.println("********************************");
    System.out.println("-----------โปรแกรมคิดเลข----------");
    System.out.println("*******************************");
  }

  private static int inputMeter(int i, Scanner scObj) {
    System.out.print("จำนวนตัวที่ " + (i + 1) + ": ");
    int meterElc = scObj.nextInt();
    return meterElc;
  }

  private static char chooseCalculate(Scanner scObj) {
    System.out.print("โปรดเลือกสิ่งที่ต้องการ \n 1. +\n 2. -\n 3. *\n 4. / \n:");
    char type;
    do {
      type = scObj.next().charAt(0);
    } while (type != '1' && type != '2' && type != '3' && type != '4');
    return type;
  }

  private static void showOutPut(int[] meterElc, char typeCal) {
    int total = 0;
    switch (typeCal) {
      case '1':
        total = meterElc[0] + meterElc[1];
        break;
      case '2':
        total = meterElc[0] - meterElc[1];
        break;
      case '3':
        total = meterElc[0] * meterElc[1];
        break;
      case '4':
        total = meterElc[0] / meterElc[1];
        break;
    }
    System.out.println(" = " + total);
  }

  public static void main(String[] args) {
    Scanner ScObj = new Scanner(System.in);
    int i = 0;
    int[] meterElc;
    char typeCal;
    meterElc = new int[2];

    showText();
    typeCal = chooseCalculate(ScObj);

    while (i < meterElc.length) {
      meterElc[i] = inputMeter(i, ScObj);
      i++;
    }
    showOutPut(meterElc, typeCal);
  }

}