package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.store.Store;
import java.util.Scanner;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initData();
        mainMenu();
    }

    public static void initData() {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        Book book1 = new Book("Java Programming", "Education", 29.99f);
        CompactDisc cd1 = new CompactDisc("Greatest Hits", "Pop", "Various", 60, 15.5f, "Many Artists");
        cd1.addTrack(new Track("Song 1", 3));
        cd1.addTrack(new Track("Song 2", 4));

        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(book1);
        store.addMedia(cd1);
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void mainMenu() {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    viewCart();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void viewStore() {
        System.out.println("\n--- Store ---");
        for (Media m : store.getItemsInStore()) {
            System.out.println(m.toString());
        }
        while (true) {
            storeMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    seeMediaDetails();
                    break;
                case 2:
                    addMediaToCart();
                    break;
                case 3:
                    playMedia();
                    break;
                case 4:
                    viewCart();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void seeMediaDetails() {
        System.out.print("Enter the title of the media: ");
        String title = scanner.nextLine();
        Media m = store.getMedia(title);
        if (m == null) {
            System.out.println("Media not found.");
            return;
        }
        System.out.println(m.toString());
        while (true) {
            mediaDetailsMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    cart.addMedia(m);
                    break;
                case 2:
                    if (m instanceof Playable) {
                        ((Playable) m).play();
                    } else {
                        System.out.println("This media is not playable.");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void addMediaToCart() {
        System.out.print("Enter the title of the media to add: ");
        String title = scanner.nextLine();
        Media m = store.getMedia(title);
        if (m != null) {
            cart.addMedia(m);
            // Display number of DVDs in cart if the added media is a DVD
            if (m instanceof DigitalVideoDisc) {
                // (Optional requirement check)
                System.out.println("A DVD has been added to the cart.");
            }
        } else {
            System.out.println("Media not found.");
        }
    }

    public static void playMedia() {
        System.out.print("Enter the title of the media to play: ");
        String title = scanner.nextLine();
        Media m = store.getMedia(title);
        if (m != null) {
            if (m instanceof Playable) {
                ((Playable) m).play();
            } else {
                System.out.println("This media is not playable.");
            }
        } else {
            System.out.println("Media not found.");
        }
    }

    public static void updateStore() {
        System.out.println("1. Add media to store");
        System.out.println("2. Remove media from store");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) {
            // Complex case, simplify for now or implement briefly
            System.out.print("Enter category (1. Book, 2. CD, 3. DVD): ");
            int type = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter title: ");
            String title = scanner.nextLine();
            if (type == 1) store.addMedia(new Book(title));
            else if (type == 2) store.addMedia(new CompactDisc(title));
            else if (type == 3) store.addMedia(new DigitalVideoDisc(title));
        } else if (choice == 2) {
            System.out.print("Enter title: ");
            String title = scanner.nextLine();
            Media m = store.getMedia(title);
            if (m != null) store.removeMedia(m);
            else System.out.println("Not found.");
        }
    }

    public static void viewCart() {
        cart.print();
        while (true) {
            cartMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Filter by (1. ID, 2. Title): ");
                    int filterType = scanner.nextInt();
                    scanner.nextLine();
                    if (filterType == 1) {
                        System.out.print("Enter ID: ");
                        cart.searchById(scanner.nextInt());
                    } else {
                        System.out.print("Enter Title: ");
                        cart.searchByTitle(scanner.nextLine());
                    }
                    break;
                case 2:
                    System.out.print("Sort by (1. Title, 2. Cost): ");
                    int sortType = scanner.nextInt();
                    scanner.nextLine();
                    if (sortType == 1) cart.sortByTitle();
                    else cart.sortByCost();
                    break;
                case 3:
                    System.out.print("Enter title to remove: ");
                    String removeTitle = scanner.nextLine();
                    Media m = cart.getMedia(removeTitle);
                    if (m != null) cart.removeMedia(m);
                    else System.out.println("Not found.");
                    break;
                case 4:
                    System.out.print("Enter title to play: ");
                    String playTitle = scanner.nextLine();
                    Media pm = cart.getMedia(playTitle);
                    if (pm instanceof Playable) ((Playable) pm).play();
                    else System.out.println("Not playable.");
                    break;
                case 5:
                    cart.placeOrder();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
}
