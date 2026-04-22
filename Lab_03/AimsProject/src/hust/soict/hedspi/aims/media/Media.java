package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public abstract class Media {
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
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Media)) {
            return false;
        }
        Media other = (Media) o;
        if (this.title == null || other.title == null) {
            return false;
        }
        return this.title.equals(other.title);
    }

    @Override
    public String toString() {
        return "Media: " + title + " - Category: " + category + " - Cost: " + cost + "$";
    }
}
