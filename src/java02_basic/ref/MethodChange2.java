package java02_basic.ref;

public class MethodChange2 {

  public static void main(String[] args) {
    Data dataA = new Data();
    dataA.value = 10;
    System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // 10
    System.out.println("dataA = " + dataA);
    changeReference(dataA); // Data dataX = dataA
    System.out.println("메서드 호출 후: dataA.value = " + dataA.value); // 20
  }

  static void changeReference(Data dataX) {
    dataX.value = 20;
    System.out.println("dataX = " + dataX);
  }
}
