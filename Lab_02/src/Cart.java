public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    // 1. Phương thức gốc: Thêm 1 DVD
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
            
            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is full.");
            } else if (qtyOrdered >= MAX_NUMBERS_ORDERED - 2) {
                System.out.println("The cart is almost full.");
            }
        } else {
            System.out.println("The cart is already full. Cannot add: " + disc.getTitle());
        }
    }

    // --- TASK 14.1: Nạp chồng với tham số là MẢNG (Array) ---
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            addDigitalVideoDisc(disc); // Gọi lại phương thức thêm 1 đĩa để dùng chung logic
        }
    }

    // --- TASK 14.2: Nạp chồng với tham số là 2 DVD ---
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void searchById(int id) {
        
    }

    public void searchByTitle(String title) {
     
    }

    public void sortByTitle() {
        
    }

    public void sortByCost() {
        
    }

    public void placeOrder() {

    }

    // Task 13: Xóa DVD
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null; 
                qtyOrdered--;
                found = true;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("The disc \"" + disc.getTitle() + "\" was not found in the cart.");
        }
    }

    // Tính tổng tiền
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    // In giỏ hàng
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.printf("%d. %-20s - %.2f $\n", (i + 1), itemsOrdered[i].getTitle(), itemsOrdered[i].getCost());
        }
        System.out.printf("Total Cost: %.2f $\n", totalCost());
        System.out.println("***************************************************");
    }
}