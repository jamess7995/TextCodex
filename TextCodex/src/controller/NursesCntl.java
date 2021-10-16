package controller;

import model.Nurse;
import model.NurseList;
import view.NurseUI;

public class NursesCntl {
    NurseUI theNurseUI;
    NurseList theNurseList;
    

    public NursesCntl() {
            theNurseList = new NurseList();
            theNurseUI = new NurseUI(this);
            showNurseUI();
    }

    public NurseUI getTheNurseUI() {
            return theNurseUI;
        }

    public void addNewNurse(Nurse nurse) {
            theNurseList.getTheNurseArrayList().add(nurse);
    }

    public void setTheNurseUI(NurseUI theNurseUI) {
            this.theNurseUI = theNurseUI;
    }

    public NurseList getTheNurseList() {
            return theNurseList;
    }

    public void setTheNurseList(NurseList theNurseList) {
            this.theNurseList = theNurseList;
    }

    public void showNurseUI() {
            theNurseUI.setVisible(true);
        }





/*    public ArrayList<Abbreviations> makeData () {
        Doctor d1 = new Doctor("atype", 1);
        Doctor d2 = new Doctor("azip", 2);
        Doctor d3 = new Doctor("acount", 3);
        Doctor d4 = new Doctor("afun", 4);
        Doctor d5 = new Doctor("aem", 5);
        ArrayList<Abbreviations> abbreviations = new ArrayList<>();
            abbreviations.add(d1);
            abbreviations.add(d2);
            abbreviations.add(d3);
            abbreviations.add(d4);
            abbreviations.add(d5);
            for (Abbreviations i : abbreviations) {
                System.out.println(i.toString());
            }
            ArrayList<Printable> printableObjects = new ArrayList<>();
            printableObjects.add(n1);
            printableObjects.add(n2);
            printableObjects.add(n3);
            printableObjects.add(n4);
            printableObjects.add(n5);
            printableObjects.add(d1);
            printableObjects.add(d2);
            printableObjects.add(d3);
            printableObjects.add(d4);
            printableObjects.add(d5);
            for (Printable p : printableObjects) {
                p.printSetup();
                p.print();
            }
            return abbreviations;

    }*/

}
