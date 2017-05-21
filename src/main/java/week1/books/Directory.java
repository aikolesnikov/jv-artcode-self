package week1.books;

/**
 * vocabulary
 */
public class Directory extends Book implements IEditable {
    private String theme;
    private static final int minOrder = 1000;
    private static final int defaultYear = 2017;

    public String getTheme() {
        return theme;
    }
    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public int publish() {
        System.out.println("Vocabulary has been published.");
        return 1;
    }

    @Override
    public boolean print() {
        System.out.println("Vocabulary has been printed.");
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
        return "Directory is published in " + pHouse;
    }
}

