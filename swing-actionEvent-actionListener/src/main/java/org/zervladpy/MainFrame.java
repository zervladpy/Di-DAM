package org.zervladpy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {


    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    public MainFrame() {
        super("ActionEvent | ActionListener");

        jButton1 = new JButton("Button 1");
        jButton2 = new JButton("Button 2");
        jButton3 = new JButton("Button 3");

        add(jButton1, BorderLayout.LINE_START);
        jButton1.addActionListener((ActionEvent event) -> {
            if (event.getSource() instanceof JButton jButton) {
                setTitle(jButton.getText());
            }
        });
        add(jButton2, BorderLayout.CENTER);
        jButton2.addActionListener((ActionEvent event) -> {
            if (event.getSource() instanceof JButton jButton) {
                setTitle(jButton.getText());
            }
        });
        add(jButton3, BorderLayout.LINE_END);
        jButton3.addActionListener((ActionEvent event) -> {
            if (event.getSource() instanceof JButton jButton) {
                setTitle(jButton.getText());
            }
        });

        setSize(300, 200);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setLocationRelativeTo(null);

        setVisible(true);
    }

}
