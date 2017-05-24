package datastructures;

import _template.Entity;

/**
 * development of MyArrayClass
 */
public class Process {
    public static void main(String[] args) {
        MyArrayList a = new MyArrayList();

        System.out.println(a.getCapacity());
        System.out.println(a.size());
        System.out.println(a.isEmpty());


        // System.out.println(a.ar[3]);

        a.getAr()[1] = new Entity();
        // System.out.println(a);
        System.out.println(a.get(11));
    }
}
