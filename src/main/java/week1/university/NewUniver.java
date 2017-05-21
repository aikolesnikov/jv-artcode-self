package week1.university;


import _template.Entity;

/**
 *  Created by kaim on 5/21/17.
 */
public class NewUniver extends Entity {
    String address;

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    NewUniver(String s){this.setName(s);}
    NewUniver(int i){this.setId(i);}

}
