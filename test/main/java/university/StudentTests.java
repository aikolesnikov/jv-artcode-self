package university;


import datastructures.MyArrayList;
import org.junit.Assert;
import org.junit.Test;

import static university.Subject.*;

/**
 * Student class tests
 */
public class StudentTests {

    @Test
    public void checkStudents(){
        Student student1 = new Student(1, "Student1",
                (new Subject[]{Mathematics}));
        Student student2 = new Student(2, "Student2",
                (new Subject[]{Mathematics, ComputerScience, Business}));
        Student student3 = new Student(3, "Student3",
                (new Subject[]{}));
        Student student4 = new Student(4, "Student4",
                (new Subject[]{Chemistry, Biology}));

        MyArrayList students = new MyArrayList();

        System.out.println(students.add(student1));
        // Assert.assertTrue(students.add(student1));
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students.print());
    }

}
