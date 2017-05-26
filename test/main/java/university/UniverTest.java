package university;

import datastructures.MyArrayList;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * first test with JUnit
 */

public class UniverTest{
// @Before
// public void BeforeUniver(){}

@Test
public void UniverTestCteation(){
    Logger l = Logger.getLogger(this.getClass().getName());

    l.info("Test started.");

    Univer univ1=new Univer();
    univ1.setName("KPI");
    univ1.setId(1);
    Univer univ2=new Univer(2,"KNU");
    univ1.setAddress("Address1");

    MyArrayList universities = new MyArrayList();
    universities.add(univ1);
    universities.add(univ2);

    Assert.assertTrue(univ1.getName().equals("KPI"));
    Assert.assertTrue(univ2.getId()==2);

    Assert.assertEquals(univ1.getAddress(),"Address1");

    Assert.assertNotNull(universities.get(0));
    Assert.assertFalse(universities.get(0).equals(universities.get(1)));
    Assert.assertEquals(universities.size(),2);
}

    /*    @After
    public void tearDown(){
    }*/

}
