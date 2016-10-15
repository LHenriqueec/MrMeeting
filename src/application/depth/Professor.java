package application.depth;

/**
 * Created by Allex Lima & Paulo Moraes.
 */

public class Professor {
    private String pname, discipline;
    private float thour;

    public Professor(String pname, String discipline, float thour) {
        this.pname = pname;
        this.discipline = discipline;
        this.thour = thour;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public float getThour() {
        return thour;
    }

    public void setThour(float thour) {
        this.thour = thour;
    }

}
