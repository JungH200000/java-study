package java01_start.casting;

public class Casting2 {

  public static void main(String[] args) {
    double doubleValue = 1.5;
    int intValue = 0;

    //intValue = doubleValue; // 컴파일 오류 발생

    // 소수점이 없어져도 괜찮다면
    // => 명시적 형변환
    intValue = (int) doubleValue;
    System.out.println("intValue = " + intValue);
    System.out.println("doubleValue = " + doubleValue);

    System.out.println((int) 10.5);
    System.out.println((double) 10);
  }
}
