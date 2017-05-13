/**
 *  Created by kaim on 5/13/17.
 */
public class task_1 {

    public static class Student {
        String name;
        String surname;
        int age;

        Student() {
        }


        Student(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Yaaa";

        Student s2 = new Student("BB", "Bbbbb", 23);

        System.out.println(s1.name);
        System.out.println(s2.age);

    }
}
