package datastructures;

import _template.Entity;

/**
 * development of MyArrayClass
 */
public class Process {
    public static void main(String[] args) {
        MyArrayList a = new MyArrayList();
        MyArrayList b = new MyArrayList();

        System.out.println(a.equals(b));

        System.out.println(a.getSize());
        System.out.println(a.size());
        System.out.println(a.isEmpty());

        // System.out.println(a.ar[3]);

        a.add(new Entity());
        a.add(new Entity(1, "AFG"));
        a.print();
        a.add(333);
        a.print();

        // a.clear();
        a.print();
        System.out.println(a.equals(b));

        System.out.println(a.indexOf(a.get(3)));
    }
}
