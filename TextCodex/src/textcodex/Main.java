package textcodex;

import controller.Controller;
import model.Model;

public class Main {

    public static void main(String[] args) {
        TestHarness th = new TestHarness();


        Model model = new Model();
        Controller controller = new Controller(model);
    }



}
