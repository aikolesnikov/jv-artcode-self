import java.util.logging.Logger;

/**
 *   Created by kaim on 5/14/17.
 */
class University {

    boolean init (){
        Logger l = Logger.getLogger("University");

        Student s1 = new Student();
        s1.setName("Yaaa");

        Student s2 = new Student("BB", "Bbbbb", 23);

        System.out.println(s1.getName());
        s2.print();

        Student st1 = new Student("Name1", "Sur1", 11);
        Student st2 = new Student("Name2", "Sur2", 22);
        Student st3 = new Student("Name3", "Sur3", 33);

        Student[] st = new Student[] {st1, st2, st3};

        Group gr1 = new Group(1, st);
        Group gr2 = new Group(1, 6);

        // System.out.println(gr1.Print());
        // l.info(gr1.print());

        Student st4 = new Student("Name4", "Sur4", 44);
        if (gr1.addStudent(st4))
            System.out.println("added");

        l.info("Univer has been initialized");

        return true;
    }
}
