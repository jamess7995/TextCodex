package model;

public class Abbreviations {
    private String userShortVersion;

    public Abbreviations(String userShortVersion) {
        this.userShortVersion = userShortVersion;
    }

    public Abbreviations() {
        this.userShortVersion = "";
    }
    public String getUserShortVersion() {
        return userShortVersion;
    }
    public void setUserShortVersion(String userShortVersion) {
        this.userShortVersion = userShortVersion;
    }

    @Override
    public String toString() {
        return userShortVersion + "\"";
    }
}
