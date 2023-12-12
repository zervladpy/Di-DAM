package org.zervladpy;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class MainFrame extends JFrame {
    private JFormattedTextField textField;
    private MaskFormatter numbersMask;
    public MainFrame() {
        super("Postal Code Formatter");

        try {
            numbersMask = new MaskFormatter("######");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        textField = new JFormattedTextField(numbersMask);

        add(textField);

        setDefaults();
    }

    private void setDefaults() {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(200, 100);
        setVisible(true);
    }

}
