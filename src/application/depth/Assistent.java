package application.depth;
import java.util.Scanner;

/**
 * Created by Allex Lima & Paulo Moraes.
 */

public class Assistent extends Core{

    private Professor professor;
    private int meetingIndex;

    public Student newStudent(){
        Student student = new Student();
        Scanner in = new Scanner(System.in);

        System.out.println("-- Dados do estudante --\n");

        System.out.println("Nome: ");
        student.setSname(in.nextLine());

        System.out.println("Turma: ");
        student.setSclass(in.nextLine());

        System.out.println("Matrícula: ");
        student.setSregistration(Integer.parseInt(in.nextLine()));

        return student;
    }

    public Professor professorChoose(){
        Scanner in = new Scanner(System.in);
        System.out.println("\n");
        for(int i = 0; i < Core.professors.size(); i++) {
            Professor item = Core.professors.get(i);
            System.out.println("#" + i + "Professor: " + item.getPsname());
        }
        System.out.println("\nEscolha um professor: ");
        return professors.get(Integer.parseInt(in.nextLine()));
    }

    @Override
    public void printProfessorSchedules(){
        Scanner in = new Scanner(System.in);
        this.professor = this.professorChoose();
        System.out.println("\n");
        for(int i = 0; i < professor.getSchedules().size(); i++){
            System.out.println("#" + i + " de " + professor.getSchedules().get(i).getStart() + " até às " + professor.getSchedules().get(i).getEnd());
        }
        System.out.println("\nEscolha um horário: ");
        this.meetingIndex = Integer.parseInt(in.nextLine());
    }

    public void scheduling(){
        Scanner in = new Scanner(System.in);
        Meeting meeting = new Meeting();


        meeting.setStudent(this.newStudent());

        System.out.println("-- Dados da reunião --\n");

        System.out.println("Assunto: ");
        meeting.setSubject(in.nextLine());

        System.out.println("Detalhes: ");
        meeting.setDetails(in.nextLine());

        this.printProfessorSchedules();

        meeting.setProfessor(this.professor);
        meeting.setMeetingIndex(this.meetingIndex);
    }
}
