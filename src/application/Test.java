package application;

/**
 * Created by Allex Lima and Paulo Moraes
 */

public class Test {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.setPsname("Sancha");

        Schedules schedules = new Schedules();
        schedules.setSart(10, 20);
        schedules.setEnd(11, 00);

        professor.setSchedules(schedules);

        Core.setProfessors(professor);

        Assistent assistent = new Assistent();
        assistent.scheduling();
    }
}
