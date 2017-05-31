package university;


import datastructures.MyArrayList;
import org.junit.Assert;
import org.junit.Test;

import static university.Subject.*;

/**
 * Student class tests
 */
public class TeacherTests {

    @Test
    public void checkTeachers(){
        Teacher teacher1 = new Teacher("Teacher1",
                (new Subject[]{Mathematics, ComputerScience}));
        Teacher teacher2 = new Teacher("Teacher2",
                (new Subject[]{Literature}));
        Teacher teacher3 = new Teacher("Teacher3",
                (new Subject[]{}));
        Teacher teacher4 = new Teacher("Teacher4",
                (new Subject[]{}));

        System.out.println(teacher1.getName());

        MyArrayList teachers = new MyArrayList();
        Assert.assertTrue(teachers.add(teacher1));

        System.out.println(teachers.size());
    }

}
