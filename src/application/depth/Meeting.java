package application.depth;

/**
 * Created by Allex Lima & Paulo Moraes.
 */

public class Meeting {

    private Student student;
    private String theme, details;
    private Professor professor;

    public Meeting(Student student, String theme, String details, Professor professor) {
        this.student = student;
        this.theme = theme;
        this.details = details;
        this.professor = professor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
