package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc {
    // Task 16: Thêm thuộc tính lớp (static)
    private static int nbDigitalVideoDiscs = 0;

    // Task 10: Cập nhật các hàm khởi tạo (Constructors) để tự động gán ID
    
    // 1. Tạo đối tượng DVD theo tiêu đề (title)
    public DigitalVideoDisc(String title) {
        super();
        this.setTitle(title);
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }

    // 2. Tạo đối tượng DVD theo tiêu đề, danh mục và giá thành
    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }

    // 3. Tạo đối tượng DVD theo đạo diễn, danh mục, tiêu đề và giá thành
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super(director);
        this.setCategory(category);
        this.setTitle(title);
        this.setCost(cost);
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }

    // 4. Tạo đối tượng DVD bằng tất cả các thuộc tính
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(length, director);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
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

}