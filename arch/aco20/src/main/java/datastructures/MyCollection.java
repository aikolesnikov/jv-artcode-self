package datastructures;

/**
 *  base template interface for MyDataStructures
 */
interface MyCollection{

    boolean	add(Object o);                  // Ensures that this collection contains the specified element (optional operation).
    void	clear();                        // Removes all of the elements from this collection (optional operation).
    boolean	contains(Object o);             // Returns true if this collection contains the specified element.
    boolean	equals(Object o);               // Compares the specified object with this collection for equality.
    boolean	remove(Object o);               // Removes a single instance of the specified element from this collection, if it is present (optional operation).
    boolean	isEmpty();                      // Returns true if this collection contains no elements.
    int	size();                             // Returns the number of elements in this collection.
    //Object[] toArray();                   // Returns an array containing all of the elements in this collection.

/*
    boolean	containsAll(Collection<?> c);       Returns true if this collection contains all of the elements in the specified collection.
    int	hashCode();     Returns the hash code value for this collection.
    Iterator<E>	iterator();     Returns an iterator over the elements in this collection.
    boolean	removeAll(Collection<?> c);     Removes all of this collection's elements that are also contained in the specified collection (optional operation).
    boolean	retainAll(Collection<?> c);     Retains only the elements in this collection that are contained in the specified collection (optional operation).
    <T> T[]	toArray(T[] a);     Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array.
*/




}
