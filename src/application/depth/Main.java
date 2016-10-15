package application.depth;

/**
 * Created by Allex Lima & Paulo Moraes.
 */

public class Main {

    public static void main(String[] args) {

        Student s = new Student();
        s.sname = "Fulano da Silva";
        s.theme = "TCC";
        s.team = "XMER5T1";

        System.out.println(s.getSname());
        System.out.println(s.getTheme());
        System.out.println(s.getTeam());
    }
}
