package week2;

/**
 *  Created by kaim on 5/20/17.
 */
public class Patient extends Person{
    private String diagnose;
    private double weigh;
    private double hight;

    @Override
    public String asString(){return "patient";}
}
