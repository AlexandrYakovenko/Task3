package ua.yakovenko.alexandr;

import ua.yakovenko.alexandr.controller.Controller;
import ua.yakovenko.alexandr.model.Model;
import ua.yakovenko.alexandr.view.View;

public class Main {

    public static void main(String[] args) {
        Controller controller =
                new Controller(new Model(), new View());

        controller.processUser();
    }
}
