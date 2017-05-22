package _template;


import _template.Entity;

/**
 *  Created by kaim on 5/21/17.
 */
public class NewUniver extends Entity {
    private String address;

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    NewUniver(){}
    NewUniver(long i, String s){setId(i); setName(s);}
}
