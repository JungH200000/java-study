package java02_basic.class1;

public class ClassStart2 {

  public static void main(String[] args) {
    String[] studentNames = new String[]{"학생1", "학생2", "학생3", "학생4"};
    int[] studentAges = new int[]{15, 16, 17, 20};
    int[] studentGrades = new int[]{90, 80, 100, 88};

    for (int i = 0; i < studentNames.length; i++) {
      System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrades[i]);
    }
  }
}
