package java02_basic.ref;

public class Method1 {

  public static void main(String[] args) {
    Student student1 = new Student();
    initStudent(student1, "학생1", 17, 85);

    Student student2 = new Student();
    initStudent(student2, "학생2", 18, 78);

    printStudent(student1);
    printStudent(student2);
  }

  static void initStudent(Student student, String name, int age, int grade) {
    student.name = name;
    student.age = age;
    student.grade = grade;
  }

  static void printStudent(Student student) {
    System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
  }
}
