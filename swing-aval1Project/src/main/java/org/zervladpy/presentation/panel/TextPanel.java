package org.zervladpy.presentation.panel;

import org.zervladpy.controller.event.FormEvent;
import org.zervladpy.controller.event.StringEvent;

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
    }

    public void append(StringEvent event) {
        textArea.append(event.getText());
    }

    public void append(FormEvent event) {
        textArea.append(event.toString());
    }

    public void reset() {
        textArea.setText("");
    }

}
