/**
 * group of students class
 */
class Group {
    private static final int INIT_GR_SIZE = 5;
    private int id;
    private int actualSize;
    private int capacity;
    private Student[] students;
    int getId() {return id;}

    public void setId(int id) {this.id = id;}
    int getActualSize() {return actualSize;}
    public void setActualSize(int actualSize) {
        this.actualSize = actualSize;
    }
    int getCapacity() {return capacity;}
    Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    static int getInitGrSize() {return INIT_GR_SIZE;}

    Group() {
        this.students = new Student[INIT_GR_SIZE];
        this.capacity = INIT_GR_SIZE;
    }

    Group(int id) {
        this.id = id;
        this.capacity = INIT_GR_SIZE;
        this.students = new Student[INIT_GR_SIZE];
    }

    Group(int id, Student[] students) {
        this.id = id;
        if (students == null) {
            this.students = new Student[INIT_GR_SIZE];
            this.capacity = INIT_GR_SIZE;
            this.actualSize = 0;
        }
        else {
            this.students = students;
            this.capacity = students.length;
            for (Student student : students) {
                if (!(student == null)) actualSize++;
            }
        }
    }

    boolean addStudent(Student student) {
        if (student == null) {
            return false;
        }
        // if (this.actualSize <)

        return false;
    }

    boolean deleteStudent(Student student) {

        return false;
    }

    boolean replaceStudent(int index) {

        return false;
    }

}
