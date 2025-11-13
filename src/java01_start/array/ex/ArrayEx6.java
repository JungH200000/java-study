package java01_start.array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("입력 받을 숫자의 개수를 입력하세요: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        System.out.println(n + "개의 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];
        
        // 향상된 for문
/*
        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
            if (min > number) {
                min = number;
            }
        }
*/
        // 일반 for문
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
