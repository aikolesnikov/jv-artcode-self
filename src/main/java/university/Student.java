package university;

import _template.Person;
import datastructures.MyArrayList;

/**
 * students
 */
public class Student extends Person {
    private int id;
    private MyArrayList studiesSubjects;

    Student(int id, String name, Object[] studies){
        this.id = id;
        super.setName(name);
        this.studiesSubjects = new MyArrayList(studies);
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public MyArrayList getStudiesSubjects() {return studiesSubjects;}
    public void setStudiesSubjects(MyArrayList studiesSubjects) {
        this.studiesSubjects = studiesSubjects;
    }

   @Override
    public String toString(){
        return this.getName() + " has ID " + this.id + " and studies: " +
                this.getStudiesSubjects().print() + "\n";
    }
}