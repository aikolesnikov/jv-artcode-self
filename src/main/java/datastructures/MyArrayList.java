package datastructures;

import java.util.logging.Logger;

/**
 * MyArrayLisr Class
 */
public class MyArrayList implements MyList {

    private static final int initSize = 1;  // it was 10

    private int size;
    private Object[] ar;

    public MyArrayList() {
        this.size = initSize;
        this.ar = new Object[initSize];
    }
    public MyArrayList(MyArrayList o) {
        this.size = o.size;
        this.ar = o.ar;
    }
    public MyArrayList(Object[] ar) {
        this.size = ar.length;
        this.ar = ar;
    }
    public MyArrayList(int initialCapacity) {
        this.size = initialCapacity;
        this.ar = new Object[initialCapacity];
    }

    public int getSize() {return size;}
    public void setSize(int size) {this.size = size;}
    public Object[] getAr() {return ar;}

    public void setAr(Object[] ar) {this.ar = ar;}

    public Object get(int index) {
        Logger l = Logger.getLogger(this.getClass().getName());

        if ((index < 0) || (index > this.getSize())) {
            l.warning("Index is out of range.");
            return null;
        }

        return this.ar[index];
    }
    public int size() {return this.size;}
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
        for (int i=0; i<this.size; i++){
            if (this.ar[i] == null){
                this.ar[i] = o;
                return true;
            }
        }

        try {
            int actualSize = this.size;

            if (actualSize<=1) this.resize(actualSize+1);
            else this.resize(actualSize * 3 / 2);
            this.ar[actualSize]=o;
        }
        catch (Exception e){
            System.out.println("Can not resize.");
        }

        return false;
    }
    public boolean equals(MyArrayList o){

        if ((this.ar==null) && (o == null)) return true;

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
    public boolean set(int index, Object o){
        if ((index < 0) || (index > this.getSize())) {
            System.out.println("Index is out of range.");
            return false;
        }

        this.getAr()[index]=o;

        return true;
    }

    public String print(){

        String str = "";
        for (int i=0; i<this.getSize(); i++){
            str = (i<getSize()-1)?(str + this.getAr()[i] + ", "):(str + this.getAr()[i]);
        }

        return str;
    }

}


    /*
    int lastIndexOf(Object o){
        int ind = -1;

        int actualSize = this.getSize();
        for (int i=actualSize-1; i>=0 ; i--){
            if (this.equals(o, i)){
                ind = i;
                return ind;
            }
        }

        return ind;
    }
*/