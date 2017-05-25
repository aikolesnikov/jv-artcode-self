package university;


import _template.Entity;
import datastructures.MyArrayList;

/**
 *  common univer class
 */
public class Univer extends Entity {
    private String address;
    MyArrayList providesSubjects;

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    Univer(){}
    Univer(int id, String name){
        this.setId(id);
        this.setName(name);
    }

}
