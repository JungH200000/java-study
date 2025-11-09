package java01_start.scanner;

import java.util.Scanner;

public class ScannerWhile3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;

    while (true) {
      System.out.print("정수를 입력하세요 (단, 0을 입력하면 종료): ");
      int number = scanner.nextInt();

      if (number == 0) {
        System.out.println("프로그램이 종료됩니다.");
        break;
      }

      sum = sum + number;
    }
    System.out.println("입력한 모든 정수의 합: " + sum);
  }
}
