package university;

import org.junit.Assert;
import org.junit.Test;

import static university.Subject.*;


/**
 * tests for Group class
 */
public class GroupTests {

    @Test
    public void checkGroups(){
        Student student1 = new Student(1, "Student1",
                (new Subject[]{Mathematics}));
        Student student2 = new Student(2, "Student2",
                (new Subject[]{Mathematics, ComputerScience, Business}));

        Student[] students = new Student[]{student1, student2};

        Group group1 = new Group(1, "Group1", students);
        System.out.println(group1.toString());

        Assert.assertTrue(group1.getId()==1);
        Assert.assertEquals(group1.getName(),"Group1");
        Assert.assertTrue(group1.getStudents().size()==2);

        Student student3 = new Student(2, "Student2",
                (new Subject[]{Literature}));

        group1.students.add(student3);
        Assert.assertTrue(group1.getStudents().size()==3);

        System.out.println(group1.getStudents().print());

    }



/*    System.out.println(students.add(student1));
    // Assert.assertTrue(students.add(student1));
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students.print());*/
}
