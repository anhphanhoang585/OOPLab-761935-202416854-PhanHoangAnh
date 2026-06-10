package hust.soict.hedspi.aims.screen.customer;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.aims.screen.customer.controller.ViewStoreController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestViewStoreScreen extends Application {

    private static Store store = new Store();
    private static Cart cart = new Cart();

    @Override
    public void start(Stage primaryStage) throws Exception {
        final String STORE_FXML_FILE_PATH = "/hust/soict/hedspi/aims/screen/customer/view/Store.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
        ViewStoreController viewStoreController = new ViewStoreController(store, cart);
        fxmlLoader.setController(viewStoreController);
        Parent root = fxmlLoader.load();
        
        primaryStage.setTitle("AIMS Store");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Mock data
        // 1. DVDs (some valid, some invalid length)
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Harry Potter and the Philosopher's Stone (2001)", "Animation", "Chris Columbus", 152, 3.0f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Harry Potter and the Chamber of Secrets (2002)", "Science Fiction", "Chris Columbus", 161, 3.5f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Harry Potter and the Prisoner of Azkaban (2004)", "Animation", "Alfonso Cuarón", 0, 5.0f); // Length 0 -> triggers PlayerException!
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Harry Potter and the Goblet of Fire (2005)", "Science Fiction", "Mike Newell", 157, 4.5f);
        
        // 2. Books
        Book book1 = new Book("Green Eggs and Ham", "Children", 3.3f);
        book1.addAuthor("Dr. Seuss");
        Book book2 = new Book("The Hobbit", "Fantasy", 8.5f);
        book2.addAuthor("J.R.R. Tolkien");

        // 3. CDs
        CompactDisc cd1 = new CompactDisc("Greatest Hits CD", "Pop", "Various", 0, 7.0f, "Many Artists");
        cd1.addTrack(new Track("Song A", 3));
        cd1.addTrack(new Track("Song B", 0)); // Length 0 -> triggers PlayerException!
        
        CompactDisc cd2 = new CompactDisc("Hello CD", "Pop", "Adele", 45, 6.3f, "Adele");
        cd2.addTrack(new Track("Hello", 4));
        cd2.addTrack(new Track("Someone Like You", 5));

        // Add to store
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(dvd4);
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(cd1);
        store.addMedia(cd2);

        launch(args);
    }
}
