package week2;

/**
 *  Created by kaim on 5/20/17.
 */
public abstract class Person {
    private String name;
    private String surname;
    private String middlename;
    private int age;
    private char sex;

    public String asString(){
        return this.name;
    }
}
