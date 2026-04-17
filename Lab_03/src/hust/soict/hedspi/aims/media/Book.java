package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();

    public Book() {
        // TODO Auto-generated constructor stub
    }

    // Getters and Setters (không áp dụng cho list authors theo yêu cầu đề bài)
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

    // Thêm tên một tác giả
    public void addAuthor(String authorName) {
        // Kiểm tra xem tác giả đã tồn tại trong mảng chưa để tránh trùng lặp
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Đã thêm tác giả: \"" + authorName + "\"");
        } else {
            System.out.println("Tác giả \"" + authorName + "\" đã tồn tại trong danh sách!");
        }
    }

    // Xóa một tác giả
    public void removeAuthor(String authorName) {
        // Kiểm tra coi tác giả có thực sự trong danh sách hay không thì mới xóa
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Đã xóa tác giả: \"" + authorName + "\"");
        } else {
            System.out.println("Tác giả \"" + authorName + "\" không tồn tại trong danh sách!");
        }
    }
}
