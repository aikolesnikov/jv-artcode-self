package books;

/**
 * abstract book
 */
abstract class Book {
    String name;
    String author;

    abstract boolean print();

    abstract int publish();
}
