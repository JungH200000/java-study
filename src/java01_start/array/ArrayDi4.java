package java01_start.array;

public class ArrayDi4 {

    public static void main(String[] args) {
        // 2x3의 2차원 배열
        int[][] arr = new int[4][7];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); // 한 행이 끝나면 라인 변경
        }
    }
}
