package java01_start.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (true) {
      System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
      String name = input.nextLine();
      if (name.equals("종료")) {
        System.out.println("프로그램을 종료합니다.");
        break;
      }

      System.out.print("나이를 입력하세요: ");
      int age = input.nextInt();
      // 만약 10을 입력한다면 `10\n`이 저장됨 -> 출력은 10만하고 버퍼에 `\n`이 남아있음
      // -> 나중에 `nextLine()`을 사용한다면 "이름을 입력하세요 (종료를 입력하면 종료): 나이를 입력하세요:" 이런 형태가 되어버림
      // -> 그래서 nextInt() 사용 후 nextLine()을 사용해야 한다면 nextInt 사용 후 `input.nextLine()`을 입력해두자.
      input.nextLine();

      System.out.println("입력한 이름: " + name + ", 나이: " + age);
    }
  }
}
