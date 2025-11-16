package java01_start.method.ex;

public class MethodEx1Ref {

  public static void main(String[] args) {
    System.out.println("평균값: " + average(1, 2, 3));
    System.out.println("평균값: " + average(15, 25, 35));
  }

  // 평균값 계산
  public static double average(int a, int b, int c) {
    int sum = a + b + c;
    return sum / 3.0;
  }
}
