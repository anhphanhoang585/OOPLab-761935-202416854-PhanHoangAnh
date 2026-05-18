package hust.soict.hedspi.aims.screen.manager;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.store.Store;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {
    private JTextField tfDirector;
    private JTextField tfLength;
    private JTextField tfArtist;

    public AddCompactDiscToStoreScreen(Store store) {
        super(store);
        setTitle("Add CD to Store");
    }

    @Override
    protected void addSpecificFields(JPanel inputPanel) {
        inputPanel.add(new JLabel("Director: "));
        tfDirector = new JTextField();
        inputPanel.add(tfDirector);

        inputPanel.add(new JLabel("Length: "));
        tfLength = new JTextField();
        inputPanel.add(tfLength);

        inputPanel.add(new JLabel("Artist: "));
        tfArtist = new JTextField();
        inputPanel.add(tfArtist);
    }

    @Override
    protected void clearSpecificFields() {
        tfDirector.setText("");
        tfLength.setText("");
        tfArtist.setText("");
    }

    @Override
    protected void addItemToStore() {
        try {
            String title = tfTitle.getText();
            String category = tfCategory.getText();
            float cost = Float.parseFloat(tfCost.getText());
            String director = tfDirector.getText();
            int length = Integer.parseInt(tfLength.getText());
            String artist = tfArtist.getText();
            
            CompactDisc cd = new CompactDisc(title, category, director, length, cost, artist);
            store.addMedia(cd);
        } catch (NumberFormatException e) {
            System.out.println("Invalid format for cost or length");
        }
    }
}
