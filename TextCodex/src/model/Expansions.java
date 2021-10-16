package model;

public class Expansions {
    private String userLongVersion;

    public Expansions(String userLongVersion) {
        this.userLongVersion = userLongVersion;
    }

    public Expansions() {
        userLongVersion = "";
    }
    public String getUserLongVersion() {
        return userLongVersion;
    }
    public void setUserLongVersion(String userLongVersion) {
        this.userLongVersion = userLongVersion;
    }

    @Override
    public String toString() {
        return userLongVersion + "\"";
    }
}
