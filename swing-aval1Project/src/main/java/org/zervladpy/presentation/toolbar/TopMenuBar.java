package org.zervladpy.presentation.toolbar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TopMenuBar extends JToolBar implements ActionListener {
    private final JButton jButtonHello;
    private final JButton jButtonGoodbye;

    public TopMenuBar() {
        jButtonHello = new JButton("import");
        jButtonHello.setActionCommand("load");
        jButtonHello.addActionListener(this);

        jButtonGoodbye = new JButton("save");
        jButtonGoodbye.setActionCommand("save");
        jButtonGoodbye.addActionListener(this);

        buildUi();
    }

    private void buildUi() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(jButtonHello);
        add(jButtonGoodbye);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() instanceof JButton jButton) {

        }
    }
}
