import java.util.logging.Logger;

/**
 *   Created by kaim on 5/14/17.
 */
class University {

    private int Id;
    private String name;
    private Group[] groups;
    private int grQty;

    public int getId() {
        return Id;
    }
    private void setId(int id) {
        Id = id;
    }
    public Group[] getGroups() {
        return groups;
    }
    public String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }
    public void setGroups(Group[] groups) {
        this.groups = groups;
    }
    public int getGrQty() {
        return grQty;
    }
    public void setGrQty(int grQty) {
        this.grQty = grQty;
    }

    University(int id, String name){
        this.setId(id);
        this.setName(name);
        // this.setGroups(new Student[]);
    }

    boolean init (){
        Logger l = Logger.getLogger("University");

        // Student s1 = new Student();
        // s1.setName("Yaaa");
        // Student s2 = new Student("BB", "Bbbbb", 23);

        Student st1 = new Student("Name1", "Sur1", 11);
        Student st2 = new Student("Name2", "Sur2", 22);
        Student st3 = new Student("Name3", "Sur3", 33);
        Student st4 = new Student("Name4", "Sur4", 44);

        Student[] st = new Student[] {st1, st2, st3};

        Group gr1 = new Group(1, 5);

        if (gr1.addStudent(st4))
            System.out.println(gr1.print());

        l.info("Univer has been initialized");

        return true;
    }
}
