public class DigitalVideoDisc {
    // Task 8: Các thuộc tính (attributes)
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Task 16: Thêm thuộc tính lớp (static) và thuộc tính đối tượng (id)
    private static int nbDigitalVideoDiscs = 0;
    private int id;

    // Task 9: Các phương thức Getters
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    // Task 16: Thêm Getter cho id
    public int getId() {
        return id;
    }

    // Task 10: Cập nhật các hàm khởi tạo (Constructors) để tự động gán ID
    
    // 1. Tạo đối tượng DVD theo tiêu đề (title)
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // 2. Tạo đối tượng DVD theo danh mục, tiêu đề và giá thành
    public DigitalVideoDisc(String category, String title, float cost) {
        super();
        this.category = category;
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // 3. Tạo đối tượng DVD theo đạo diễn, danh mục, tiêu đề và giá thành
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // 4. Tạo đối tượng DVD bằng tất cả các thuộc tính
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Task 15: Setter cho title
    public void setTitle(String title) {
        this.title = title;
    }
}