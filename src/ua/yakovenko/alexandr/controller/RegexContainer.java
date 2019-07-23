package ua.yakovenko.alexandr.controller;

public interface RegexContainer {
    //Full Name
    String REGEX_FULL_NAME_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGEX_FULL_NAME_EN = "^[A-Z][a-z]{1,20}";
    //Nickname
    String REGEX_NICKNAME_EN = "^[\\w\\d\\D_-]{3,20}$";
    //Commentary
    String REGEX_COMMENT = "^[\\s\\S_-]{1,100}$";
    //Group
    /*String REGEX_GROUP = "^[A-Za-z0-9]{1,30}$";*/
    //Home Phone
    String REGEX_HOME_PHONE = "^\\d{4,7}$";
    //Mobile Phone
    String REGEX_MOBILE_PHONE = "^0\\d{4,9}$";
    //Email
    String REGEX_EMAIL = "^[\\w\\d_-]{2,20}@[a-z]{1,5}\\.[a-z]{1,5}$";
    //Skype
    String REGEX_SKYPE = "^[\\w\\d_-]{4,20}$";
    //Address
    String REGEX_ADDRESS = "^\\d{3,5},[A-Z][a-z_-]{2,},[A-Z][a-z_-]{2,},\\d{1,3},\\d{1,5}";
    //Date
    String REGEX_DATE = "^\\d{2}-\\d{2}-\\d{4}$";
    //Default
    String REGEX_DEFAULT = "[\\s\\S]{1,}";

}
