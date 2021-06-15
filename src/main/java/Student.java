import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    public ArrayList<Integer> getGrades() {
        return this.grades;
    }
}
