package application.depth;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Allex Lima & Paulo Moraes.
 */

public class Main {

    public static void main(String[] args) {
        String minhaHora = "22:30";
        DateFormat formato = new SimpleDateFormat("H:m");
        Date novaHora = new Date();
        try{
            novaHora = formato.parse(minhaHora);
        }catch (ParseException e){
            System.out.println(e.getMessage());
        }

        SimpleDateFormat ft = new SimpleDateFormat("H:m");
        System.out.println(ft.format(novaHora));
    }
}