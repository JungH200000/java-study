package java01_start.method.ex;

import java.util.Scanner;

public class MethodEx4_1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int balance = 0;

    while (true) {
      System.out.println("-----------------------------------");
      System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
      System.out.println("-----------------------------------");

      System.out.print("선택: ");
      int menu = input.nextInt();

      if (menu == 1) {
        // 입금
        System.out.print("입금액을 입력하세요: ");
        int depositAmount = input.nextInt();

        balance = deposit(balance, depositAmount);
      } else if (menu == 2) {
        // 출금
        System.out.print("출금액을 입력하세요: ");
        int withdrawAmount = input.nextInt();

        if (balance < withdrawAmount) {
          System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
          continue;
        }

        balance = withdraw(balance, withdrawAmount);
      } else if (menu == 3) {
        System.out.println("현재 잔액: " + balance);
      } else if (menu == 4) {
        System.out.println("시스템을 종료합니다.");
        break;
      } else {
        System.out.println("정상적인 입력이 아닙니다.");
      }
    }
  }

  // 예금
  public static int deposit(int balance, int depositAmount) {
    balance += depositAmount;
    System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance);

    return balance;
  }

  // 출금
  public static int withdraw(int balance, int withdrawAmount) {
    balance -= withdrawAmount;
    System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance);

    return balance;
  }
}
