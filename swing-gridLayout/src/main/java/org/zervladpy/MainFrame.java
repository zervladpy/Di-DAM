package org.zervladpy;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private  GridLayout gridLayout;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;

    public MainFrame() {

        /// GridLayout(int rows, int cols)
        gridLayout = new GridLayout(3, 2);
        // Sets Horizontal Gaps Between the columns
        gridLayout.setHgap(10);
        // Sets Vertical Gaps Between the rows
        gridLayout.setVgap(10);
        // Apply the Layout
        setLayout(gridLayout);



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

        setDefaults();
    }

    private void setDefaults() {
        pack();
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

}
