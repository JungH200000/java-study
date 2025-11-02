package java01_start.loop.ex;

public class ForEx3 {

  public static void main(String[] args) {
    int max = 100;

    int sum = 0;
    for (int i = 1; i <= max; i++) {
      sum = sum + i;
    }
    System.out.println(sum);
  }
}
