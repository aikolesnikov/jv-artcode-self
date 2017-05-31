package week1.university;

/**
 *  Created by kaim on 5/14/17.
 */
class Student {
    private int id;
    private String name;
    private String surname;
    private int age;

    Student() {
    }

    Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    private String getSurname() {
        return surname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    private int getAge() {
        return age;
    }

    String print() {
        return ("week1.Student name: " + this.getName() + " " + this.getSurname() + ", " + this.getAge()
                + " years.");
    }

}

