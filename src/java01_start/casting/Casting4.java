package java01_start.casting;

public class Casting4 {

    public static void main(String[] args) {
        int div1 = 3 / 2; // 1.5 (x) => 1 (o)
        System.out.println("div1 = " + div1);

        double div2 = 3 / 2; // 1.5 (x) => 1.0 (o)
        System.out.println("div2 = " + div2);

        double div3 = 3.0 / 2; // 1.5 (o)
        System.out.println("div3 = " + div3);

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4);

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result); // 1.5
    }
}
