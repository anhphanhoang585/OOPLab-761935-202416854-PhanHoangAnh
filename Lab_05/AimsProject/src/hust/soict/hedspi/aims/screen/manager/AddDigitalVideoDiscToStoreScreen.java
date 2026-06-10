package hust.soict.hedspi.aims.screen.manager;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {
    private JTextField tfDirector;
    private JTextField tfLength;

    public AddDigitalVideoDiscToStoreScreen(Store store) {
        super(store);
        setTitle("Add DVD to Store");
    }

    @Override
    protected void addSpecificFields(JPanel inputPanel) {
        inputPanel.add(new JLabel("Director: "));
        tfDirector = new JTextField();
        inputPanel.add(tfDirector);

        inputPanel.add(new JLabel("Length: "));
        tfLength = new JTextField();
        inputPanel.add(tfLength);
    }

    @Override
    protected void clearSpecificFields() {
        tfDirector.setText("");
        tfLength.setText("");
    }

    @Override
    protected void addItemToStore() {
        try {
            String title = tfTitle.getText();
            String category = tfCategory.getText();
            float cost = Float.parseFloat(tfCost.getText());
            String director = tfDirector.getText();
            int length = Integer.parseInt(tfLength.getText());
            
            DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
            store.addMedia(dvd);
        } catch (NumberFormatException e) {
            System.out.println("Invalid format for cost or length");
        }
    }
}
