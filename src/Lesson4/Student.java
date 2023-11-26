package Lesson4;

public class Student {
    int studentID;
    String firstName;
    String lastName;
    int course;
    double gradeMathematics;
    double gradeEconomics;
    double gradeForeignLanguage;

    public Student(int studentID, String firstName, String lastName, int course, double gradeMathematics, double gradeEconomics, double gradeForeignLanguage) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.gradeMathematics = gradeMathematics;
        this.gradeEconomics = gradeEconomics;
        this.gradeForeignLanguage = gradeForeignLanguage;
    }

    void averageScore() {
        System.out.println((gradeMathematics + gradeEconomics + gradeForeignLanguage) / 3.0);
    }
}