package java01_start.method;

public class MethodReturn1 {

  public static void main(String[] args) {
    boolean result = odd(111);
    System.out.println(result);
  }

  public static boolean odd(int i) {
    if (i % 2 == 1) {
      // 홀수
      return true;
    } else {
      // 짝수
      return false;
    }
      
  }
}
