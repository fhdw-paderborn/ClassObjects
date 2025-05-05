import model.Student;

/**
 * This App creates two studend objects/instances and call the info method on them.
 */
public class App {
    public static void main(String[] args) {
        Student max = new Student(20, "Max Mustermann");
        var hannah = new Student(21, "Hannah Mustermann");
        max.info();
        hannah.info();
    }
}
