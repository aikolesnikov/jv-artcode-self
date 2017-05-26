package university;


import _template.Person;
import datastructures.MyArrayList;

/**
 * !!! IS NOT READY YET. PRINTING???
 */
public class Teacher extends Person{
    private MyArrayList teachesSubjects;
    private MyArrayList teachesGroups;

    public MyArrayList getTeachesSubjects() {return teachesSubjects;}
    public void setTeachesSubjects(MyArrayList teachesSubjects) {this.teachesSubjects = teachesSubjects;}
    public MyArrayList getTeachesGroups() {return teachesGroups;}
    public void setTeachesGroups(MyArrayList teachesGroups) {this.teachesGroups = teachesGroups;}

    Teacher(String name, Object[] teaches){
        this.setName(name);
        this.setTeachesGroups(new MyArrayList(teaches));
    }

    @Override
    public String toString(){
        return this.getName() + " teaches: " +
                this.getTeachesSubjects().print() + "\n";
    }
}
