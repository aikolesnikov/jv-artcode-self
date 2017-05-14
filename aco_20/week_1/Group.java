/**
 *  Created by kaim on 5/14/17.
 */
public class Group {

    private int groupNumber;
    private int groupSize;
    private Student[] students;

    private void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
    public int getGroupNumber() {
        return groupNumber;
    }
    private void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }
    public int getGroupSize() {
        return groupSize;
    }

    Group(int num, Student[] students) {
        this.setGroupNumber(num);
        this.setGroupSize(students.length);
        this.students = students;
    }
    Group(int num, int groupSize) {
        this.setGroupNumber(num);
        this.setGroupSize(groupSize);
        this.students = new Student[this.groupSize];
    }

    boolean addStudent(Student student) {

        if (student == null) return false;

        for (int i = 0; i < this.groupSize; i++) {
            if (this.students[i] == null) {
                this.groupSize++;
                this.students[i]=student;
                return true;
            }
        }

        return false;
    }
    String Print() {

        String info = "";

        for (int i = 0; i < this.groupSize; i++) {
            if (!(students[i] == null)){
                info += students[i].Print();
                info += ";\n ";
            }
        }
        return info;
    }

}

