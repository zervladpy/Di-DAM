package org.zervladpy.presentation.frame;

import org.zervladpy.presentation.panel.TextPanel;
import org.zervladpy.utils.Constraints;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        super(Constraints.APP_NAME);

        add(new TextPanel());

        setDefaults();
    }

    private void setDefaults() {
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(600, 500);
        setResizable(false);
        setVisible(true);
    }

}
