package hust.soict.hedspi.test.media;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;
import java.util.List;

public class PolymorphismTest {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();

        // Create some media objects
        CompactDisc cd = new CompactDisc("CD Title", "Pop", "Music Director", 45, 15.0f, "Pop Artist");
        DigitalVideoDisc dvd = new DigitalVideoDisc("DVD Title", "Action", "Movie Director", 120, 20.0f);
        Book book = new Book("Book Title", "Education", 10.0f);

        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

        // Iterate and print using toString() - demonstrating polymorphism
        System.out.println("\n--- demonstrating Polymorphism with toString() ---");
        for (Media m : mediae) {
            System.out.println(m.toString());
        }
    }
}
