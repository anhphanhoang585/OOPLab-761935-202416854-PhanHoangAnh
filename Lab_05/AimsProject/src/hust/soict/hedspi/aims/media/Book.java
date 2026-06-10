package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

    private List<String> authors = new ArrayList<String>();

    public Book() {
        super();
    }

    public Book(String title) {
        super(title);
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
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

    @Override
    public String toString() {
        return "Book - [" + getTitle() + "] - [" + getCategory() + "] - Authors: " + authors.toString() + ": [" + getCost() + "] $";
    }
}
