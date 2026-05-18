package hust.soict.hedspi.aims.screen.manager;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.hedspi.aims.store.Store;

public abstract class AddItemToStoreScreen extends JFrame {
    protected Store store;
    protected JTextField tfTitle;
    protected JTextField tfCategory;
    protected JTextField tfCost;
    protected JPanel centerPanel;

    public AddItemToStoreScreen(Store store) {
        this.store = store;

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createMenuBar(), BorderLayout.NORTH);
        
        centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(0, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        inputPanel.add(new JLabel("Title: "));
        tfTitle = new JTextField();
        inputPanel.add(tfTitle);
        
        inputPanel.add(new JLabel("Category: "));
        tfCategory = new JTextField();
        inputPanel.add(tfCategory);
        
        inputPanel.add(new JLabel("Cost: "));
        tfCost = new JTextField();
        inputPanel.add(tfCost);
        
        // Let subclasses add their specific fields
        addSpecificFields(inputPanel);
        
        centerPanel.add(inputPanel, BorderLayout.CENTER);
        
        JPanel buttonPanel = new JPanel();
        JButton btnAdd = new JButton("Add to Store");
        btnAdd.addActionListener(e -> {
            addItemToStore();
            JOptionPane.showMessageDialog(this, "Item added to store successfully!");
            tfTitle.setText("");
            tfCategory.setText("");
            tfCost.setText("");
            clearSpecificFields();
        });
        buttonPanel.add(btnAdd);
        
        centerPanel.add(buttonPanel, BorderLayout.SOUTH);
        cp.add(centerPanel, BorderLayout.CENTER);

        setTitle("Add Item to Store");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");

        JMenuItem viewStore = new JMenuItem("View store");
        viewStore.addActionListener(e -> {
            new StoreManagerScreen(store);
            dispose();
        });
        menu.add(viewStore);

        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem addBook = new JMenuItem("Add Book");
        JMenuItem addCD = new JMenuItem("Add CD");
        JMenuItem addDVD = new JMenuItem("Add DVD");

        addBook.addActionListener(e -> {
            new AddBookToStoreScreen(store);
            dispose();
        });
        addCD.addActionListener(e -> {
            new AddCompactDiscToStoreScreen(store);
            dispose();
        });
        addDVD.addActionListener(e -> {
            new AddDigitalVideoDiscToStoreScreen(store);
            dispose();
        });

        smUpdateStore.add(addBook);
        smUpdateStore.add(addCD);
        smUpdateStore.add(addDVD);
        menu.add(smUpdateStore);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    protected abstract void addSpecificFields(JPanel inputPanel);
    protected abstract void clearSpecificFields();
    protected abstract void addItemToStore();
}
