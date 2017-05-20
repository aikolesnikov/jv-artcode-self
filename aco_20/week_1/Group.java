/**
 *  Created by kaim on 5/14/17.
 */
class Group {

    private int groupId;
    private int groupSize;
    private Student[] students;
    private int stQty;

    int getGroupId() {
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

    private void setStudents(Student[] students) {
        this.students = students;
    }

    int getStQty() {
        return stQty;
    }

    private void setStQty(int stQty) {
        this.stQty = stQty;
    }

    Group(int groupId, int groupSize) {
        this.setGroupId(groupId);
        this.setGroupSize(groupSize);
        this.setStudents(new Student[this.groupSize]);
        this.setStQty(0);
    }

    boolean addStudent(Student student) {

        int stQ = this.getStQty();

        if (student == null) return false;
        if (stQ == this.getGroupSize()) {
            System.out.println("Group limit is exceeded. Student " + student.getName() +
                    " has not been added.\n");
            return false;
        }

        this.students[stQty++] = student;
        System.out.println(this.getStQty());
        System.out.println("Student " + student.getName() +
                " has been added into group " + this.getGroupId() + ".\n");
        return true;
    }

    boolean editStudent(int studentId) {

        return false;
    }

    boolean deleteStudent(int studentId) {

        return true;
    }

    String print() {

        String info = "Group " + this.getGroupId() + ":\n";

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