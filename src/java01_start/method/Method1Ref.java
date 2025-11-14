package java01_start.method;

public class Method1Ref {

  public static void main(String[] args) {
    // 계산1
    int sum1 = add(5, 10);
    System.out.println("결과1 출력: " + sum1);

    // 계산2
    int sum2 = add(15, 20);
    System.out.println("결과2 출력: " + sum2);
  }

  // add method 생성
  public static int add(int a, int b) {
    System.out.println(a + " + " + b + " 연산 수행 시작!!");
    int sum = a + b;
    return sum;
  }
}
