package application.depth;
import java.sql.Time;

/**
 * Created by Allex Lima & Paulo Moraes.
 */

public class Schedules {

    private Time tstart, sfinal;

    public Schedules(Time tstart, Time sfinal) {
        this.tstart = tstart;
        this.sfinal = sfinal;
    }

    public Time getTstart() {
        return tstart;
    }

    public void setTstart(Time tstart) {
        this.tstart = tstart;
    }

    public Time getSfinal() {
        return sfinal;
    }

    public void setSfinal(Time sfinal) {
        this.sfinal = sfinal;
    }
}
