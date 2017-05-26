package _template;

/**
 *  Created by kaim on 5/21/17.
 */
public class Person {
    private String name;
    private String surname;
    private int age;
    private char sex; // change to enum

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }

    public Person(){
        this.setName("");
        this.setSurname("");
    }
    public Person(String name){this.setName(name);}

    String asString(){
        return this.name + " " + this.surname;
    }
}

