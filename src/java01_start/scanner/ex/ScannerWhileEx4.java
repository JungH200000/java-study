package java01_start.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

  public static void main(String[] args) {
    // 사용자 상품명, 가격, 수량 입력 -> 총 가격 출력
    // 여러 상품 추가 가능하지만 언제든지 종료 가능해야함
    // 세 가지 옵션 제공 1. 상품 입력, 2. 결제, 3. 프로그램 종료 => 옵션 저장하는 변수 `option`
    // 옵션은 정수 입력
    Scanner input = new Scanner(System.in);

    int totalCost = 0;

    while (true) {
      System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
      int option = input.nextInt();
      input.nextLine();

      // 1: 상품 입력
      if (option == 1) {
        System.out.print("상품명을 입력하세요: ");
        String name = input.nextLine();

        System.out.print("상품의 가격을 입력하세요: ");
        int price = input.nextInt();

        System.out.print("구매 수량을 입력하세요: ");
        int quantity = input.nextInt();

        totalCost += (price * quantity);
        System.out.println("상품명: " + name + " 가격: " + price + " 수량: " + quantity + " 합계: " + (price * quantity));
      } else if (option == 2) {
        // 2: 결제
        System.out.println("총 비용: " + totalCost);
        totalCost = 0;
      } else if (option == 3) {
        // 3: 프로그램 종료
        System.out.println("프로그램을 종료합니다.");
        break;
      } else {
        System.out.println("올바른 옵션을 선택해주세요.");
      }
    }
  }
}
