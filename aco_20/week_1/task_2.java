
/**
 *   Created by kaim on 5/14/17.
 */
public class task_2 {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Yaaa");

        Student s2 = new Student("BB", "Bbbbb", 23);

        System.out.println(s1.getName());
        s2.stPrint();

        Student st1 = new Student("Name1", "Sur1", 11);
        Student st2 = new Student("Name2", "Sur2", 22);
        Student st3 = new Student("Name3", "Sur3", 33);

        Student[] st = new Student[] {st1, st2, st3};

        Group gr1 = new Group(1, st);
        Group gr2 = new Group(1, 6);

        System.out.println(gr1.printGroup());

        Student st4 = new Student("Name4", "Sur4", 44);
        if (gr2.addStudent(2, st4))
            System.out.println(gr2.printGroup());

    }
}
