package by.it.yurtsevich.videoCourse.lesson11;

public class Student {
    public String name;
    public int course;
    public double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Petr", 1, 5.3);
    }
}
