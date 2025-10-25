package java01_start.cond.ex;

public class EvenOddEx {

  public static void main(String[] args) {
    int x = 143;
    String result = (x % 2 == 0) ? "짝수" : "홀수";

    System.out.println("x = " + x + ", " + result);
  }
}
