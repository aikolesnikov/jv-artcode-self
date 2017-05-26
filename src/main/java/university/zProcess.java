package university;

import datastructures.MyArrayList;

import static university.Subject.*;

/**
 * classes using testing
 */
public class zProcess {

    public static void main(String[] args) {

        Univer univ1 = new Univer();
        univ1.setName("KPI");
        univ1.setId(1);
        Univer univ2 = new Univer(2, "KNU");

        Student student1 = new Student(1, "Student1",
                (new Subject[]{Mathematics}));
        Student student2 = new Student(2, "Student2",
                (new Subject[]{Mathematics, ComputerScience, Business}));
        Student student3 = new Student(3, "Student3",
                (new Subject[]{}));
        Student student4 = new Student(4, "Student4",
                (new Subject[]{Chemistry, Biology}));


        MyArrayList universities = new MyArrayList();
        MyArrayList students = new MyArrayList();

        universities.add(univ1);
        universities.add(univ2);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(universities.print());
        System.out.println(students.print());
    }
}
