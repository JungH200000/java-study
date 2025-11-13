package java01_start.array;

public class Array1Ref4 {

    public static void main(String[] args) {
        int[] students = new int[]{90, 80, 70, 60, 50}; // 배열 생성과 초기화
//         int[] students2 = {10, 20, 30, 40, 50};
//        아래 코드 오류 발생
//        int[] students3;
//        students3 = {1, 2, 3, 4, 5};
        
        System.out.println("students.length: " + students.length);
        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "의 점수: " + students[i]);
        }
    }
}
