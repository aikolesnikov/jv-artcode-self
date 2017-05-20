import java.util.logging.Logger;

/**
 *   Created by kaim on 5/14/17.
 */
class University {

    private int Id;
    private String name;
    private int unSize;
    private Group[] groups;
    private int grQty;
    public int getId() {
        return Id;
    }

    private void setId(int id) {
        Id = id;
    }
    private String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }
    private int getUnSize() {
        return unSize;
    }
    public void setUnSize(int unSize) {
        this.unSize = unSize;
    }
    public Group[] getGroups() {
        return groups;
    }
    private void setGroups(Group[] groups) {
        this.groups = groups;
    }
    private int getGrQty() {
        return grQty;
    }
    private void setGrQty(int grQty) {
        this.grQty = grQty;
    }

    University(int id, String name, int grSize){
        this.setId(id);
        this.setName(name);
        this.setGroups(new Group[grSize]);
        this.setGrQty(0);
    }

    boolean addGroup(Group group) {

        int grQty = this.getGrQty();

        if (group == null) return false;
        if (grQty==this.getUnSize()) {
            System.out.println("Groups' limit is exceeded. Group " + group.getGroupId() +
                    " has not been added.\n");
            return false;
        }

        this.groups[grQty++] = group;
        this.setGrQty(grQty);
        System.out.println("Group " + group.getGroupId() +
                " has been added into university " + this.getName() + ".\n");

        return true;
    }

    boolean init (){
        Logger l = Logger.getLogger("University");

        Group gr1 = new Group(1, 10);
        Group gr2 = new Group(2, 5);

        Student st1 = new Student("Name1", "Sur1", 11);
        Student st2 = new Student("Name2", "Sur2", 22);
        Student st3 = new Student("Name3", "Sur3", 33);
        Student st4 = new Student("Name4", "Sur4", 44);

        Student[] st = new Student[] {st1, st2, st3};

        if (gr1.addStudent(st4))
            System.out.println(gr1.print());

        l.info("Univer has been initialized");

        return true;
    }
}



// Student s1 = new Student();
// s1.setName("Yaaa");
// Student s2 = new Student("BB", "Bbbbb", 23);
