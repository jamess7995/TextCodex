package model;

public class Doctor extends Abbreviations implements Printable {
    /* This is where nurses take on urgency 1 or urgency 2 patients, for no reason other than they do in this ficticious world */
    private int urgency;
    private int badgeNumber;

    public Doctor(String userShortVersion, int urgency) {
        super(userShortVersion);
        this.urgency=urgency;
    }

    public Doctor() {
        super();
        urgency = 1;
    }

    public int getUrgency() {return urgency;}
    public void setUrgency(int level){this.urgency=urgency;}

    @Override
    public String toString() {return urgency + "\"";}

    public void printSetup(){
        badgeNumber = 5500;
    }

    public void print(){
        System.out.println(badgeNumber);
        System.out.println(this.toString());
    }
}
