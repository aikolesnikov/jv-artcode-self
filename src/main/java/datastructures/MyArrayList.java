package datastructures;

import java.util.logging.Logger;

/**
 * MyArrayLisr Class
 */
public class MyArrayList implements MyList {

    private static final int initSize = 10;

    private int size;
    private Object[] ar;

    public int getSize() {return size;}
    public void setSize(int size) {this.size = size;}
    private Object[] getAr() {return ar;}
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
        Logger l = Logger.getLogger(this.getClass().getName());

        if ((index < 0) || (index > this.getSize())) {
            l.warning("Index is out of range.");
            return null;
        }

        return this.getAr()[index];
    }
    public int size() {return this.getSize();}
    public boolean	isEmpty(){return size == 0;}

    public void resize(int newSize){

        int actualSize = this.getSize();

        if (newSize==actualSize) {
            System.out.println("The same size. Resizing is skipped.");
            return;
        }
        actualSize = (this.getSize()>newSize)?newSize:this.getSize();

        MyArrayList newMyArrayList = new MyArrayList(newSize);
        for (int i=0; i < actualSize; i++){
            newMyArrayList.getAr()[i] = this.getAr()[i];
        }

        this.setSize(newSize);
        this.setAr(newMyArrayList.getAr());
    }

    @Override
    public boolean add(Object o) {
        boolean added = true;

        for (int i=0; i<this.getSize(); i++){
            if (this.getAr()[i] == null){
                this.getAr()[i] = o;
                return added;
            }
        }

        try {
            this.resize(this.getSize() * 3 / 2);
        }
        catch (Exception e){
            System.out.println("Can not resize.");
            added = false;
        }

        return added;
    }

    public boolean equals(MyArrayList o){

        if ((this.getAr()==null) && (o == null)) return true;

        int actualSize = this.size;
        if (!(actualSize==o.size)) return false;

        for (int i=0; i<actualSize; i++){
            if ((this.getAr()[i]==null) && !(o.getAr()[i]==null)) return false;
            if (!(this.getAr()[i]==null) && (o.getAr()[i]==null)) return false;

            if (!((this.getAr()[i]==null) || (o.getAr()[i]==null))) {
                if (!(this.getAr()[i].equals(o.getAr()[i]))) return false;
            }
        }

        return true;
    }

    public void clear(){
        this.resize(initSize);
        for (int i=0; i<initSize; i++){
            this.getAr()[i] = null;
        }
    }

    public void print(){
        System.out.println("MyArrayList:");
        for (int i=0; i<this.getSize(); i++){
            System.out.println(this.getAr()[i]);
        }
    }


}
