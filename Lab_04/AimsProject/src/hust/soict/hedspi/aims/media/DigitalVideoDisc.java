package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    // Removed nbDigitalVideoDiscs (handled by Media)

    // Task 10: Cập nhật các hàm khởi tạo (Constructors) để tự động gán ID
    
    // 1. Tạo đối tượng DVD theo tiêu đề (title)
    public DigitalVideoDisc(String title) {
        super(title);
    }

    // 2. Tạo đối tượng DVD theo tiêu đề, danh mục và giá thành
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    // 3. Tạo đối tượng DVD theo đạo diễn, danh mục, tiêu đề và giá thành
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
    }

    // 4. Tạo đối tượng DVD bằng tất cả các thuộc tính
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    @Override
    public String toString() {
        return "DVD - [" + getTitle() + "] - [" + getCategory() + "] - [" + getDirector() + "] - [" + getLength() + "]: [" + getCost() + "] $";
    }

    public boolean isMatch(String title) {
        if (this.getTitle() != null && this.getTitle().toLowerCase().contains(title.toLowerCase())) {
            return true;
        }
        return false;
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

}