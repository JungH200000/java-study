package java01_start.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int i = 0;
    int sum = 0;
    double average = 0;
    System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
    while (true) {
      int number = input.nextInt();
      if (number == -1) {
        average = (double) sum / i;
        System.out.println("입력한 숫자들의 합계 : " + sum + " 입력한 숫자들의 평균: " + average);
        break;
      }

      sum = sum + number; // 합계 계산
      i++;
    }
  }
}
