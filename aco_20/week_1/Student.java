/**
 *  Created by kaim on 5/14/17.
 */
public class Student {
        String name;
        String surname;
        int age;

        public void stPrint() {
            System.out.println("Student name: " + name + " " + surname + ", " + age + " years.");
        }

        Student() {
        }

        Student(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }
    }

