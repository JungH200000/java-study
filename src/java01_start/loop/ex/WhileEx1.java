package java01_start.loop.ex;

public class WhileEx1 {

  public static void main(String[] args) {

    int count = 1;
    while (count <= 10) {
      System.out.println(count);
      count++;
      // System.out.println(count++); // 후위 연산자 사용
    }
  }
}
