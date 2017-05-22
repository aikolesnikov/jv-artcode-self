package _template;

/**
 *  Created by kaim on 5/21/17.
 */
class Person {
    private String name;
    private String surname;
    private String middlename;
    private int age;
    private char sex; // change to enum

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    String getSurname() {
        return surname;
    }
    void setSurname(String surname) {
        this.surname = surname;
    }
    String getMiddlename() {
        return middlename;
    }
    void setMiddlename(String middlename) {
        this.middlename = middlename;
    }
    int getAge() {
        return age;
    }
    void setAge(int age) {
        this.age = age;
    }
    char getSex() {
        return sex;
    }
    void setSex(char sex) {
        this.sex = sex;
    }

    String asString(){
        return this.name + " " + this.surname;
    }
}

