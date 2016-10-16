package application.depth;

/**
 * Created by Allex Lima & Paulo Moraes.
 */

public class Meeting {

    private Student student;
    private String subject, details;
    private Professor professor;

    public Meeting(Student student, String subject, String details, Professor professor) {
        this.student = student;
        this.subject = subject;
        this.details = details;
        this.professor = professor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
