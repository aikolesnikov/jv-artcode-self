package datastructures;

import java.util.logging.Logger;

/**
 * MyArrayLisr Class
 */
public class MyArrayList implements MyList {

    private static final int initSize = 10;

    private int size;
    private Object[] ar;
    // private int lastElem;

    public int getSize() {return size;}
    public void setSize(int size) {this.size = size;}
    public Object[] getAr() {return ar;}
    public void setAr(Object[] ar) {this.ar = ar;}

    MyArrayList() {
        this.setSize(initSize);
        this.setAr(new Object[initSize]);
    }
    MyArrayList(MyArrayList o) {
        this.setSize(o.getSize());
        this.setAr(o.getAr());
    }
    MyArrayList(int initialCapacity) {
        this.setSize(initialCapacity);
        this.setAr(new Object[initialCapacity]);
    }

    public Object get(int index) {
        if ((index < 0) || (index > this.getSize())) {
            Logger l = Logger.getLogger(this.getClass().getName());
            l.warning("Index is out of range.");
            return null;
        }

        return this.getAr()[index];
    }
    public int size() {return this.getSize();}
    public boolean	isEmpty(){return size == 0;}

    @Override
    public boolean add(Object o) {
        boolean added = false;
        for (int i=0; i<this.size; i++){
            if (this.getAr()[i] == null){
                this.getAr()[i] = o;
                return true;
            }
        }

        // Object[] tmpAr = this.getAr();

        return false;
    }

    public void print(){
        System.out.println("MyArrayList:");
        for (int i=0; i<this.getSize(); i++){
            System.out.println(this.getAr()[i]);
        }
    }

}
