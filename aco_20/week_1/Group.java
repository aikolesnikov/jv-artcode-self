/**
 *  Created by kaim on 5/14/17.
 */
class Group {

    private int groupId;
    private int groupSize;
    private Student[] students;
    private int stQty;

    public int getGroupId() {
        return groupId;
    }
    private void setGroupId(int groupId) {
        this.groupId = groupId;
    }
    private int getGroupSize() {
        return groupSize;
    }
    private void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }
    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    private int getStQty() {
        return stQty;
    }
    private void setStQty(int stQty) {
        this.stQty = stQty;
    }

    Group(int groupId, int groupSize) {
        this.setGroupId(groupId);
        this.setGroupSize(groupSize);
        this.students = new Student[this.groupSize];
        this.setStQty(0);
    }


    boolean addStudent(Student student) {

        int stQ = this.getStQty();

        if (student == null) return false;
        if (stQ==this.getGroupSize()) {
            System.out.println("Group limit is exceeded. Student " + student.getName() +
            " has not been added");
            return false;
        }

        this.students[stQty] = student;
        this.setStQty(stQ++);

        return false;
    }

    boolean editStudent(int studentId) {

        if (studentId == 0) return false;

        for (int i = 0; i < this.groupSize; i++) {
            if (this.students[i] == null) {
                this.groupSize++;
                // this.students[i] = student;
                return true;
            }
        }

        return false;
    }
    boolean deleteStudent(int studentId) {

        if (studentId == 0) return false;

        for (int i = 0; i < this.groupSize; i++) {
            if (this.students[i] == null) {
                this.groupSize++;
                // this.students[i] = " ";
                return true;
            }
        }

        return true;
    }

    String print() {

        String info = "";

        for (int i = 0; i < this.groupSize; i++) {
            if (!(students[i] == null)) {
                info += students[i].print();
                info += ";\n ";
            }
        }
        return info;
    }
    String sort() {
        return "sort";
    }

}


// old second constructor
/*
    Group(int num, Student[] students) {
        this.setGroupId(num);
        this.setGroupSize(students.length);
        this.students = students;
    }
    */