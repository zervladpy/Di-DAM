package org.zervladpy;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;

    public MainFrame() {
        super("Flow Layout");

        jButton1 = new JButton("Button 1");
        jButton2 = new JButton("Button 2");
        jButton3 = new JButton("Button 3");
        jButton4 = new JButton("Long-Named Button 4");
        jButton5 = new JButton("5");


        add(jButton1);
        add(jButton2);
        add(jButton3);
        add(jButton4);
        add(jButton5);

        setLayout(new FlowLayout());

        setDefaults();
    }

    /**
     * Default operations on MainFrame
     * */
    private void setDefaults() {
        pack();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
