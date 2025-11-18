package java02_basic.class1;

public class ClassStart4 {

  public static void main(String[] args) {
    Student student1 = new Student(); // 저장할 메모리 공간 만듦
    student1.name = "청아";
    student1.age = 35;
    student1.grade = 99;

    Student student2 = new Student(); // 저장할 메모리 공간 만듦
    student2.name = "지원";
    student2.age = 39;
    student2.grade = 91;

    Student[] students = new Student[2];
    students[0] = student1;
    students[1] = student2;


    System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
    System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);
  }
}
