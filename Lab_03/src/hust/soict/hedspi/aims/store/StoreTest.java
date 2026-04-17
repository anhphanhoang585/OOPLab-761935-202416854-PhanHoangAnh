package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        // Kịch bản thêm các thể loại đĩa vào cửa hàng
        System.out.println("--- Test addDVD ---");
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Kịch bản xóa DVD khỏi cửa hàng
        System.out.println("\n--- Test removeDVD ---");
        System.out.println("> Đang thử xóa đĩa Star Wars (có tồn tại):");
        store.removeDVD(dvd2);
        
        System.out.println("\n> Đang thử xóa lại đĩa Star Wars (không còn tồn tại nữa):");
        store.removeDVD(dvd2); 
    }
}
