/**
 *  Created by kaim on 5/14/17.
 */
public class Group {
    int groupNumber;
    int groupSize;
    Student[] students;

    Group(int num, Student[] students) {
        this.groupNumber = num;
        this.students = students;
        this.groupSize = students.length;
    }

    Group(int num, int groupSize) {
        this.groupNumber = num;
        this.groupSize = groupSize;
        this.students = new Student[this.groupSize];
    }

    String printGroup() {

        String info = "";

        for (int i = 0; i < this.groupSize; i++) {
            info += students[i].stPrint();
            info += ";\n ";
        }

        return info;
    }


}

