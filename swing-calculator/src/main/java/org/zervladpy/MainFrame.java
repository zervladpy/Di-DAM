package org.zervladpy;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JTextField displayField;
    private JButton divideButton;
    private JButton multiplyButton;
    private JButton subtractButton;
    private JButton sumButton;
    private JButton equalButton;
    private JButton decimalButton;
    private JButton jButton0;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;

    public MainFrame() {
        super("Calculator");
        displayField = new  JTextField();
        displayField.setEditable(false);
        add(displayField, BorderLayout.PAGE_START);

        JPanel buttonPanel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        buttonPanel.setLayout(gridBagLayout);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 1.0;
        constraints.weightx = 1.0;

        jButton7 = new JButton("7");
        constraints.gridx = 0;
        constraints.gridy = 0;
        buttonPanel.add(jButton7,constraints);
        jButton8 = new JButton("8");
        constraints.gridx = 1;
        buttonPanel.add(jButton8, constraints);
        jButton9 = new JButton("9");
        constraints.gridx = 2;
        buttonPanel.add(jButton9, constraints);
        divideButton = new JButton("/");
        constraints.gridx = 3;
        buttonPanel.add(divideButton, constraints);

        jButton4 = new JButton("4");
        constraints.gridx = 0;
        constraints.gridy = 1;
        buttonPanel.add(jButton4,constraints);
        jButton5 = new JButton("5");
        constraints.gridx = 1;
        buttonPanel.add(jButton5, constraints);
        jButton6 = new JButton("6");
        constraints.gridx = 2;
        buttonPanel.add(jButton6, constraints);
        multiplyButton = new JButton("*");
        constraints.gridx = 3;
        buttonPanel.add(multiplyButton, constraints);

        jButton1 = new JButton("1");
        constraints.gridx = 0;
        constraints.gridy = 2;
        buttonPanel.add(jButton1,constraints);
        jButton2 = new JButton("2");
        constraints.gridx = 2;
        buttonPanel.add(jButton2, constraints);
        jButton3 = new JButton("3");
        constraints.gridx = 1;
        buttonPanel.add(jButton3, constraints);
        subtractButton = new JButton("-");
        constraints.gridx = 3;
        buttonPanel.add(subtractButton, constraints);

        jButton0 = new JButton("0");
        constraints.gridx = 0;
        constraints.gridy = 3;
        buttonPanel.add(jButton0,constraints);
        decimalButton = new JButton(",");
        constraints.gridx = 1;
        buttonPanel.add(decimalButton, constraints);
        equalButton = new JButton("=");
        constraints.gridx = 2;
        buttonPanel.add(equalButton, constraints);
        sumButton = new JButton("+");
        constraints.gridx = 3;
        buttonPanel.add(sumButton, constraints);

        add(buttonPanel, BorderLayout.CENTER);
        setDefaults();
    }

    private void setDefaults() {
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

}
