package java01_start.method.ex;

public class MethodEx2Ref {

  public static void main(String[] args) {
    printMessage("Hello, world!", 3);
    System.out.println("====================");
    printMessage("Java", 5);
    System.out.println("====================");
    printMessage("JJ", 7);
  }

  public static void printMessage(String message, int times) {
    for (int i = 0; i < times; i++) {
      System.out.println(message);
    }
  }
}
