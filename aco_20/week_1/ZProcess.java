/**
 * main.
 */
public class ZProcess {

    public static void main(String[] args) {

        University univer1 = new University(1, "Univer1", 4);
        University univer2 = new University(2, "Univer2", 6);

        Group gr1 = new Group(1, 4);
        Group gr2 = new Group(2, 10);

        Student st1 = new Student("Name1", "Sur1", 11);
        Student st2 = new Student("Name2", "Sur2", 22);
        Student st3 = new Student("Name3", "Sur3", 33);
        Student st4 = new Student("Name4", "Sur4", 44);

        Student[] stAr1 = new Student[] {st1, st2, st3, st4};

        univer1.addGroup(gr1);
        univer2.addGroup(gr2);

        gr1.addStudent(st1);
        gr1.addStudent(st2);
        gr1.addStudent(st3);
        gr1.addStudent(st4);

        System.out.println(gr1.getStQty());
//        System.out.println(gr1.print());

        // univer1.init();

        // Menu menu = new Menu();
        // menu.init();
    }
}
