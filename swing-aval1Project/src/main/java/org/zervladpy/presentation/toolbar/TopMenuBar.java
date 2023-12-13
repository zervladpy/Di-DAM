package org.zervladpy.presentation.toolbar;

import javax.swing.*;
import java.awt.*;

public class TopMenuBar extends JPanel {

    private final JButton jButtonHello;
    private final JButton jButtonGoodbye;

    public TopMenuBar() {
        jButtonHello = new JButton("Hello");
        jButtonGoodbye = new JButton("GoodBye");

        buildUi();
    }

    private void buildUi() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(jButtonHello);
        add(jButtonGoodbye);
    }

}
