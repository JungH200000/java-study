package java02_basic.class1;

public class ClassStart3 {

  public static void main(String[] args) {
    Student student1;
    student1 = new Student(); // 저장할 메모리 공간 만듦
    student1.name = "청아";
    student1.age = 35;
    student1.grade = 99;

    Student student2 = new Student(); // 저장할 메모리 공간 만듦
    student2.name = "지원";
    student2.age = 39;
    student2.grade = 91;

    System.out.println(student1);
    System.out.println(student2);

    System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
    System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
  }
}
