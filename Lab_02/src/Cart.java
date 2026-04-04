public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else { System.out.println("The cart is almost full"); }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            // Kiểm tra xem đĩa trong mảng có trùng với đĩa muốn xóa không
            if (itemsOrdered[i] == disc) {
                // Khi tìm thấy, thực hiện dồn các đĩa phía sau lên trước 1 vị trí
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                // Xóa bỏ phần tử cuối cùng sau khi đã dồn
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--; // Giảm số lượng đĩa hiện có trong giỏ
                found = true;
                System.out.println("The disc has been removed.");
                break; // Thoát vòng lặp vì đã xóa xong
            }
        }
        if (!found) {
            System.out.println("The disc was not found in the cart.");
        }
    }
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}