package ua.yakovenko.alexandr.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static ua.yakovenko.alexandr.view.TextConstant.*;

/**
 * Created by Alexandr Yakovenko 18.07.2019
 */
public class View {

    private static final String MESSAGE_BUNDLE_NAME = "message";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(
                                             MESSAGE_BUNDLE_NAME,
                                              new Locale("en"));
                                              /*new Locale("ua"));*/ //Don`t finish the file settings for this Locale

    public void printMessage(String message) { System.out.println(message); }

    /**
     * @param message
     * @return String
     */
    public String concatMessage(String... message) {
        StringBuilder concat = new StringBuilder();
        for (String s: message) {
            concat = concat.append(s);
        }
        return new String(concat);
    }

    /**
     * @param message
     * Print message if user entered right data.
     */
    public void printStringInput(String message){
        printMessage(concatMessage(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    /**
     * @param message
     * Print message if user entered wrong data.
     */
    public void printWrongInput(String message) {
        printMessage(concatMessage(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }





}
