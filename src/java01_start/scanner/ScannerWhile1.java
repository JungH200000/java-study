package java01_start.scanner;

import java.util.Scanner;

public class ScannerWhile1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("문자열을 입력하세요(단, exit면 종료): ");
      String str = scanner.nextLine();

      if (str.equals("exit")) {
        System.out.println("프로그램을 종료합나다.");
        break;
      }
      System.out.println("입력한 문자열: " + str);
    }
  }
}
