package application.depth;
import java.util.ArrayList;

/**
 * Created by Allex Lima & Paulo Moraes.
 */

public class Professor {

    private String psname;
    private ArrayList<Schedules> schedules;

    public Professor(String psname, ArrayList<Schedules> schedules) {
        this.psname = psname;
        this.schedules = schedules;
    }

    public String getPsname() {
        return psname;
    }

    public void setPsname(String psname) {
        this.psname = psname;
    }

    public ArrayList<Schedules> getSchedules() {
        return schedules;
    }

    public void setSchedules(ArrayList<Schedules> schedules) {
        this.schedules = schedules;
    }
}
