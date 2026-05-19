package hust.soict.hedspi.test.store;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;
public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        // Ká»‹ch báº£n thÃªm cÃ¡c thá»ƒ loáº¡i Ä‘Ä©a vÃ o cá»­a hÃ ng
        System.out.println("--- Test addDVD ---");
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);

        // Ká»‹ch báº£n xÃ³a DVD khá»i cá»­a hÃ ng
        System.out.println("\n--- Test removeDVD ---");
        System.out.println("> Äang thá»­ xÃ³a Ä‘Ä©a Star Wars (cÃ³ tá»“n táº¡i):");
        store.removeMedia(dvd2);
        
        System.out.println("\n> Äang thá»­ xÃ³a láº¡i Ä‘Ä©a Star Wars (khÃ´ng cÃ²n tá»“n táº¡i ná»¯a):");
        store.removeMedia(dvd2);
    }
}

