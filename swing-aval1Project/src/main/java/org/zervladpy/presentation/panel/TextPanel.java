package org.zervladpy.presentation.panel;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;

/**
 * Personalized JPanel for textArea
 * @see JPanel
 * */
public class TextPanel extends JPanel {
    private final JTextArea textArea;
    public TextPanel() {
        textArea = new JTextArea();
        buildUI();
    }

    private void buildUI() {
        // set Layout
        setLayout(new BorderLayout());

        add(new JScrollPane(textArea), BorderLayout.CENTER);
    };

    public void append(String text) {
        textArea.append(text);
    }

    public void reset() {
        textArea.setText("");
    }

}
