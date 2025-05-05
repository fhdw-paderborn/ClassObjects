import model.Student;

public class App {
    public static void main(String[] args) {
        Student max = new Student(20, "Max Mustermann");
        Student hannah = new Student(21, "Hannah Mustermann");
        max.info();
        hannah.info();
    }
}
