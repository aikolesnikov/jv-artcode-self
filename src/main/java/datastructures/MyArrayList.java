package datastructures;

/**
 * MyArrayLisr Class
 */
public class MyArrayList implements MyList {

/*
    //  with an initial capacity of ten.  ArrayList();                                // Constructs an empty list with an initial capacity of ten.
    ArrayList(Object o);       // Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
    ArrayList(int initialCapacity);             // Constructs an empty list with the specified initial capacity.
*/

    private static final int initSize = 10;

    private int size;
    private Object[] ar;

    public int getSize() {return size;}
    public void setSize(int size) {this.size = size;}
    public Object[] getAr() {return ar;}
    public void setAr(Object[] ar) {this.ar = ar;}


    private MyArrayList(){
        this.setSize(initSize);
        this.setAr(new Object[initSize]);
    }

    @Override
    public boolean add(Object o) {

        return true;
    }


    public static void main(String[] args) {
        MyArrayList a = new MyArrayList();
        System.out.println(a.size);
        System.out.println(a.ar[3]);
    }
}
