package application.depth;

/**
 * Created by Allex Lima & Paulo Moraes.
 */

public class Student {
    String sname, theme, team;

    public Student() {

    }

    public Student(String sname, String theme, String team) {
        this.sname = sname;
        this.theme = theme;
        this.team = team;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
