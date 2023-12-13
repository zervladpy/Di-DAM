package org.zervladpy.presentation.toolbar;

import org.zervladpy.controller.listener.StringListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class TopMenuBar extends JPanel implements ActionListener {
    private final JButton jButtonHello;
    private final JButton jButtonGoodbye;
    private StringListener stringListener;
    public TopMenuBar() {
        jButtonHello = new JButton("Hello");
        jButtonHello.addActionListener(this);
        jButtonGoodbye = new JButton("GoodBye");
        jButtonGoodbye.addActionListener(this);

        buildUi();
    }

    private void buildUi() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(jButtonHello);
        add(jButtonGoodbye);
    }

    public void setListener(StringListener listener) {
        stringListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() instanceof JButton jButton) {
            if (stringListener != null) {
                stringListener.emit(jButton.getText() + System.lineSeparator());
            }
        }
    }
}
