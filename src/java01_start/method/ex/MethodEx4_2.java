package java01_start.method.ex;

import java.util.Scanner;

public class MethodEx4_2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int balance = 0;

    while (true) {
      System.out.println("-----------------------------------");
      System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
      System.out.println("-----------------------------------");

      System.out.print("선택: ");
      int menu = input.nextInt();

      switch (menu) {
        case 1:
          // 입금
          System.out.print("입금액을 입력하세요: ");
          int depositAmount = input.nextInt();

          balance = deposit(balance, depositAmount);
          break;
        case 2:
          // 출금
          // 출금
          System.out.print("출금액을 입력하세요: ");
          int withdrawAmount = input.nextInt();

          balance = withdraw(balance, withdrawAmount);
          break;
        case 3:
          System.out.println("잔액 확인: " + balance + "원");
          break; // break는 switch문과 반복문을 종료시킴
        case 4:
          System.out.println("시스템을 종료합니다.");
          return;
        default:
          System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
          break;
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
    if (balance > withdrawAmount) {
      balance -= withdrawAmount;
      System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
    } else {
      System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
    }

    return balance;
  }
}
