package java01_start.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (true) {
      System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
      String name = input.nextLine(); // 예시: 자바\n 입력

      if (name.equals("종료")) {
        System.out.println("프로그램을 종료합니다.");
        break;
      }

      System.out.print("나이를 입력하세요: ");
      int age = input.nextInt(); // 예시: 10\n 입력
      // `nextInt()`는 10만 가져가서 출력하고 버퍼에 `\n`이 남아있음
      // 다음 `input.nextLine()`에서 `\n`을 읽음 -> 빈 문자가 들어가게 됨 ("이름을 입력하세요 (종료를 입력하면 종료): 나이를 입력하세요: ")
      // -> 그래서 `input.nextInt()` 사용 후 `input.nextLine()`을 사용해서 `\n`을 버려주면 된다.
      input.nextLine();

      System.out.println("입력한 이름: " + name + ", 나이: " + age);
    }
  }
}
