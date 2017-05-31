package _template;

/**
 * try person template
 */
public class Person {
    private String name;
    private String surname;
    private int age;
    private char sex; // change to enum

    public Person() {
        this.name = "";
        this.surname = "";
    }

    public Person(String name) {
        this.name = name;
    }

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

    String asString() {
        return this.name + " " + this.surname;
    }
}

