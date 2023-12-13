package org.zervladpy.presentation.frame;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        super("");

        setDefaults();
    }

    private void setDefaults() {
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

}
