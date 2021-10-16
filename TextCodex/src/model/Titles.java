package model;

public class Titles {
    private String userSetTitle;

    public Titles(String userSetTitle) {
        this.userSetTitle = userSetTitle;
    }

    public Titles() {
        userSetTitle = "";
    }
    public String getUserSetTitle() {
        return userSetTitle;
    }
    public void setUserSetTitle(String userSetTitle) {
        this.userSetTitle = userSetTitle;
    }

    @Override
    public String toString() {
        return userSetTitle + "\"";
    }
}
