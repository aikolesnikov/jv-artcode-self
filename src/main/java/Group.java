/**
 * group of students class
 */
class Group {
    private static final int INIT_GR_SIZE = 5;

    private int id;

    private int size;
    private Student[] students;
    int getId() {
        return id;
    }
    void setId(int id) {
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
    static int getInitGrSize() {return INIT_GR_SIZE;}

    Group() {
        this.students = new Student[INIT_GR_SIZE];
    }

    Group(int id) {
        this.id = id;
        this.students = new Student[INIT_GR_SIZE];
    }

    Group(int id, Student[] students) {
        this.id = id;
        if (students == null) {
            this.students = new Student[INIT_GR_SIZE];
            this.size = 0;
        }
        else {
            this.size = students.length;
            this.students = students;
        }
    }

    boolean addStudent(Student student) {
        if (student == null) {
            return false;
        }

        return false;
    }

    boolean deleteStudent(Student student) {

        return false;
    }

    boolean replaceStudent(int index) {

        return false;
    }

}
