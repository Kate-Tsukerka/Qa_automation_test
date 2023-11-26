package Lesson4;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Kate", "Show", 4, 80, 75, 85);
        Student student2 = new Student(2, "Ann", "Truman", 1, 65, 85, 70);
        Student student3 = new Student(3, "Elon", "Musk", 5, 2, 3, 50);
        student1.averageScore();
        student2.averageScore();
        student3.averageScore();
    }
}

