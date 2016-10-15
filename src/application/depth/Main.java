package application.depth;

/**
 * Created by Allex Lima & Paulo Moraes.
 */

public class Main {

    public static void main(String[] args) {

        Student s = new Student();
        s.sname = "Paulo Igor Moraes";
        s.theme = "TCC";
        s.team = "CMN06S1";

        System.out.println(s.getSname());
        System.out.println(s.getTheme());
        System.out.println(s.getTeam());
    }
}
