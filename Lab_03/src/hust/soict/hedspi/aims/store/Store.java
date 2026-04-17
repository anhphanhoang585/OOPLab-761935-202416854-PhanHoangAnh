package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc itemsInStore[];
    private int qtyInStore;
    public static final int MAX_NUMBERS_INSTORE = 1000;

    public Store() {
        itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_INSTORE];
        qtyInStore = 0;
    }

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < MAX_NUMBERS_INSTORE) {
            itemsInStore[qtyInStore] = disc;
            qtyInStore++;
            System.out.println("The disc \"" + disc.getTitle() + "\" has been added to the store.");
        } else {
            System.out.println("The store is full. Cannot add: " + disc.getTitle());
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == disc) {
                // Dịch chuyển các phần tử ở bên phải sang trái 1 bước để lấp khoảng trống
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null; // Xóa tham chiếu tới DVD ở phần tử cuối
                qtyInStore--;
                found = true;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed from the store.");
                break;
            }
        }
        if (!found) {
            System.out.println("The disc \"" + disc.getTitle() + "\" was not found in the store.");
        }
    }
}
