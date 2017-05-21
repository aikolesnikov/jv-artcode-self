package week1.books;

/**
 * Enc extends Book
 */
class Encyclopedia extends Book implements IEditable {
    private static final int minOrder = 10000;
    private static final int defaultYear = 2017;

    @Override
    public int publish() {
        System.out.println("Encyclopedia has been published.");
        return 1;
    }

    @Override
    public boolean print() {
        System.out.println("Encyclopedia has been printed.");
        return true;
    }

    public int PublishQty(int pOrder) {
        if (pOrder > minOrder) return pOrder;
        else return minOrder;
    }

    public int PublishYear(int pYear) {
        if (pYear == 0) return defaultYear;
        else return pYear;
    }

    public String PublishHouse(String pHouse) {
        return "Encyclopedia is published in " + pHouse;
    }
}
