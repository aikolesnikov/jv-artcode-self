package university;

import org.junit.Assert;
import org.junit.Test;

/**
 * subject tests
 */
public class SubjectTest {
    @Test
    public void checkSubjects() {

        // System.out.println((Subject.values()[0].toString().equals("Mathematics")));
        Assert.assertTrue((Subject.values()[0].toString().equals("Mathematics")));
        Assert.assertTrue((Subject.values()[1].toString().equals("Literature")));
        Assert.assertTrue((Subject.values()[2].toString().equals("Business")));

        Assert.assertTrue(Subject.Biology.ordinal()==5);
    }


}
