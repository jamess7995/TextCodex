package textcodex;

import model.*;
import java.util.ArrayList;

public class TestHarness {
    public TestHarness() {
        testAbbreviationsClass();
        testExpansionsClass();
        testTitlesClass();
        testInterface();
        testClassHierarchy();
    }

    public void testInterface() {
        ArrayList<Printable> c1 = new ArrayList<Printable>();
        System.out.println("Testing the interface of Printable");
        Nurse n1 = new Nurse();
        Doctor d1 = new Doctor();
        c1.add(n1);
        c1.add(d1);
        for (int i = 0; i < c1.size(); i++) {
            (c1.get(i)).printSetup();
        }


    }

    public void testClassHierarchy() {
        ArrayList<Abbreviations> c1 = new ArrayList<Abbreviations>();
        System.out.println("Testing the inheritance of Nurses and Doctors");
        Nurse n1 = new Nurse();
        Doctor d1 = new Doctor();
        if(n1 != null) {
            System.out.println(n1.getLevel());
        }
        else
            System.out.println("There was an error creating the level for nurse");
        n1.setLevel("delta");
        System.out.println(n1.toString());
        c1.add(n1);
        if(d1 != null) {
            System.out.println(d1.getUrgency());
        }
        else
            System.out.println("There was an error creating the urgency for doctor");
        d1.setUrgency(1);
        System.out.println(d1.toString());
        c1.add(d1);
        for (int i = 0; i < c1.size(); i++) {
            System.out.println((c1.get(i)).toString());
        }
    }

    public void testAbbreviationsClass(){
        System.out.println("Testing the Abbreviations class");
        Abbreviations a1 = new Abbreviations();
        if(a1 != null){
            System.out.println(a1.getUserShortVersion());
        }
        else
            System.out.println("There was an error creating the Abbreviation");
        a1.setUserShortVersion("zmp");
        System.out.println(a1.toString());
    }

    public void testExpansionsClass(){
        System.out.println("Testing the Expansions class");
        Expansions e1 = new Expansions();
        if(e1 != null){
            System.out.println(e1.getUserLongVersion());
        }
        else
            System.out.println("There was an error creating the Expansion");
        e1.setUserLongVersion("My Pleasure!");
        System.out.println(e1.toString());
    }

    public void testTitlesClass(){
        System.out.println("Testing the Titles class");
        Titles t1 = new Titles();
        if(t1 != null){
            System.out.println(t1.getUserSetTitle());
        }
        else
            System.out.println("There was an error creating the Title");
        t1.setUserSetTitle("Saying My Pleasure!");
        System.out.println(t1.toString());
    }

}
