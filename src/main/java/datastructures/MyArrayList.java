package datastructures;

import java.util.logging.Logger;

/**
 * MyArrayLisr Class
 */
public class MyArrayList implements MyList {

    private static final int initSize = 10;

    private int capacity;
    private int size;
    private Object[] ar;

    public int getCapacity() {return capacity;}
    public void setCapacity(int capacity) {this.capacity = capacity;}
    public int getSize() {return size;}
    public void setSize(int size) {this.size = size;}
    public Object[] getAr() {return ar;}
    public void setAr(Object[] ar) {this.ar = ar;}

    MyArrayList() {
        this.setCapacity(initSize);
        this.setAr(new Object[initSize]);
    }
    MyArrayList(MyArrayList o) {
        this.setCapacity(o.getCapacity());
        this.setAr(o.getAr());
    }
    MyArrayList(int initialCapacity) {
        this.setCapacity(initialCapacity);
        this.setAr(new Object[initialCapacity]);
    }

    public Object get(int index) {
        if ((index < 0) || (index > this.getCapacity())) {
            Logger l = Logger.getLogger(this.getClass().getName());
            l.warning("Index is out of range.");
            return null;
        }

        return this.getAr()[index];
    }
    public int size() {return this.getCapacity();} // ???????
    public boolean	isEmpty(){return size == 0;}

    @Override
    public boolean add(Object o) {
        return true;
    }
}
