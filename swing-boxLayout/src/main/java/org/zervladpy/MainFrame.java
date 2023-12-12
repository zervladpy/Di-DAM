package org.zervladpy;

import javax.swing.*;

public class MainFrame extends JFrame {

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private BoxLayout boxLayout;
    // Needed Container to set the BoxLayout properly
    private JPanel jPanel;
    public MainFrame() {
        super("Box Layout");



        jButton1 = new JButton("Button 1");
        jButton2 = new JButton("Button 2");
        jButton3 = new JButton("Button 3");
        jButton4 = new JButton("Long-Named Button 4");
        jButton5 = new JButton("5");

        jPanel = new JPanel();
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);
        jPanel.add(jButton5);


        // BoxLayout(Component target, int axis)
        boxLayout = new BoxLayout(jPanel, BoxLayout.Y_AXIS);
        // Set layout
        jPanel.setLayout(boxLayout);

        add(jPanel);
        setDefaults();
    }

    private void setDefaults(){
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

}
