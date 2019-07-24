package ua.yakovenko.alexandr.model;

public class Model {

    private String surname;
    private String name;
    private String patronymic;
    private String nickname;
    private String comment;
    private Group group;
    private String homeNumber;
    private String firstMobileNumber;
    private String secondMobileNumber;
    private String email;
    private String skype;
    private String index;
    private String city;
    private String street;
    private String numberOfHouse;
    private String numberOfFlat;
    private String dateOfRegistarartion;
    private String dateOfChangingData;


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = Group.valueOf(group);
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getFirstMobileNumber() {
        return firstMobileNumber;
    }

    public void setFirstMobileNumber(String firstMobileNumber) {
        this.firstMobileNumber = firstMobileNumber;
    }

    public String getSecondMobileNumber() {
        return secondMobileNumber;
    }

    public void setSecondMobileNumber(String secondMobileNumber) {
        this.secondMobileNumber = secondMobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getIndex() { return index; }

    public void setIndex(String index) { this.index = index; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getStreet() { return street; }

    public void setStreet(String street) { this.street = street; }

    public String getNumberOfHouse() { return numberOfHouse; }

    public void setNumberOfHouse(String numberOfHouse) { this.numberOfHouse = numberOfHouse; }

    public String getNumberOfFlat() {
        return numberOfFlat;
    }

    public void setNumberOfFlat(String numberOfFlat) {
        this.numberOfFlat = numberOfFlat;
    }

    public String getDateOfRegistarartion() {
        return dateOfRegistarartion;
    }

    public void setDateOfRegistarartion(String dateOfRegistarartion) {
        this.dateOfRegistarartion = dateOfRegistarartion;
    }

    public String getDateOfChangingData() {
        return dateOfChangingData;
    }

    public void setDateOfChangingData(String dateOfChangingData) {
        this.dateOfChangingData = dateOfChangingData;
    }
}
