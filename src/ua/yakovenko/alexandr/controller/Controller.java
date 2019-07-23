package ua.yakovenko.alexandr.controller;

import java.util.Scanner;

import ua.yakovenko.alexandr.model.Model;
import ua.yakovenko.alexandr.view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook  inputNoteNoteBook =
                new InputNoteNoteBook(model, view, sc);
        inputNoteNoteBook.inputNote();
        view.printMessage(inputNoteNoteBook.toString());
    }
}
