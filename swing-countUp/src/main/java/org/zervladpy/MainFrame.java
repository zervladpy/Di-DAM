package org.zervladpy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

    private JTextField counterTextField;
    private String counterText;
    private JButton counterIncreaseJBtn;

    public MainFrame() {
        super("Counter App");

        counterText = "0";
        counterTextField = new JTextField(counterText);
        counterTextField.setEnabled(false);

        counterIncreaseJBtn = new JButton("+");
        counterIncreaseJBtn.addActionListener((ActionEvent event) -> {
            if (event.getSource() instanceof JButton jButton) {
                try {

                    int counter = Integer.parseInt(counterText) + 1;
                    counterText = String.valueOf(counter);
                    counterTextField.setText(counterText);

                } catch (NumberFormatException ignored) {}
            }
        });

        add(counterTextField, BorderLayout.CENTER);
        add(counterIncreaseJBtn, BorderLayout.LINE_END);

        /// Default operations
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

}
