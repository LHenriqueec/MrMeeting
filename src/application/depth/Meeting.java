package application.depth;

/**
 * Created by Allex Lima & Paulo Moraes.
 */

public class Meeting {

    private Student student;
    private Professor professor;

    public Meeting(Student student, Professor professor) {
        this.student = student;
        this.professor = professor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
