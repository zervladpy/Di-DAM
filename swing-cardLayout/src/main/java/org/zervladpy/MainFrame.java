package org.zervladpy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MainFrame extends JFrame implements ItemListener {

    private JPanel cards;
    private final String BUTTON_PANEL = "Card with JButtons";
    private final String TEXT_PANEL = "Card with JTextField";
    private JComboBox jComboBox;
    private JTextField jTextField;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;

    public MainFrame() {
        super("Card Layout");

        // Creating both cards
        JPanel jButtonCard = new JPanel();
        jButton1 = new JButton("Button 1");

        jButtonCard.add(jButton1);
        jButton2 = new JButton("Button 2");
        jButtonCard.add(jButton2);

        jButton3 = new JButton("Button 3");
        jButtonCard.add(jButton3);

        JPanel jTextCard = new JPanel();
        jTextField = new JTextField();
        jTextField.setEditable(false);
        jTextField.setText("JText Field");
        jTextCard.add(jTextField);

        cards = new JPanel(new CardLayout());
        cards.add(jButtonCard, BUTTON_PANEL);
        cards.add(jTextCard, TEXT_PANEL);

        JPanel comboBoxPanel = new JPanel();
        String[] comboBoxItems = { BUTTON_PANEL, TEXT_PANEL };
        jComboBox = new JComboBox(comboBoxItems);
        jComboBox.addItemListener(this);
        comboBoxPanel.add(jComboBox);

        add(comboBoxPanel, BorderLayout.PAGE_START);
        add(cards, BorderLayout.CENTER);

        setDefaults();
    }

    private void setDefaults() {
        pack();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent event) {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String) event.getItem());
    }
}
