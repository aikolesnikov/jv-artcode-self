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

    public void setId(int id) {
        this.id = id;
    }

    int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    static int getInitGrSize() {
        return INIT_GR_SIZE;
    }

    Group() {
        this.students = new Student[INIT_GR_SIZE];
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
        if (this.size < students.length) {
            students[size++] = student;
            return true;
        }

        return false;
    }

    /*boolean deleteStudent(Student student) {

        return false;
    }
*/
  /*  boolean replaceStudent(int index) {

        return false;
    }
*/
    @Override
    public String toString() {
        String str = "";
        for (Student student : students) {
            if (!(student == null))
                str = str.concat(student.toString().concat(";"));
        }

        return "Group " + id + " includes:\n" + str;
    }
}
