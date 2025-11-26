package java02_basic.ref.ex;

public class ProductOrderMain {

  public static void main(String[] args) {
    ProductOrder order1 = new ProductOrder();
    order1.productName = "두부";
    order1.price = 2000;
    order1.quantity = 2;
    
    ProductOrder order2 = new ProductOrder();
    order2.productName = "김치";
    order2.price = 5000;
    order2.quantity = 1;
    
    ProductOrder order3 = new ProductOrder();
    order3.productName = "콜라";
    order3.price = 1500;
    order3.quantity = 2;

    ProductOrder[] orders = new ProductOrder[]{order1, order2, order3};

    int totalCost = 0;
    for (ProductOrder order : orders) {
      System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
      totalCost += (order.price * order.quantity);
    }

    System.out.println("총 결제 금액: " + totalCost);
  }
}
