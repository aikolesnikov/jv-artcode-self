import org.junit.Assert;
import org.junit.Test;

/**
 * tests for Group class
 */
public class GroupTests {
    @Test
    public void checkGroupsCreation() {
        Group gr1 = new Group();
        Group gr2 = new Group(2);

        Student[] arSt = new Student[]{
            new Student("st_name1"),
            new Student("st_name2"),
            new Student("st_name3"),
        };

        Group gr3 = new Group(3, arSt);
        Group gr4 = new Group(4, null);

        Student[] arSt2 = new Student[]{
                new Student("st_name1", "st_surname1"),
                null,
                new Student("st_name3"),
        };

        Group gr5 = new Group(5, arSt2);

        Assert.assertTrue(gr1.getId() == 0);
        Assert.assertTrue(gr1.getStudents().length == Group.getInitGrSize());
        Assert.assertTrue(gr1.getSize() == 0);

        Assert.assertTrue(gr2.getId() == 2);
        Assert.assertTrue(gr2.getStudents().length == Group.getInitGrSize());
        Assert.assertTrue(gr2.getSize() == 0);

        Assert.assertTrue(gr3.getId() == 3);
        Assert.assertTrue(gr3.getStudents().length == 3);
        Assert.assertTrue(gr3.getSize() == 3);
        Assert.assertTrue(gr3.getStudents()[2].getName().equals("st_name3"));

        Assert.assertTrue(gr4.getStudents().length == Group.getInitGrSize());
        Assert.assertTrue(gr4.getSize()==0);

        Assert.assertTrue(gr5.getStudents().length == 3);
        Assert.assertTrue(gr5.getSize()==2);

        Assert.assertTrue(gr5.toString().equals("Group 5 includes:\nStudent: {st_name1 st_surname1};Student: {st_name3};"));
        // System.out.println(gr1.toString());
    }

    @Test
    public void checkAddStudentsOperations(){
        Group gr1 = new Group();
        Student st1 = new Student();
        Assert.assertFalse(gr1.addStudent(null));
        Assert.assertTrue(gr1.addStudent(st1));
        Assert.assertTrue(gr1.getSize()==1);

        Student[] arSt2 = new Student[]{
                new Student("st_name1"),
                new Student("st_name2"),
                new Student("st_name3"),
                null,
                new Student("st_name4")
        };
        Group gr2 = new Group(2,arSt2);
        Assert.assertTrue(gr2.getSize()==4);
        Student st2 = new Student();
        Assert.assertTrue(gr2.addStudent(st2));
        Assert.assertTrue(gr2.getSize()==5);

        Student[] arSt3 = new Student[]{
                new Student("st_name1"),
                new Student("st_name2"),
                new Student("st_name3")
        };
        Group gr3 = new Group(3,arSt3);
        Student st3 = new Student();
        Assert.assertFalse(gr3.addStudent(st3));
    }
}

