package datastructures;

import _template.Entity;

/**
 * development of MyArrayClass
 */
public class Process {
    public static void main(String[] args) {
        MyArrayList a = new MyArrayList();

        System.out.println(a.getSize());
        System.out.println(a.size());
        System.out.println(a.isEmpty());


        // System.out.println(a.ar[3]);

        a.getAr()[1] = new Entity();
        a.getAr()[3] = new Entity(1, "AFG");
        // System.out.println(a);
        // System.out.println(a.get(11));

        a.print();
    }
}
