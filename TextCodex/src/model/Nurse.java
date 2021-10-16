package model;


public class Nurse extends Abbreviations implements Printable{
    /* This is where nurses take on level delta or level theta patients, for no reason other than they do in this ficticious world */
    private String level;
    private String banner;

    public Nurse(String userShortVersion, String level) {
        super(userShortVersion);
        this.level=level;
    }

    public Nurse() {
        super();
        level = "Delta";
    }

    public String getUserShortVersion() {
        return super.getUserShortVersion();
    }

    public void setUserShortVersion(String userShortVersion) {
        super.setUserShortVersion(userShortVersion);
    }


    public String getLevel() {return level;}
    public void setLevel(String level){this.level=level;}

    @Override
    public String toString() {return level + "\"";}

    public void printSetup(){
        banner = "**************** NURSE ****************";
    }

    public void print(){
        System.out.println(banner);
        System.out.println(this.toString());
    }
}
