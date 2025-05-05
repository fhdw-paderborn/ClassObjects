package model;

/**
 * This class stores information about a student
 */
public class Student {

    private static int zaehler = 1000;
    
    private int id;
    private int age;
    private String name;

    public Student() {
        this(0, "noname");
    }

    public Student(Student andererStudend) {
        this(andererStudend.age, andererStudend.name);
    }

    public Student(int age, String name) {
        this.id = Student.zaehler;
        this.age = age;
        this.name = name;
        Student.zaehler++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info() {
        System.out.printf("Student: %s (ID: %d, Alter: %d)\n", name, id, age);
    }

    public void info(boolean test) {
        System.out.println(test);
    }

    public boolean equals(Student andererStudend) {
        return this.id != andererStudend.id;
    }
}