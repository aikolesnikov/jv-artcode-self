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
    public boolean	isEmpty(){return size == 0;}
    public boolean add(Object o) {
        for (int i=0; i<this.getSize(); i++){
            if (this.getAr()[i] == null){
                this.getAr()[i] = o;
                return true;
            }
        }

        try {
            this.resize(this.getSize() * 3 / 2);
        }
        catch (Exception e){
            System.out.println("Can not resize.");
        }

        return false;
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
    public boolean equals(Object o, int ind){
        return ((o == null)?(this.getAr()[ind]==null):(this.getAr()[ind].equals(o)));
    }
    public void clear(){
        this.resize(initSize);
        for (int i=0; i<initSize; i++){
            this.getAr()[i] = null;
        }
    }
    public boolean	contains(Object o){
        for (int i=0; i<this.getSize(); i++){
            if (this.equals(o, i)){
                return true;
            }
        }
        return false;
    }
    public boolean	remove(Object o){

        int actualSize = this.getSize();

        for (int i=0; i<actualSize; i++){
            if (this.equals(o, i)){
                for (int j=i; j<this.getSize()-1;j++){
                    this.getAr()[j]=this.getAr()[j+1];
                }
                this.setSize(actualSize-1);
                return true;
            }
        }

        return false;
    }
    public boolean	remove(int ind){
        int actualSize = this.getSize();

        if ((ind < 0) || (ind > actualSize)) {
            System.out.println("Index is out of range.");
            return false;
        }

        for (int j=ind; j<actualSize-1;j++){
            this.getAr()[j]=this.getAr()[j+1];
        }
        this.setSize(actualSize-1);

        return true;
    }
    public int indexOf(Object o){
        int ind = -1;

        int actualSize = this.getSize();
        for (int i=0; i<actualSize ; i++){
            if (this.equals(o, i)){
                ind = i;
                return ind;
            }
        }

        return ind;
    }
    // int lastIndexOf(Object o)

    public void print(){
        System.out.println("MyArrayList:");
        for (int i=0; i<this.getSize(); i++){
            System.out.println(this.getAr()[i]);
        }
    }


}
