package application.depth;

/**
 * Created by Allex Lima & Paulo Moraes.
 */

public class Student {
    private String sname, sclass;
    private int sregistration;

    public Student(){

    }

    public Student(String sname, String sclass, int sregistration) {
        this.sname = sname;
        this.sclass = sclass;
        this.sregistration = sregistration;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public int getSregistration() {
        return sregistration;
    }

    public void setSregistration(int sregistration) {
        this.sregistration = sregistration;
    }
}
