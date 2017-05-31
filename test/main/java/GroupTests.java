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
                new Student("st_name1"),
                null,
                new Student("st_name3"),
        };

        Group gr5 = new Group(5, arSt2);

        Assert.assertTrue(gr1.getId() == 0);
        Assert.assertTrue(gr1.getStudents().length == Group.getInitGrSize());
        Assert.assertTrue(gr1.getActualSize() == 0);
        Assert.assertTrue(gr1.getCapacity() == Group.getInitGrSize());

        Assert.assertTrue(gr2.getId() == 2);
        Assert.assertTrue(gr2.getStudents().length == Group.getInitGrSize());
        Assert.assertTrue(gr2.getActualSize() == 0);
        Assert.assertTrue(gr1.getCapacity() == Group.getInitGrSize());

        Assert.assertTrue(gr3.getId() == 3);
        Assert.assertTrue(gr3.getStudents().length == 3);
        Assert.assertTrue(gr3.getActualSize() == 3);
        Assert.assertTrue(gr3.getCapacity() == 3);
        Assert.assertTrue(gr3.getStudents()[2].getName().equals("st_name3"));

        Assert.assertTrue(gr4.getStudents().length == Group.getInitGrSize());
        Assert.assertTrue(gr4.getActualSize()==0);
        Assert.assertTrue(gr4.getCapacity()==Group.getInitGrSize());

        Assert.assertTrue(gr5.getStudents().length == 3);
        Assert.assertTrue(gr5.getActualSize()==2);
        Assert.assertTrue(gr5.getCapacity()==3);

    }

    @Test
    public void checkStudentsOperations(){
        Group gr = new Group();
        Student st = new Student();

        // Assert.assertFalse(gr.addStudent(null));
        // Assert.assertTrue(gr.addStudent(st));
        // Assert.assertTrue(gr.deleteStudent(st));
        // Assert.assertTrue(gr.replaceStudent(1));
    }
}

