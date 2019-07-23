package ua.yakovenko.alexandr.controller;

import static ua.yakovenko.alexandr.view.TextConstant.*;

import ua.yakovenko.alexandr.model.Model;
import ua.yakovenko.alexandr.view.View;
import java.util.Scanner;

public class InputNoteNoteBook {
    private Model model;
    private View view;
    private Scanner sc;


    public InputNoteNoteBook(Model model, View view, Scanner sc) {
        this.model = model;
        this.view = view;
        this.sc = sc;
    }

    /**
     * Method determines the locale
     * and set values to the notebook
     * using the correct regex pattern
     * which determines in method "checkRegEx"
     */
    public void inputNote() {
        UtilityController uController =
                new UtilityController(model,view, sc);

        String str =
                (String.valueOf(View.bundle.getLocale()).equals("ua")) ? "ua" : "en" ;

            model.setSurname(
                    uController.inputStringData(INPUT_SURNAME, uController.checkRegEx(str, "full_name")));
            model.setName(
                    uController.inputStringData(INPUT_NAME, uController.checkRegEx(str, "full_name")));
            model.setPatronymic(
                    uController.inputStringData(INPUT_PATRONYMIC, uController.checkRegEx(str, "full_name")));
            model.setNickname(
                    uController.inputStringData(INPUT_NICKNAME, uController.checkRegEx(str, "nickname")));
            model.setComment(
                    uController.inputStringData(INPUT_COMMENTARY, uController.checkRegEx(str, "comment")));

            boolean isGroupEntered = false;
            while (!isGroupEntered) {
                try {
                    model.setGroup(uController.inputStringData(INPUT_GROUP, uController.checkRegEx(str, "group")));
                    isGroupEntered = true;
                } catch (IllegalArgumentException e) {
                    view.printWrongInput(INPUT_GROUP);
                }
            }

            model.setHomeNumber(
                    uController.inputStringData(INPUT_HOME_PHONE, uController.checkRegEx(str, "home_number")));
            model.setFirstMobileNumber(
                    uController.inputStringData(INPUT_FIRST_MOBILE_PHONE, uController.checkRegEx(str, "mobile_number")));
            model.setSecondMobileNumber(
                    uController.inputStringData(INPUT_SECOND_MOBILE_PHONE, uController.checkRegEx(str, "mobile_number")));
            model.setEmail(
                    uController.inputStringData(INPUT_EMAIL, uController.checkRegEx(str, "email")));
            model.setSkype(
                    uController.inputStringData(INPUT_SKYPE, uController.checkRegEx(str, "skype")));
            model.setAddress(
                    uController.inputStringData(INPUT_ADDRESS, uController.checkRegEx(str, "address")));
            model.setDateOfRegistarartion(
                    uController.inputStringData(INPUT_DATE_OF_REGISTRATION, uController.checkRegEx(str, "data")));
            model.setDateOfChangingData(
                    uController.inputStringData(INPUT_DATE_OF_CHANGING_DATA, uController.checkRegEx(str, "data")));

    }

    @Override
    public String toString() {
        return "Your data {" +
                ",\n surname='" + model.getSurname() + '\'' +
                ",\n name='" + model.getName() + '\'' +
                ",\n patronymic='" + model.getPatronymic() + '\'' +
                ",\n nickname='" + model.getNickname() + '\'' +
                ",\n comment='" + model.getComment() + '\'' +
                ",\n group='" + model.getGroup() + '\'' +
                ",\n homeNumber='" + model.getHomeNumber() + '\'' +
                ",\n firstMobileNumber='" + model.getFirstMobileNumber() + '\'' +
                ",\n secondMobileNumber='" + model.getSecondMobileNumber() + '\'' +
                ",\n email='" + model.getEmail() + '\'' +
                ",\n skype='" + model.getSkype() + '\'' +
                ",\n address='" + model.getAddress() + '\'' +
                ",\n dateOfRegistration='" + model.getDateOfRegistarartion() + '\'' +
                ",\n dateOfChangingData='" + model.getDateOfChangingData() + '\'' +
                '}';
    }
}


