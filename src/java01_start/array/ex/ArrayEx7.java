package java01_start.array.ex;

import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subjects = new String[]{"국어", "영어", "수학"};

        // 학생별 점수 입력
        for (int row = 0; row < scores.length; row++) {
            System.out.println((row + 1) + "번 학생의 성적을 입력하세요: ");

            for (int column = 0; column < scores[row].length; column++) {
                System.out.print(subjects[column] + " 점수: ");
                scores[row][column] = input.nextInt();
            }
        }

        // 학생별 총점 및 평균 계산
        for (int row = 0; row < scores.length; row++) {
            int totalScore = 0;
            for (int column = 0; column < scores[row].length; column++) {
                totalScore += scores[row][column];
            }
            double average = (double) totalScore / scores[row].length;

            System.out.println((row + 1) + "번 학생의 총점: " + totalScore + ", 평균: " + average);
        }
    }
}
