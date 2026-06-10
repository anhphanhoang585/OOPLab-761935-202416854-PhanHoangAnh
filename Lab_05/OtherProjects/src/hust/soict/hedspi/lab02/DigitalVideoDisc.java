package hust.soict.hedspi.lab02;
public class DigitalVideoDisc {
    // Task 8: CÃ¡c thuá»™c tÃ­nh (attributes)
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Task 16: ThÃªm thuá»™c tÃ­nh lá»›p (static) vÃ  thuá»™c tÃ­nh Ä‘á»‘i tÆ°á»£ng (id)
    private static int nbDigitalVideoDiscs = 0;
    private int id;

    // Task 9: CÃ¡c phÆ°Æ¡ng thá»©c Getters
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

    // Task 16: ThÃªm Getter cho id
    public int getId() {
        return id;
    }

    // Task 10: Cáº­p nháº­t cÃ¡c hÃ m khá»Ÿi táº¡o (Constructors) Ä‘á»ƒ tá»± Ä‘á»™ng gÃ¡n ID
    
    // 1. Táº¡o Ä‘á»‘i tÆ°á»£ng DVD theo tiÃªu Ä‘á» (title)
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // 2. Táº¡o Ä‘á»‘i tÆ°á»£ng DVD theo danh má»¥c, tiÃªu Ä‘á» vÃ  giÃ¡ thÃ nh
    public DigitalVideoDisc(String category, String title, float cost) {
        super();
        this.category = category;
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // 3. Táº¡o Ä‘á»‘i tÆ°á»£ng DVD theo Ä‘áº¡o diá»…n, danh má»¥c, tiÃªu Ä‘á» vÃ  giÃ¡ thÃ nh
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // 4. Táº¡o Ä‘á»‘i tÆ°á»£ng DVD báº±ng táº¥t cáº£ cÃ¡c thuá»™c tÃ­nh
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
