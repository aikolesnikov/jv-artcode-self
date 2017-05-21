package week1.university;

import _template.Entity;

/**
 * main.
 */
public class ZProcess {

    public static void main(String[] args) {

        Univer univer1 = new Univer(1, "Univer1", 4);

        Group gr1 = new Group(1, 4);
        Student st1 = new Student("Name1", "Sur1", 11);
        Student st2 = new Student("Name2", "Sur2", 22);
        Student st3 = new Student("Name3", "Sur3", 33);
        Student st4 = new Student("Name4", "Sur4", 44);

        Student[] stAr1 = new Student[]{st1, st2, st3, st4};

        if (univer1.addGroup(gr1)) {
            gr1.addStudent(st1);
            gr1.addStudent(st2);
            gr1.addStudent(st3);
            gr1.addStudent(st4);

            System.out.println(gr1.print());
        }


        NewUniver univ1 = new NewUniver("WWW");
        System.out.println(univ1.getName());

        NewUniver univ2 = new NewUniver(2);
        System.out.println(univ2.getId());

        // Entity.out.println(gr1.getStQty());

        // univer1.init();

        // week1.university.Menu menu = new week1.university.Menu();
        // menu.init();
    }
}
