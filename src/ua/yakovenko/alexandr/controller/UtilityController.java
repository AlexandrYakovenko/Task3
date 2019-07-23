package ua.yakovenko.alexandr.controller;

import static ua.yakovenko.alexandr.controller.RegexContainer.*;
import static ua.yakovenko.alexandr.view.TextConstant.*;

import ua.yakovenko.alexandr.model.Model;
import ua.yakovenko.alexandr.view.View;
import java.util.Scanner;

public class UtilityController {

    private Model model;
    private View view;
    private Scanner sc;

    public UtilityController(Model model, View view, Scanner sc) {
        this.model = model;
        this.view = view;
        this.sc = sc;
    }

    /**
     * @param message
     * @param regex
     * @return
     */
    String inputStringData(String message, String regex) {
        String res;
        view.printStringInput(message);
        switch (message) {
            case (INPUT_SECOND_MOBILE_PHONE) : {
               while (true) {
                   res = sc.next();
                   if (res.equals("-1")) {
                       return null;
                   } else if (res.matches(regex)) {
                       return res;
                   } else {
                       view.printWrongInput(message);
                   }
               }
            }
            default : {
                while( !(sc.hasNext() &&
                (res = sc.next()).matches(regex))) {
                view.printWrongInput(message);
                }
                return res;
            }
        }
    }

    /**
     * @param locale
     * @param regex
     * @return
     */
    String checkRegEx(String locale, String regex) {
        if(locale.equals("en")) {
            switch(regex) {
                case("full_name") : return REGEX_FULL_NAME_EN;
                case("nickname") : return REGEX_NICKNAME_EN;
                case("comment") : return REGEX_COMMENT;
                /*case("group") : return REGEX_GROUP;*/
                case("home_number") : return REGEX_HOME_PHONE;
                case("mobile_number") : return REGEX_MOBILE_PHONE;
                case("email") : return REGEX_EMAIL;
                case("skype") : return REGEX_SKYPE;
                case("index") : return REGEX_INDEX;
                case("city") : return REGEX_CITY;
                case("street") : return REGEX_STREET;
                case("number") : return REGEX_NUMBER;
                case("data") : return REGEX_DATE;
                default: return REGEX_DEFAULT;
            }
        } else {
            switch(regex) {
                case("full_name") : return REGEX_FULL_NAME_UA;
                case("nickname") : return REGEX_NICKNAME_EN;
                case("comment") : return REGEX_COMMENT;
                /*case("group") : return REGEX_GROUP;*/
                case("home_number") : return REGEX_HOME_PHONE;
                case("mobile_number") : return REGEX_MOBILE_PHONE;
                case("email") : return REGEX_EMAIL;
                case("skype") : return REGEX_SKYPE;
                case("index") : return REGEX_INDEX;
                case("city") : return REGEX_CITY;
                case("street") : return REGEX_STREET;
                case("number") : return REGEX_NUMBER;
                case("data") : return REGEX_DATE;
                default: return REGEX_DEFAULT;
            }
        }
    }

}
