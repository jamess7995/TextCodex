package textcodex;

import model.Abbreviations;
import model.Expansions;
import model.Titles;

public class TestHarness {
    public TestHarness() {
        testAbbreviationsClass();
        testExpansionsClass();
        testTitlesClass();
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
