package org.zervladpy.presentation.frame;

import org.zervladpy.presentation.panel.TextPanel;
import org.zervladpy.presentation.toolbar.TopMenuBar;
import org.zervladpy.utils.Constraints;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private final JPanel topMenuBar;
    private final JPanel textPanel;

    public MainFrame() {
        super(Constraints.APP_NAME);

        topMenuBar = new TopMenuBar();
        textPanel = new TextPanel();

        buildUid();
    }

    private void buildUid() {
        add(topMenuBar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);

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
