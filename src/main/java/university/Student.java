package university;

import _template.Person;
import datastructures.MyArrayList;

/**
 * students
 */
public class Student extends Person {
    private int id;
    private MyArrayList studiesSubjects;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public MyArrayList getStudiesSubjects() {return studiesSubjects;}
    public void setStudiesSubjects(MyArrayList studiesSubjects) {
        this.studiesSubjects = studiesSubjects;
    }

    Student(int id, String name, Object[] studies){
        this.setId(id);
        this.setName(name);
        this.setStudiesSubjects(new MyArrayList(studies));
    }

   @Override
    public String toString(){
        return this.getName() + " has ID " + this.getId() + " and studies: " +
                this.getStudiesSubjects().print() + "\n";
    }
}