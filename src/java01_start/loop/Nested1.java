package java01_start.loop;

public class Nested1 {

  public static void main(String[] args) {
    for (int i = 0; i < 2; i++) {
      System.out.println("외부 for문 시작 i: " + i);

      for (int j = 0; j < 3; j++) {
        System.out.println("-> 내부 for문 " + i + "-" + j);
      }
      System.out.println("외부 for문 종료 i: " + i);
      System.out.println();
    }
  }
}
