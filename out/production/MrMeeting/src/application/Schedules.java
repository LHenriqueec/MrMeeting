package application;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Allex Lima & Paulo Moraes.
 */

public class Schedules {

    private Date start, end;

    public void setSart(int Hour, int Minute){
        String time = Integer.toString(Hour) + ":" + Integer.toString(Minute);
        DateFormat format = new SimpleDateFormat("H:m");
        try{
            Date newTime = format.parse(time);
            this.start = newTime;
        }catch (ParseException e){
            System.out.println(e.getMessage());
        }
    }

    public void setEnd(int Hour, int Minute){
        String time = Integer.toString(Hour) + ":" + Integer.toString(Minute);
        DateFormat format = new SimpleDateFormat("H:m");
        try{
            Date newTime = format.parse(time);
            this.end = newTime;
        }catch (ParseException e){
            System.out.println(e.getMessage());
        }
    }

    public String getStart(){
        SimpleDateFormat ft = new SimpleDateFormat("H:m");
        return ft.format(this.start);
    }

    public String getEnd(){
        SimpleDateFormat ft = new SimpleDateFormat("H:m");
        return ft.format(this.end);
    }
}

