package model;

/**
 * This class stores information about a student
 */
public class Student {

    private long id;
    private int age;
    private String name;

    public Student(int age, String name) {
        this.id = Math.round(Math.random() * 1000);
        this.age = age;
        this.name = name;
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
}