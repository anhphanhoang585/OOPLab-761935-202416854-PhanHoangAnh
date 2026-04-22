package hust.soict.hedspi.test.cart;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.CompactDisc;

public class SortTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        // Add some media
        cart.addMedia(new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f));
        cart.addMedia(new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f));
        cart.addMedia(new DigitalVideoDisc("Aladdin", "Animation", 18.99f));
        cart.addMedia(new Book("Star Wars", "Education", 30.0f)); // Same title as DVD above, higher cost
        cart.addMedia(new Book("Aladdin", "Education", 15.0f)); // Same title, lower cost

        System.out.println("\nInitial Cart:");
        cart.print();

        System.out.println("\nSorting by Title then Cost:");
        cart.sortByTitle();

        System.out.println("\nSorting by Cost then Title:");
        cart.sortByCost();
    }
}
