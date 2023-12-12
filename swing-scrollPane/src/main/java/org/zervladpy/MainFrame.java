package org.zervladpy;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final JTextArea jTextArea;
    public MainFrame() {
        super("JTextArea with JScrollPane");

        jTextArea = new JTextArea(5, 20);
        jTextArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(jTextArea);

        add(scrollPane, BorderLayout.CENTER);
        pack();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
