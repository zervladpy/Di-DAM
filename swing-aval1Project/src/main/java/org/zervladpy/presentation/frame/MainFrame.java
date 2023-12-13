package org.zervladpy.presentation.frame;

import org.w3c.dom.Text;
import org.zervladpy.controller.listener.StringListener;
import org.zervladpy.presentation.panel.TextPanel;
import org.zervladpy.presentation.toolbar.TopMenuBar;
import org.zervladpy.utils.Constraints;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private final TopMenuBar topMenuBar;
    private final TextPanel textPanel;

    public MainFrame() {
        super(Constraints.APP_NAME);

        topMenuBar = new TopMenuBar();
        textPanel = new TextPanel();

        topMenuBar.setListener(textPanel::append);

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
