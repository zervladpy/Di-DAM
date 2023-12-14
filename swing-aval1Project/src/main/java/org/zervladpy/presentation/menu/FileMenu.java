package org.zervladpy.presentation.menu;

import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class FileMenu extends JMenu {

    private final JMenuItem exportData;
    private final JMenuItem importData;
    private final JMenuItem exitApp;

    public FileMenu() {
        super("File");
        exportData = new JMenuItem("Export Data");
        exportData.setAccelerator(KeyStroke.getKeyStroke('E', InputEvent.CTRL_DOWN_MASK));
        importData = new JMenuItem("Import Data");
        importData.setAccelerator(KeyStroke.getKeyStroke('I', InputEvent.CTRL_DOWN_MASK));
        exitApp = new JMenuItem("Exit");
        exitApp.setAccelerator(KeyStroke.getKeyStroke('X', InputEvent.CTRL_DOWN_MASK));

        build();
    }

    private void build() {

        add(exportData);
        add(importData);
        add(new JSeparator());
        add(exitApp);
    }

}
