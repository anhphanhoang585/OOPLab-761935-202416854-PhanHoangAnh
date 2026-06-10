package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public abstract class Media implements Comparable<Media> {
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    private int id;
    private String title;
    private String category;
    private float cost;

    private static int nbMedia = 0;

    public Media() {
        this.id = ++nbMedia;
    }

    public Media(String title) {
        this.id = ++nbMedia;
        this.title = title;
    }

    public Media(String title, String category, float cost) {
        this.id = ++nbMedia;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) throws NullPointerException, ClassCastException {
        if (o == null) {
            throw new NullPointerException("Cannot compare to a null object.");
        }
        if (!(o instanceof Media)) {
            throw new ClassCastException("The object to compare is not of type Media.");
        }
        Media other = (Media) o;
        if (this.title == null || other.title == null) {
            return false;
        }
        return this.title.equalsIgnoreCase(other.title) && this.cost == other.cost;
    }

    @Override
    public int compareTo(Media other) throws NullPointerException {
        if (other == null) {
            throw new NullPointerException("Cannot compare to a null object.");
        }
        if (this.title == null && other.title == null) {
            return Float.compare(this.cost, other.cost);
        }
        if (this.title == null) {
            return -1;
        }
        if (other.title == null) {
            return 1;
        }
        int titleCompare = this.title.compareToIgnoreCase(other.title);
        if (titleCompare != 0) {
            return titleCompare;
        }
        return Float.compare(this.cost, other.cost);
    }

    @Override
    public String toString() {
        return "Media: " + title + " - Category: " + category + " - Cost: " + cost + "$";
    }
}
