package model;

import java.util.ArrayList;

public class NurseList {

    public ArrayList<Nurse> getTheNurseArrayList() {
        return theNurseList;
    }

    public void setTheNurseList(ArrayList<Nurse> theNurseList) {
        this.theNurseList = theNurseList;
    }

    ArrayList<Nurse> theNurseList = new ArrayList<>();
    public NurseList() {
        Nurse n1 = new Nurse("abr", "alpha");
        Nurse n2 = new Nurse("zst", "bravo");
        Nurse n3 = new Nurse("zadd1", "charlie");
        Nurse n4 = new Nurse("zadd2", "delta");
        Nurse n5 = new Nurse("zcity", "echo");
        theNurseList.add(n1);
        theNurseList.add(n2);
        theNurseList.add(n3);
        theNurseList.add(n4);
        theNurseList.add(n5);
    }

}
