package university;

import _template.Entity;
import datastructures.MyArrayList;

/**
 * university groups
 */
public class Group extends Entity {
    private int id;
    MyArrayList students;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public MyArrayList getStudents() {return students;}
    public void setStudents(MyArrayList students) {this.students = students;}

    Group(int id, String name, Student[] students){
        this.setId(id);
        this.setName(name);
        this.setStudents(new MyArrayList(students));
    }


}
