package Lesson5;

public class Student {
    private String name;
    private int course;
    private double grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        }
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        }
    }

    public void showInfo() {
        System.out.println(this.getName() + " " + this.getCourse() + " " + this.getGrade());
    }

}


