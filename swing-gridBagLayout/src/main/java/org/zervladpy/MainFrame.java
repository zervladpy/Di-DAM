package org.zervladpy;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private GridBagLayout gridBagLayout;

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;

    public MainFrame() {
        super("Grid Bag Layout");

        // Create new GridBag Constraints
        GridBagConstraints constraints = new GridBagConstraints();

        gridBagLayout = new GridBagLayout();

        setLayout(gridBagLayout);

        jButton1 = new JButton("Button 1");
        jButton2 = new JButton("Button 2");
        jButton3 = new JButton("Button 3");
        jButton4 = new JButton("Long-Named Button 4");
        jButton5 = new JButton("5");

        // add elements
        constraints.gridx = 0;
        constraints.gridy = 0;
        // Fill horizontally
        constraints.fill = GridBagConstraints.HORIZONTAL;
        // Occupy this width in grids
        constraints.gridwidth = 3;
        add(jButton1, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        // REMEMBER TO RESET
        constraints.gridwidth = 0;
        constraints.fill = GridBagConstraints.NONE;
        add(jButton2, constraints);

        constraints.gridx = 2;
        constraints.gridy = 1;
        add(jButton3, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        add(jButton4, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        add(jButton4, constraints);

        setDefaults();
    }

    private void setDefaults() {
        pack();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
