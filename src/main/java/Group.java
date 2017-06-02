/**
 * group of students class
 */
class Group {
    protected static final int INIT_GR_SIZE = 5;
    protected int id;
    protected int size;
    protected Student[] students;

    int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int getSize() {
        return size;
    }

    void setSize(int size) {
        this.size = size;
    }

    Student[] getStudents() {
        return students;
    }

    void setStudents(Student[] students) {
        this.students = students;
    }

    static int getInitGrSize() {
        return INIT_GR_SIZE;
    }

    Group() {
        students = new Student[INIT_GR_SIZE];
        size = 0;
    }

    Group(int id) {
        this.id = id;
        this.students = new Student[INIT_GR_SIZE];
        size = 0;
    }

    Group(int id, Student[] students) {
        this.id = id;
        if (students == null) {
            this.students = new Student[INIT_GR_SIZE];
            this.size = 0;
        } else {
            this.students = students;
            for (Student student : students) {
                if (!(student == null)) size++;
            }
        }
    }

    boolean addStudent(Student student) {
        if (student == null) return false;
        if (this.size == students.length) return false;

        for (int i = 0; i < students.length - 1; i++) {
            if (students[i] == null) {
                students[i] = student;
                size++;
                return true;
            }
        }
        students[size] = student;

        return true;
    }

    int findStudent(Student student) {
        if (student != null) {
            for (int i = 0; i < students.length; i++) {
                if (student == students[i]) return i;
            }
            return -1;
        }
        for (int i = 0; i < students.length; i++) {
            if (null == students[i]) return i;
        }
        return -1;

    }

    boolean deleteStudent(Student student) {

        int index = findStudent(student);
        if (findStudent(student) != -1) {
            Student[] newAr = new Student[this.students.length - 1];
            this.size--;

            System.arraycopy(this.students, 0, newAr, 0, index);
            System.arraycopy(this.students, index + 1, newAr, index, this.students.length - 1 - index);

            this.students = newAr;
            return true;
        }
        return false;
    }

    boolean deleteStudentInd(int index) {

        if (index < 0 || index > this.students.length - 1) return false;

        Student[] newAr = new Student[this.students.length - 1];
        this.size--;

        System.arraycopy(this.students, 0, newAr, 0, index);
        System.arraycopy(this.students, index + 1, newAr, index, this.students.length - 1 - index);

        this.students = newAr;
        return true;
    }

    boolean replaceStudent(int index, Student student) {
        if (index < 0 || index > this.students.length - 1) return false;
        this.students[index] = student;

        return true;
    }

    void sortStudents() {
        int bound = students.length;
        Student tmpSt;

        for (int i = 0; i < bound; i++) {
            for (int j = bound - 1; j > i; j--) {
                if (students[j].toString().compareToIgnoreCase(students[j - 1].toString()) > 0) {
                    tmpSt = students[j];
                    students[j] = students[j - 1];
                    students[j - 1] = tmpSt;
                }
            }
        }
    }


    @Override
    public String toString() {
        String str = "";
        for (Student student : students) {
            if (!(student == null))
                str = str.concat(student.toString().concat(";"));
            else str = str.concat("null;");
        }

        return "Group " + id + " includes:\n" + str;
    }

    @Override
    public boolean equals(Object o) {
        if ((o == null) || (!(o.getClass() == this.getClass()))) return false;

        Group tmpO = (Group) o;
        if ((students == null) || (tmpO.getStudents() == null)) return false;
        int len = students.length;
        if (len != tmpO.getStudents().length) return false;

        for (int i = 0; i < len; i++) {
            if ((tmpO.getStudents()[i] == null) || (students[i] == null)
                    || (!(tmpO.getStudents()[i].equals(students[i]))))
                return false;
        }

        return (tmpO.id == id) && (tmpO.size == size);
    }

}
