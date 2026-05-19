package hust.soict.hedspi.aims.screen.manager;

import javax.swing.JPanel;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.store.Store;

public class AddBookToStoreScreen extends AddItemToStoreScreen {

    public AddBookToStoreScreen(Store store) {
        super(store);
        setTitle("Add Book to Store");
    }

    @Override
    protected void addSpecificFields(JPanel inputPanel) {
        // No specific fields for Book for simplicity, 
        // as the constructor Book(title, category, cost) is enough.
    }

    @Override
    protected void clearSpecificFields() {
        // Nothing to clear
    }

    @Override
    protected void addItemToStore() {
        try {
            String title = tfTitle.getText();
            String category = tfCategory.getText();
            float cost = Float.parseFloat(tfCost.getText());
            
            Book book = new Book(title, category, cost);
            store.addMedia(book);
        } catch (NumberFormatException e) {
            // "you don't need to do data type validation yet" according to instructions
            // but catching it to avoid crash just in case
            System.out.println("Invalid cost format");
        }
    }
}
