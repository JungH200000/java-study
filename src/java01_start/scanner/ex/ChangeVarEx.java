package java01_start.scanner.ex;

public class ChangeVarEx {

  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int temp;

    temp = a; // 10
    a = b; // 20
    b = temp; // 10

    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}
